package Demo;


		import java.awt.AWTException;
		import java.sql.SQLException;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.testng.annotations.Test;

		public class testing {
			
			@Test(priority = 0)
			public void NewApp() throws SQLException, ClassNotFoundException, InterruptedException, AWTException {
				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
						
						            WebDriver driver = new ChromeDriver();
						  driver.get("https://codility-frontend-prod.s3.amazonaws.com/media/task_static/qa_csharp_search");
						  driver.manage().window().maximize();
						  Thread.sleep(1000);
						
						 driver.findElement(By.xpath("//*[@id='search-input']")).sendKeys("Test");
						 Thread.sleep(5000);
						 						
										 
						 driver.findElement(By.xpath("//*[@id=\'search-button\']")).click();
						 Thread.sleep(5000);
	}

}
