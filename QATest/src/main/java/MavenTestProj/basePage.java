package MavenTestProj;

	
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basePage {

	protected static WebDriver driver;
	
	public WebDriver initializeDriver() throws IOException {
		
		//WebDriverManager.getInstance(CHROME).setup();
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}



}
