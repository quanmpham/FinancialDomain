package steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import page.InvestmentCalculatorPage;
import util.BrowserFactory;

public class InvestmentCalculatorSteps {
	WebDriver driver;
	InvestmentCalculatorPage investmentCalculatorPage;
	String userInputAmount;

	@Before
	public void beforeRun() {
		driver = BrowserFactory.startBrowser();
		investmentCalculatorPage = PageFactory.initElements(driver, InvestmentCalculatorPage.class);
	}

	@Given("^a user already on the investment calculator website$")
	public void a_user_already_on_the_investment_calculator_website() {
		investmentCalculatorPage.goToInvestmentCalculatorPage();
	}

	@When("^user submits \"([^\"]*)\", \"([^\"]*)\", and \"([^\"]*)\"$")
	public void user_submits_and(String startingAmount, String afterYear, String returnRate) {
		userInputAmount = startingAmount;
		investmentCalculatorPage.investmentInput(startingAmount, afterYear, returnRate);
	}

	@Then("^the annual schedule list should display$")
	public void the_annual_schedule_list_should_display() {
		investmentCalculatorPage.waitForList();
		boolean status = isDataFoundInList(investmentCalculatorPage.getColumnDataFor("Start Principal"),
				userInputAmount);
//		List<String> dataList = investmentCalculatorPage.getColumnDataFor("Start Principal");
		System.out.println("User input amount: " + userInputAmount);
		Assert.assertTrue(status);
	}

	private boolean isDataFoundInList(List<String> columnDataList, String userInputAmount) {
		for (int i = 0; i < columnDataList.size(); i++) {
			if (columnDataList.get(i).equalsIgnoreCase(userInputAmount)) {
				return true;
			}
		}
		return false;
	}

}
