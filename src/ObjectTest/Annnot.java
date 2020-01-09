package ObjectTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Annnot {

		
	 WebDriver driver;
	  @BeforeMethod
	  public void launch() {

			System.setProperty("webdriver.chrome.driver", "D:\\Chrome79\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://adactin.com/HotelApp/");
	  }
	  
	  
	  @DataProvider(name="TestData")
	  public Object verifyData(){
		  
		  	Object[][] Testdata= {{"rakhesh07","yakesh07"}};
			return Testdata;
		  
	  }
	  
	  @Test(dataProvider="TestData")
	  public void verifyLogin1(String uname,String pname) {
		  
		  WebElement user=driver.findElement(By.id("username"));
		  user.sendKeys(uname);
		  WebElement pass=driver.findElement(By.id("password"));
		  pass.sendKeys(pname);
		  driver.findElement(By.id("login")).click();
		  
	  }
	   
//	  @Test(dataProvider="TestData")
//	  public void verifyLogin2(String uname,String pname) {
//		  
//		  WebElement user=driver.findElement(By.id("username"));
//		  user.sendKeys(uname);
//		  WebElement pass=driver.findElement(By.id("password"));
//		  pass.sendKeys(pname);
//		  driver.findElement(By.id("login")).click();
//		  
//	  }
	   

	 
}
