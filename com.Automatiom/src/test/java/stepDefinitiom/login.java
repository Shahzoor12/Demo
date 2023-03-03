package stepDefinitiom;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {

	WebDriver driver;

	@Given("Browser is open")
	public void browser_is_open() {

		System.setProperty("webdriver.chrome.driver","C:/Windows/System32/config/systemprofile/eclipse-workspace/com.Automatiom/src/test/resources//driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
	}


	@And("Navigate to url")
	public void navigate_to_url() {

		driver.navigate().to("https://automationexercise.com/");
	}


	@And("verify home page is visible")
	public void verify_home_page_is_visible() {

		String title=driver.getTitle();
		String expectedTitle="Automation Exercise";

		assertEquals(title,expectedTitle);
	}


	@And("Click on Login button")
	public void click_on_login_button() {
		
		driver.findElement(By.xpath("")).click();
	}


	@And("Verify Login to your account is visible")
	public void verify_login_to_your_account_is_visible() {

		WebElement loginTitle=driver.findElement(By.xpath(("//div[@class='login-form']/h2")));
		String expectedTitle="Login to your account";
		assertEquals(loginTitle.getText(),expectedTitle);
	}


	@When("Correct email and password is eneterd")
	public void correct_email_and_password_is_eneterd() {

		driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("sg@gmail.com");
		driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("123");
	}


	@And("Login button is clicked")
	public void login_button_is_clicked() {

		driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();
	}


	@And("verify Loggedin as username is visible")
	public void verify_loggedin_as_username_is_visible() {

		//boolean userName=driver.findElement(By.xpath("//i[@class='fa fa-user']")).isDisplayed();
		System.out.println("Hola");
	}


	@Then("Click delete account button")
	public void click_delete_account_button() {

		driver.findElement(By.xpath("//a[@href='/delete_account']")).click();
	}


	@And("Verify account deleted")
	public void verify_account_deleted() {

		WebElement accountDeleted=driver.findElement(By.xpath("//h2[@class='title text-center']/b"));
		String expectedText="ACCOUNT DELETED!";

		assertEquals(accountDeleted.getText(),expectedText);
	}
	
	
	                                //TC005//
	
	@When("Singup button is clicked")
	public void singup_button_is_clicked() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='/login']")).click();
	}

	@And("Verify New User Signup is visible")
	public void verify_new_user_signup_is_visible() {
		WebElement signupTitle=driver.findElement(By.xpath("//div[@class='signup-form']/h2"));
	String expectedTitle="New User Signup!";
	
	assertEquals(signupTitle.getText(),expectedTitle);
	}

	@And("Enter name and already registered email")
	public void enter_name_and_already_registered_email() {
		driver.findElement(By.xpath("//input[@data-qa='signup-name']")).sendKeys("Shahazoor");
	    driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("shahzoor18@gmail.com");
	}

	@Then("Click Signup button")
	public void click_signup_button() {
		driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();
	}

	@Then("Verify error message is visible")
	public void verify_error_message_is_visible() {
		WebElement errorMessage=driver.findElement(By.xpath("//p[@style='color: red;']"));
		String expectedMessage="Email Address already exist!";
		
		assertEquals(errorMessage.getText(),expectedMessage);
	}
	
	
	                                   //TC008//
	
	@When("Products button is clicked")
	public void products_button_is_clicked() {
	   
		driver.findElement(By.xpath(("//a[@href='/products']"))).click();
	}

	@And("Verify user is navigated to All Products page successfully")
	public void verify_user_is_navigated_to_all_products_page_successfully() {
	    
		WebElement actualText=driver.findElement(By.xpath(("//h2[@class='title text-center']")));
		String expectedText="ALL PRODUCTS";
		
		assertEquals(expectedText, actualText.getText());
	}

	@And("The products list is visible")
	public void the_products_list_is_visible() {

		driver.findElement(By.xpath("//div[@class='features_items']")).isDisplayed();
	}

	@Then("Click on View Product of first product")
	public void click_on_view_product_of_first_product() {
		
		driver.findElement(By.xpath("//a[@href='/product_details/1']")).click();
		
	}

	@And("User landed to product detail page")
	public void user_landed_to_product_detail_page() {
	    String webUrl=driver.getCurrentUrl();
	    String expectedUrl="https://automationexercise.com/product_details/1";
	    
	    assertEquals(expectedUrl,webUrl);
	}

	@And("Verify the detail is visible")
	public void verify_the_detail_is_visible() {
	    
		driver.findElement(By.xpath("//div[@class='product-information']//h2")).isDisplayed();
		driver.findElement(By.xpath("//div[@class='product-information']//p")).isDisplayed();
		driver.findElement(By.xpath("//span[text()='Rs. 500']")).isDisplayed();
	}
	
	
	                              //TC011//
	
	
	@When("Cart button is clicked")
	public void cart_button_is_clicked() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("Scroll down to footer")
	public void scroll_down_to_footer() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("Verify text")
	public void verify_text( ) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Email is entered and arrow button is clicked")
	public void email_is_entered_and_arrow_button_is_clicked() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Verify the message")
	public void verify_the_message() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	
	
}
