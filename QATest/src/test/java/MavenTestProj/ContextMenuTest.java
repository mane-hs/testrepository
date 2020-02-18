package MavenTestProj;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContextMenuTest extends basePage {

@Test
	public static void main(String[] args) {
		
		//WebDriverManager.getInstance(CHROME).setup();
		driver = new ChromeDriver();
		driver.get("http://104.248.248.105:8085/");
		
}

}

   

