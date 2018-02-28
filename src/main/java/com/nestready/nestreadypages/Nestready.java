/**
 * 
 */
package com.nestready.nestreadypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.nestready.nestreadypages.Testbase;

/**
 * @author Jagadeeshwar
 *
 */
public class Nestready extends Testbase {

	@Test
	public void buyer() throws Exception {

		boolean text = driver.findElement(By.xpath("//a[contains(text(),'a homebuyer')]")).isDisplayed();

		if (text == true) {

			driver.findElement(By.xpath("//a[contains(text(),'a homebuyer')]")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Get Started')]")).click();
			Thread.sleep(5000);

		}
	}

	@Test
	public void placename() {
		WebElement element = driver.findElement(By.xpath(
				"//div[@class='Select-placeholder']//span[contains(text(),'Type the location name of your new home')]"));

		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.click();
		actions.sendKeys("Montreal");
		actions.build().perform();

	}

	@Test
	public void Logo() {

		Boolean logo = driver.findElement(By.xpath("//img[@alt='Logo']")).isDisplayed();

		logger.info("NestReady logo is displaying" + " " + logo);
	}

}
