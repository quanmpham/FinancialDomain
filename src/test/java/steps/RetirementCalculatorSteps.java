package steps;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.RetirementCalculatorPage;
import page.UserInputPage;
import util.BrowserFactory;

public class RetirementCalculatorSteps extends TestBase {
	WebDriver driver;
	UserInputPage userInputPage;
	RetirementCalculatorPage retirementCalculatorPage;
	Random rnd = new Random();

	@Before
	public void startEverything() {
		driver = BrowserFactory.startBrowser();
		userInputPage = PageFactory.initElements(driver, UserInputPage.class);
		retirementCalculatorPage = PageFactory.initElements(driver, RetirementCalculatorPage.class);
	}

	@Given("^a user already on the website$")
	public void a_user_already_on_the_website() throws InterruptedException {
		retirementCalculatorPage.goTo401kCalculatorPage();
	}

	@When("^user submits \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\", and \"([^\"]*)\"$")
	public void user_submits_and(String age, String income, String balance, String contribution, String ematch,
			String ematchend) {
		userInputPage.enterUserInput(age, income, balance, contribution, ematch, ematchend);
	}

	@When("^clicks calculate$")
	public void clicks_calculate() {
		userInputPage.clickCalculateButton();
	}

	@Then("^the (\\d+)k balance should be correct$")
	public void the_k_balance_should_be_correct(int arg1) throws Exception {
		By totalLocator = By.xpath("//div/p/font/b[1]");
		retirementCalculatorPage.waitForTotal();
		boolean status = driver.findElement(totalLocator).isDisplayed();
		if (status == true) {
			System.out.println("Able to locate the total!");
		} else {
			System.out.println("Test Fail! :(");
		}
		String displayedTotal = driver.findElement(totalLocator).getText();
		System.out.println("Actual Total 401k when retired: " + displayedTotal);
		screenShot(driver, "c:\\ScreenShotFile\\RetirementCalculatorPage"+ rnd.nextInt(999) +".jpg");
	}

	@After
	public void closeEverything() {
		driver.close();
		driver.quit();
	}

}
