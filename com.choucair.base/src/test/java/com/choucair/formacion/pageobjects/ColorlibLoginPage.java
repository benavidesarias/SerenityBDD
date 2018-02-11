package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;


@DefaultUrl("https://colorlib.com/polygon/metis/login.html")
public class ColorlibLoginPage extends PageObject{
	
	//campo Usuario
	@FindBy(xpath="//*[@id=\'login\']/form/input[1]")
	public WebElementFacade txtUsuario;
	
	//campo Clave
	@FindBy(xpath="//*[@id=\'login\']/form/input[2]")
	public WebElementFacade txtClave;
	
	//Boton Login
	@FindBy(xpath="//*[@id='login']/form/button")
	public WebElementFacade btnSignIn;
	
	//Texto a verificar
	@FindBy(xpath="//*[@id=\'bootstrap-admin-template\']")
	public WebElementFacade lblHomePPal;

	
	public void ingresarDatos(String strUsuario, String strClave) {
		txtUsuario.sendKeys(strUsuario);
		txtClave.sendKeys(strClave);
		btnSignIn.click();
		
	}

	public void verificarHome() {
		String labelv = "Bootstrap-Admin-Template";
		String mensaje = lblHomePPal.getText();
		assertThat(mensaje, containsString(labelv));
		
	}

}
