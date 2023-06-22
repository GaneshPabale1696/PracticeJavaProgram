package ConstructorConcept;

import org.openqa.selenium.WebDriver;

public class LoginPageClass extends WebDriverClass {

	public LoginPageClass(WebDriver driver) {
		super(driver);
	}

	public static void main(String[] args) {
		LoginPageClass obj = new LoginPageClass(driver);

	}
}
