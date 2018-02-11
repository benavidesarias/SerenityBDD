package com.choucair.formacion.pageobjects;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ColorlibFormBlockValidationPage extends PageObject {
	
	@FindBy(id="required2")
	private WebElementFacade weRequired;
	
	@FindBy(id="email2")
	private WebElementFacade weEmail;
	
	@FindBy(id="password2")
	private WebElementFacade wePassword;
	
	@FindBy(id="confirm_password2")
	private WebElementFacade weConfirmPassword;
	
	@FindBy(id="date2")
	private WebElementFacade weDate;
	
	@FindBy(id="url2")
	private WebElementFacade weUrl;
	
	@FindBy(id="digits")
	private WebElementFacade weDigits;
	
	@FindBy(id="range")
	private WebElementFacade weRange;
	
	@FindBy(id="agree2")
	private WebElementFacade weAgree;
	
	@FindBy(xpath="//*[@id=\'block-validate\']/div[10]/input")
	private WebElementFacade weBtnValidate;
	
	//TextoValidacion
	@FindBy(xpath= "//div[@class='form-group has-error']")
	private WebElementFacade weBlockValidation;
	
	public void setWeRequired(String value) {
		weRequired.waitUntilClickable();
		weRequired.click();
		weRequired.clear();
		weRequired.sendKeys(value);	
	}
	
	public void setWeEmail(String value) {
		weEmail.click();
		weEmail.clear();
		weEmail.sendKeys(value);	
	}
	
	public void setWePassword(String value) {
		wePassword.click();
		wePassword.clear();
		wePassword.sendKeys(value);	
	}
	
	public void setWeConfirmPassword(String value) {
		weConfirmPassword.click();
		weConfirmPassword.clear();
		weConfirmPassword.sendKeys(value);	
	}
	
	public void setWeDate(String value) {
		weDate.click();
		weDate.sendKeys(value);	
	}
	
	public void setWeUrl(String value) {
		weUrl.click();
		weUrl.clear();
		weUrl.sendKeys(value);	
	}
	
	public void setWeDigits(String value) {
		weDigits.click();
		weDigits.clear();
		weDigits.sendKeys(value);	
	}
	
	public void setWeRange(String value) {
		weRange.click();
		weRange.clear();
		weRange.sendKeys(value);	
	}
	
	public void setWeAgree(String value) {
		boolean check = Boolean.parseBoolean(value);
		if (check) {
			weAgree.setWindowFocus();
			weAgree.click();
		}
			
	}
	
	public void validate() {
		weBtnValidate.click();
	}
	
	public void formSinErrores() {
		assertThat(weBlockValidation.isCurrentlyVisible(),is(false));
	}

	public void formConErrores() {
		assertThat(weBlockValidation.isCurrentlyVisible(),is(true));	
	}
}

