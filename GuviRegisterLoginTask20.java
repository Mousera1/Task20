package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GuviRegisterLoginTask20 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.guvi.in/register");
        driver.findElement(By.id("name")).sendKeys("Test");
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Test@demo.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("testtesttest1");
        WebElement element = driver.findElement(By.className("countrycode-left"));
        element.sendKeys("9449090909");
        WebElement signUp = driver.findElement(By.linkText("Sign Up"));
        signUp.click();
        //wait.until(ExpectedConditions.titleContains("Guvi"));
        if(driver.getTitle().contains("GUVI"))
        {
        System.out.println("User registered successfully.");
        }
        driver.get("https://www.guvi.in/sign-in/");
        WebElement loginEmailInput = driver.findElement(By.id("email"));
        loginEmailInput.sendKeys("Test@demo.com");
        
        WebElement loginPasswordInput = driver.findElement(By.id("password"));
        loginPasswordInput.sendKeys("testtesttest1");
        
        // "Login" button
        WebElement loginFormButton = driver.findElement(By.linkText("Login"));
        loginFormButton.click();
        
        
        if(driver.getTitle().contains("GUVI"))
        {
        System.out.println("User logged in successfully");
        }
       
        driver.quit();
      
        
	}

}
