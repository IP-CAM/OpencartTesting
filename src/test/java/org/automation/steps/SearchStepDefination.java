package org.automation.steps;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.automation.core.Browser;
import org.automation.core.TestLogger;
import org.automation.pages.HomePage;
import org.automation.pages.ResultPage;
import org.junit.*;
import org.junit.rules.TestWatcher;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class SearchStepDefination {
    private static final Logger logger = LoggerFactory.getLogger(SearchStepDefination.class);
    private WebDriver driver;
    private HomePage home;
    private ResultPage resultPage;
    private long start, end;

    @Rule
    public TestWatcher testLogger = new TestLogger(logger);

    @BeforeClass
    public static void init(){

    }

    @AfterClass
    public static void cleanup(){
        Browser.close();
    }

    @After
    public void finish(){

        System.out.println("I was called ");
    }
    @Test
    @Given("^I open (.+) browser$")
    public void i_open_browser(String nameOfBrowser) throws Throwable {
       driver = Browser.getInstance(nameOfBrowser);
    }

    @Test
    @When("^I type (.+) and press enter$")
    public void i_type_http_demo_opencart_com_and_press_enter(String url) throws Throwable {
        home = new HomePage(driver);
        //home.setUrl(url); =>
        start = System.currentTimeMillis();
        home.open(url);
    }

    @Test
    @Then("^I can see page loaded with title \"([^\"]*)\"$")
    public void i_can_see_page_loaded_with_title(String arg1) throws Throwable {
        Assert.assertEquals(arg1,home.getTitle());
    }
    @Test
    @Then("^I can see invalid search title with \"([^\"]*)\" and message \"([^\"]*)\"$")
    public void i_can_see_invalid_search_title_with_and_message(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(arg1,resultPage.getTitle());
        Assert.assertEquals(arg2, resultPage.invalid_search_result_message.getText());
        end= System.currentTimeMillis();
    }
    @Test
    @Then("^I can see search results with title \"([^\"]*)\"$")
    public void i_can_see_search_results_with_title(String arg1) throws Throwable {
        Assert.assertEquals(arg1,resultPage.getTitle());
        end= System.currentTimeMillis();
    }
    @Test
    @And("^I type \"([^\"]*)\" in search box And I click search button$")
    public void i_type_in_Iphone_in_search_box_And_I_click_search(String word) throws Throwable {

        home.search.textBox.clear();
        home.search.textBox.sendKeys(word);
        home.search.button.click();
        resultPage = new ResultPage(driver);
    }


    @Test
    @And("^I can see the search should not take more than (\\d+) second$")
    public void i_can_see_the_search_should_not_take_more_than_second(int arg1) throws Throwable {
        Assert.assertTrue((end-start)<(arg1*1000));
    }
    @Test
    @Then("^I quit browser$")
    public void i_quit_browser() throws Throwable {
        Browser.close();
    }
}
