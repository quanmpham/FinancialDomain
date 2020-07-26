package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RetirementCalculatorPage extends BasePage {
	WebDriver driver;

	public RetirementCalculatorPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//div/p/font/b[1]")
	WebElement TotalBalance;
	@FindBy(how = How.XPATH, using = "//*[@id=\"contentout\"]/div/a/img")
	WebElement AllCalculatorButton;
	@FindBy(how = How.LINK_TEXT, using = "401K Calculator")
	WebElement LinkTo401kCalculator;
	
	public void goTo401kCalculatorPage() throws InterruptedException {
		AllCalculatorButton.click();
		Thread.sleep(3000);
		LinkTo401kCalculator.click();
		
	}

	public void waitForTotal() {
		waitForElement(TotalBalance, driver);
	}

}
