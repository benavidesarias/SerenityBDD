package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ColorlibFormValidationPage extends PageObject{
	//Campo Required
	@FindBy(xpath="//*[@id=\'req\']")
	private WebElementFacade txtRequerid;
	
	//Campo Seleccion de deporte 1 
	@FindBy(xpath="//*[@id=\'sport\']")
	private WebElementFacade cmbSport1;
	
	//Campo Seleccion de deporte 2 multiple
	@FindBy(xpath="//*[@id=\'sport2\']")
	private WebElementFacade cmbSport2;
	
	//Campo Url
	@FindBy(xpath="//*[@id=\'url1\']")
	private WebElementFacade txtUrl;
	
	//Campo Email
	@FindBy(id="email1")
	private WebElementFacade txtEmail;
	
	//Campo Seleccion de deporte 1
	@FindBy(id="pass1")
	private WebElementFacade txtPass1;
	
	//Campo Seleccion de deporte 1
	@FindBy(id="pass2")
	private WebElementFacade txtPass2;	
	
	//Campo Seleccion de deporte 1
	@FindBy(id="minsize1")
	private WebElementFacade txtMinSize1;
	
	//Campo Seleccion de deporte 1
	@FindBy(name="maxsize1")
	private WebElementFacade txtMaxSize1;

	//Campo Seleccion de deporte 1
	@FindBy(id="number2")
	private WebElementFacade txtNumber2;
	
	//Campo Seleccion de deporte 1
	@FindBy(id="ip")
	private WebElementFacade txtIp;
	
	//Campo Seleccion de deporte 1
	@FindBy(id="date3")
	private WebElementFacade txtDate3;
	
	//Campo Seleccion de deporte 1
	@FindBy(id="past")
	private WebElementFacade txtDatePast;
	
	//btnValidate
	@FindBy(xpath="//*[@id=\'popup-validation\']/div[14]/input")
	private WebElementFacade btnValidate;
	
	//GloboValidacion
	@FindBy(xpath="(//DIV[@class='formErrorContent'])[1]")
	private WebElementFacade popupGlobo;
	
	public void setTxtRequerid(String txtRequerid) {
		this.txtRequerid.click();
		this.txtRequerid.clear();
		this.txtRequerid.sendKeys(txtRequerid);
	}

	public void setCmbSport1(String cmbSport1) {
		//System.out.println(cmbSport1);
		this.cmbSport1.click();
		this.cmbSport1.selectByVisibleText(cmbSport1);
	}
	
	public void setCmbSport2(String cmbSport2) {
		this.cmbSport2.click();
		this.cmbSport2.selectByVisibleText(cmbSport2);
	}

	public void setTxtUrl(String txtUrl) {
		this.txtUrl.click();
		this.txtUrl.clear();
		this.txtUrl.sendKeys(txtUrl);;
	}

	public void setTxtEmail(String txtEmail) {
		this.txtEmail.click();
		this.txtEmail.clear();
		this.txtEmail.sendKeys(txtEmail);
	}

	public void setTxtPass1(String txtPass1) {
		this.txtPass1.click();
		this.txtPass1.clear();
		this.txtPass1.sendKeys(txtPass1);
	}

	public void setTxtPass2(String txtPass2) {
		this.txtPass2.click();
		this.txtPass2.clear();
		this.txtPass2.sendKeys(txtPass2);
	}

	public void setTxtMinSize1(String txtMinSize1) {
		this.txtMinSize1.click();
		this.txtMinSize1.clear();
		this.txtMinSize1.sendKeys(txtMinSize1);
	}

	public void setTxtMaxSize1(String txtMaxSize1) {
		this.txtMaxSize1.click();
		this.txtMaxSize1.clear();
		this.txtMaxSize1.sendKeys(txtMaxSize1);
	}

	public void setTxtNumber2(String txtNumber2) {
		this.txtNumber2.click();
		this.txtNumber2.clear();
		this.txtNumber2.sendKeys(txtNumber2);
	}

	public void setTxtIp(String txtIp) {
		this.txtIp.click();
		this.txtIp.clear();
		this.txtIp.sendKeys(txtIp);
	}

	public void setTxtDate3(String txtDate3) {
		this.txtDate3.click();
		this.txtDate3.clear();
		this.txtDate3.sendKeys(txtDate3);
	}

	public void setTxtDatePast(String txtDatePast) {
		this.txtDatePast.click();
		this.txtDatePast.clear();
		this.txtDatePast.sendKeys(txtDatePast);
	}

	public void validate() {
		btnValidate.click();	
	}
	
	public void formSinErrores() {
		assertThat(popupGlobo.isCurrentlyVisible(),is(false));
	}
	
	public void formConErrores() {
		assertThat(popupGlobo.isCurrentlyVisible(),is(true));
	}
}
