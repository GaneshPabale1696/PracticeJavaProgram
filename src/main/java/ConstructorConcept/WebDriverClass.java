package ConstructorConcept;

import org.openqa.selenium.WebDriver;

public class WebDriverClass {

	public static WebDriver driver;

	public WebDriverClass(WebDriver driver) {
		WebDriverClass.driver = driver;

		System.out.println("Parent class constructor is called");
	}

}
