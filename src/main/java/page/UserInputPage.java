package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UserInputPage {
	WebDriver driver;

	public UserInputPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.NAME, using = "age")
	WebElement CurrentAgeField;
	@FindBy(how = How.NAME, using = "income")
	WebElement CurrentAnnualSalaryField;
	@FindBy(how = How.NAME, using = "balance")
	WebElement Current401kBalanceField;
	@FindBy(how = How.NAME, using = "contribution")
	WebElement ContributionField;
	@FindBy(how = How.NAME, using = "ematch")
	WebElement EmployerMatchField;
	@FindBy(how = How.NAME, using = "ematchend")
	WebElement EmployerMatchLimitField;
	@FindBy(how = How.XPATH, using = "//td[@valign='top']/descendant::input[@value='Calculate']")
	WebElement CalculateButton;
	
	
	public void enterUserInput(String age, String income, String balance, String contribution, String ematch, String ematchend) {
		CurrentAgeField.clear();
		CurrentAgeField.sendKeys(age);
		CurrentAnnualSalaryField.clear();
		CurrentAnnualSalaryField.sendKeys(income);
		Current401kBalanceField.clear();
		Current401kBalanceField.sendKeys(balance);
		ContributionField.clear();
		ContributionField.sendKeys(contribution);
		EmployerMatchField.clear();
		EmployerMatchField.sendKeys(ematch);
		EmployerMatchLimitField.clear();
		EmployerMatchLimitField.sendKeys(ematchend);
		
	}
	
	public void clickCalculateButton() {
		CalculateButton.click();
	}
	
	
}
