package com.techelevator.npgeektest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NationalParkGeekIntegrationTestWithoutPageObject {
	private static WebDriver webDriver;
	
	@BeforeClass
	public static void openWebBrowserForTesting() {
		
		String homeDir = System.getProperty("user.home"); 
		System.setProperty("webdriver.chrome.driver", homeDir+"/dev-tools/chromedriver/chromedriver");
		webDriver = new ChromeDriver();
	}

	@Before
	public void openHomePage() {
		webDriver.get("http://localhost:8080/java-module-3-capstone-team-0/");
	}
	
	@AfterClass
	public static void closeWebBrowser() {
		webDriver.close();
	}
	

	@Test
	public void single_elements_can_be_found_by_tag_name() {
		WebElement header = webDriver.findElement(By.tagName("header"));
		WebElement footer = webDriver.findElement(By.tagName("footer"));
		assertNotNull(header);
		assertNotNull(footer);
	}
	
	@Test
	public void multiple_elements_can_be_found_by_tag_name() {
		List<WebElement> divs = webDriver.findElements(By.tagName("div"));
		assertEquals(3, divs.size());
		for(WebElement div : divs) {
			assertEquals("account", div.getAttribute("id"));
		}
	}
	
	@Test
	public void pages_can_be_navigated_by_clicking_on_links() {
		WebElement surveyLink = webDriver.findElement(By.linkText("Survey")); 		
		JavascriptExecutor ex = (JavascriptExecutor)webDriver;
		ex.executeScript("arguments[0].click();", surveyLink);
		
		assertTrue(webDriver.getTitle().endsWith("National Parks Survey Page"));
		WebElement h1 = webDriver.findElement(By.tagName("h1"));
		assertEquals("National Parks Survey Page", h1.getText());
	}
	
	@Test
	public void forms_can_be_edited_and_submitted() throws InterruptedException {
		WebElement surveyLink = webDriver.findElement(By.linkText("Survey"));
		// calculatorLink.click();
		JavascriptExecutor ex = (JavascriptExecutor)webDriver;
		ex.executeScript("arguments[0].click();", surveyLink);

		
		Select parkField = new Select(webDriver.findElement(By.name("parkcode")));
		parkField.selectByVisibleText("Cuyahoga Valley National Park");
		TimeUnit.SECONDS.sleep(3);
		WebElement emailField = webDriver.findElement(By.name("emailAddress"));
		emailField.sendKeys("hello@world.com");
		TimeUnit.SECONDS.sleep(3);

		
		
		
		WebElement stateField = webDriver.findElement(By.name("state_Select"));
		stateField.sendKeys("AK");
		TimeUnit.SECONDS.sleep(3);
		
		WebElement submitButton = webDriver.findElement(By.className("submitButton"));

		ex.executeScript("arguments[0].click();", submitButton);
		TimeUnit.SECONDS.sleep(3);
		
	}

}
