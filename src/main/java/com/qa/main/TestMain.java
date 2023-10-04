package com.qa.main;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class TestMain {

	//*Set the path to the ChromeDriver executable
    //System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
	
    //*Create a new instance of the Chrome driver
    //WebDriver driver = new ChromeDriver();

    //*Navigate to a URL
    //String url = "https://www.example.com";
    //driver.get(url);

	// Initialize the WebDriver

	public static WebDriver driver;
	public static Properties prop;

	public TestMain() {

		try {
			prop = new Properties();
			FileInputStream readData = new FileInputStream(
					"/Users/divya/eclipse-workspace/Project1/src/main/java/com/qa/config/properties/config.properties");
			// read file from given URL file
			prop.load(readData);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void Browsers(String url) {
		String browserType = prop.getProperty("browser");
		if(browserType.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if(browserType.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if(browserType.equalsIgnoreCase("Safari")) {
            driver = new SafariDriver();
		} else {
			System.out.println("Please enter a valid browser type");
		}
			
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
/*
The code defines a class named "TestMain" and It begins by importing necessary 
Java libraries and WebDriver classes. 
Within the class, there's a constructor responsible for initializing configuration 
properties from a file, likely containing settings like the preferred web browser for testing.

The Browsers method, selects the browser type from the 
loaded properties and initializes the corresponding WebDriver (e.g., Chrome, Firefox, Safari). 
Following this, it configures the WebDriver by maximizing the browser window, deleting cookies, 
and navigating to a specified URL. An implicit wait of 15 seconds is set, allowing the WebDriver
 to wait for up to 15 seconds if an element cannot be immediately located.

Additionally, the code includes a safeguard for handling an invalid browser type. If the 
specified browser in the properties file is not recognized as Firefox, Chrome, or Safari, 
it prints a message indicating that the browser type is invalid. Overall, this code provides 
the essential setup for automating web browser interactions, making it a valuable starting 
point for writing test scripts for web applications.
 */
			
			
			
	}
}
