package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;

	// parameterized constructor initialized when class in instantiated [object created]
	public HomePage(WebDriver driver) {
		this.driver = driver;

	
		// PageFactory class help to instantiate WebElements
			// Important interview question
		PageFactory.initElements(driver, this);
			
		}

	@FindBy(xpath="//img[@class='fxg-header__logo']")
	WebElement logo;
	
	
	public void clickLogo() throws InterruptedException {
		logo.click();
		Thread.sleep(500,000); // time to 
	}
}
// git push Day01