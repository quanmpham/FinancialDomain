package page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class InvestmentCalculatorPage extends BasePage {
	WebDriver driver;

	public InvestmentCalculatorPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.LINK_TEXT, using = "Investment Calculator")
	WebElement InvestmentCalculatorModule;
	@FindBy(how = How.ID, using = "cstartingprinciplev")
	WebElement StartingAmountField;
	@FindBy(how = How.ID, using = "cyearsv")
	WebElement YearAfterField;
	@FindBy(how = How.ID, using = "cinterestratev")
	WebElement InterestRateField;
	@FindBy(how = How.XPATH, using = "//input[@value='Calculate']")
	WebElement CalculateButton;
	@FindBy(how = How.XPATH, using = "//table/descendant::td/*[contains(text(),'End Balance')]")
	WebElement EndBalanceResult;
	@FindBy(how = How.XPATH, using = "//div[@id='camortizationschdis']/child::*[contains(text(),'Annual Schedule')]")
	WebElement AnnualScheduleList;

	public void goToInvestmentCalculatorPage() {
		InvestmentCalculatorModule.click();
	}

	public void investmentInput(String startingAmount, String afterYear, String returnRate) {
		StartingAmountField.clear();
		StartingAmountField.sendKeys(startingAmount);
		YearAfterField.clear();
		YearAfterField.sendKeys(afterYear);
		InterestRateField.clear();
		InterestRateField.sendKeys(returnRate);
		CalculateButton.click();

	}

	public void waitForList() {
		waitForElement(AnnualScheduleList, driver);
	}

	public List<String> getColumnDataFor(String columnHeader) {
		List<String> list = new ArrayList<String>();
		int index = getColumnHeaderIndexOf(columnHeader);
		List<WebElement> columnDataElements = driver
				.findElements(By.xpath("//div[@id='camortizationschdis']/descendant::table/tbody/tr[1]/td[" + index
						+ "]/b/preceding::tr[1]/td[2]"));
		for (int i = 0; i < columnDataElements.size(); i++) {
			list.add(i, columnDataElements.get(i).getText());
		}
		return list;
	}

	private int getColumnHeaderIndexOf(String columnHeader) {
		List<WebElement> columnHeaderElement = driver
				.findElements(By.xpath("//div[@id='camortizationschdis']/descendant::table/tbody/tr[1]/td"));
		for (int i = 0; i < columnHeaderElement.size(); i++) {
			if (columnHeaderElement.get(i).getText().equalsIgnoreCase(columnHeader)) {
				return i + 1;
			}
		}
		return 0;
	}

}
