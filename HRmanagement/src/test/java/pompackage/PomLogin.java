package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseHRMClass;

public class PomLogin extends BaseHRMClass{ //calling parent method
	//object repository
	
	@FindBy(css="#txtUsername")   //driver.findElemnt(By.
	WebElement Username;
	@FindBy(css="#txtPassword")  
	WebElement Password;
	@FindBy(css="#btnLogin")   
	WebElement Login;
	//initiate page elements
	public PomLogin() {
		PageFactory.initElements(driver,this);
	}
	public void typeusername(String name) {
		//driver.findElement(By.cssSelector(null)).sendKeys(null);
Username.sendKeys(name);
}
	public void typepassword(String pass ) {
		Password.sendKeys(pass);
	}
	public void clickbtn() {
		Login.click();
	}
	public String verify() {
		return driver.getTitle();
	}
			
}
