/**
 * 
 */
package Domumlink;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Testbase.Testbase;

/**
 * @author Jagadeeshwar
 *
 */
public class Nestready extends Testbase {
	
	private static final String String = null;

	/*public void signup() {
		
		driver.findElement(By.xpath("//a[contains(text(),'SIGN IN')]")).click();
        logger.info("Clicking on signin link");			


		String s = driver.findElement(By.xpath("//a[@href='/Activation']")).getText();
		logger.info("Create my account " + s);
		Boolean b1 = driver.findElement(By.xpath("//a[@href='/Activation']")).isDisplayed();

		Assert.assertTrue(b1);

		logger.info("validating display option");

	}

	public  void login(String uname, String pwd) {

		driver.findElement(By.xpath("//input[@id='UserEmail']")).sendKeys(uname);

		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(pwd);

		driver.findElement(By.xpath("//input[@id='RememberEmail']")).click();

		driver.findElement(By.xpath("//input[@value='Sign In']")).click();
        logger.info("sign in button");			

        String s1 = driver
				.findElement(
						By.xpath("//div[contains(text(),' The user name or password you have entered is incorrect')]"))
				.getText();

		logger.info("Error Message is --->" + s1);
	}
*/
	@Test
	public void buyer() throws Exception{
		
		
		boolean text=driver.findElement(By.xpath("//a[contains(text(),'a homebuyer')]")).isDisplayed();
		
		if(text==true){
			
			driver.findElement(By.xpath("//a[contains(text(),'a homebuyer')]")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Get Started')]")).click();
                Thread.sleep(5000);
           
		}}
		
		@Test
		public void placename()
		{
			WebElement element=driver.findElement(By.xpath("//div[@class='Select-placeholder']//span[contains(text(),'Type the location name of your new home')]"));
			
			Actions actions = new Actions(driver);
			actions.moveToElement(element);
			actions.click();
			actions.sendKeys("Montreal");
			actions.build().perform();
			
			
		}
		
		@Test
		public void Logo(){
			
			Boolean logo=driver.findElement(By.xpath("//img[@alt='Logo']")).isDisplayed();
	
		System.out.println("NestReady logo is displaying"+" "+ logo);
		}
		
		
	
	}
	
