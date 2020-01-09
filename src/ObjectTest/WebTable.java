package ObjectTest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTable {
	
	static WebDriver driver;
	
	@Test
	public void verifyTable() throws IOException{
//		System.setProperty("webdriver.chrome.driver", "D:\\Chrome79\\chromedriver_win32\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get("https://www.toolsqa.com/automation-practice-table/");
//	
//		List<WebElement>list=driver.findElements(By.xpath("//*[@id='content']/table/tbody/tr"));
//		
//		for(WebElement a:list){
//			System.out.println(a.getText());
//		}
		String s="Java";
		File f1= new File("D:\\NewExcel.xlsx");
		if(f1.createNewFile()){
			FileOutputStream f2 = new FileOutputStream(f1);
			
		}
		
	}

}
