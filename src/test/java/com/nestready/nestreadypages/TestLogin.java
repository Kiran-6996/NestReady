/**
 * 
 */
package com.nestready.nestreadypages;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author Jagadeeshwar
 *
 */
public class TestLogin extends Testbase {

	@BeforeClass
	public void initialization() {

		init();
	}

	@Test(priority = 1)
	public void buyer1() throws Exception {
		Nestready ready = new Nestready();
		ready.buyer();
		ready.placename();
		ready.Logo();
	}

	
	 @AfterClass 
	 public void close() { 
		 driver.close(); }
	 
}
