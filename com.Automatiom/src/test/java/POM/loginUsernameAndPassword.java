package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginUsernameAndPassword {
	WebDriver d;
	public loginUsernameAndPassword(WebDriver driver1) {
		d=driver1;
		PageFactory.initElements( driver1,this);
		
	}
	
	@FindBy(xpath="//a[@href='/login']") 
	WebElement login;
	//login
	
	@FindBy(xpath="//input[@data-qa='login-email']")
	WebElement email;
	
	@FindBy(xpath="//input[@data-qa='login-password']")
	WebElement password;
	
	public void loginButton() {
		login.click();
	}
	
	public void correctEmail() {
		email.sendKeys("sg@gmail.com");
		
	}
	
	public void correctPassword() {
		password.sendKeys("123");
		
	}

}
