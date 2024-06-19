package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatepickerTask20 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/datepicker/");
        //driver.findElement(By.className("demo-frame"));
        //driver.switchTo().frame("iframe");
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
        WebElement datebutton = driver.findElement(By.id("datepicker"));
        datebutton.click();
        WebElement nextbutton = driver.findElement(By.className("ui-datepicker-next"));
        nextbutton.click();
        System.out.println("Next Month July Displayed");
        WebElement date = driver.findElement(By.linkText("22"));
        date.click();
        System.out.println("Date 07/22/2024 Displayed");
        
        WebElement datebutton1 = driver.findElement(By.id("datepicker"));
        String InputGiven = datebutton1.getAttribute("value");
       
        System.out.println(InputGiven);
        
	}

}
