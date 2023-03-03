package stepDefinitiom;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class register {
	 WebDriver driver =new ChromeDriver();
	
////	@Given("Launch the Browser")
////	public void launch_the_browser() {
////		
////		System.setProperty("webdriver.chrome.driver","C:/Windows/System32/config/systemprofile/eclipse-workspace/com.Automatiom/src/test/resources/driver/chromedriver.exe");
////		//driver=new ChromeDriver();
////		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
////		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
////		}
//	
//
//
//	@When("Singup button is clicked")
//	public void singup_button_is_clicked() {
//
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		System.out.println("HIIIIII");
//		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
//
//	}
//
//	@And("Verify New User Signup is visible")
//	public void verify_new_user_signup_is_visible() {
//
//		WebElement signupTitle=driver.findElement(By.xpath("//div[@class='signup-form']/h2"));
//		String expectedTitle="New User Signup!";
//	}
//
//	@And("Enter name and already registered email")
//	public void enter_name_and_already_registered_email() {
//	    driver.findElement(By.xpath("//input[@data-qa='signup-name']")).sendKeys("Shahazoor");
//	    driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("shahzoor18@gmail.com");
//
//	}
//
//	@Then("Click Signup button")
//	public void click_signup_button() {
//
//		driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();
//	}
//
//	@And("Verify error message is visible")
//	public void verify_error_message_is_visible() {
//
//		WebElement errorMessage=driver.findElement(By.xpath("//p[@style='color: red;']"));
//		String expectedMessage="Email Address already exist!";
//		
//		assertEquals(errorMessage.getText(),expectedMessage);
//	}

}
