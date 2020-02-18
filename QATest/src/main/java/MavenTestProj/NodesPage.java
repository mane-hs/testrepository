package MavenTestProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NodesPage extends basePage {

	public WebDriver driver; 
	
	//String nodes[] n= new n(id, x, y);
	String links[];
	
	By addNode= By.cssSelector("button[onclick^=addNode]");
	By contextMenu1= By.cssSelector("li:nth-of-type(1)");
	By contextMenu2= By.cssSelector("li:nth-of-type(2)");
	By contextMenu3= By.cssSelector("li:nth-of-type(3)");
    
	

public NodesPage (WebDriver driver) {
	
	this.driver=driver;
	
}


public WebElement addNode()
{
	return driver.findElement(addNode);
}
public WebElement clickContextMenu1()
{
	return driver.findElement(contextMenu1);
}
public WebElement clickContextMenu2()
{
	return driver.findElement(contextMenu2);
}
public WebElement clickContextMenu3()
{
	return driver.findElement(contextMenu3);
}	

}