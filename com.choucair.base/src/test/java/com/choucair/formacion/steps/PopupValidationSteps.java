package com.choucair.formacion.steps;

import java.util.List;

import com.choucair.formacion.pageobjects.ColorlibFormValidationPage;
import com.choucair.formacion.pageobjects.ColorlibLoginPage;
import com.choucair.formacion.pageobjects.ColorlibMenuPage;

import net.thucydides.core.annotations.Step;

public class PopupValidationSteps {
	
	ColorlibLoginPage colorlibLoginPage;
	ColorlibMenuPage colorlibMenuPage;
	ColorlibFormValidationPage colorlibFormValidationPage;
	
	@Step
	public void loginColorlib(String strUsuario, String strClave){
		colorlibLoginPage.open();
		colorlibLoginPage.ingresarDatos(strUsuario,strClave);
		colorlibLoginPage.verificarHome();
	}
	
	@Step
	public void ingresarFormsValidation() {
		colorlibMenuPage.menuFormsValidation();
	}
	
	@Step
	public void diligenciar_popup_datos_tabla(List<List<String>> data, int id) {
		colorlibFormValidationPage.setTxtRequerid(data.get(id).get(0).trim());
		colorlibFormValidationPage.setCmbSport1(data.get(id).get(1).trim());
		colorlibFormValidationPage.setCmbSport2(data.get(id).get(2).trim());
		colorlibFormValidationPage.setCmbSport2(data.get(id).get(3).trim());
		colorlibFormValidationPage.setTxtUrl(data.get(id).get(4).trim());
		colorlibFormValidationPage.setTxtEmail(data.get(id).get(5).trim());
		colorlibFormValidationPage.setTxtPass1(data.get(id).get(6).trim());
		colorlibFormValidationPage.setTxtPass2(data.get(id).get(7).trim());
		colorlibFormValidationPage.setTxtMinSize1(data.get(id).get(8).trim());
		colorlibFormValidationPage.setTxtMaxSize1(data.get(id).get(9).trim());
		colorlibFormValidationPage.setTxtNumber2(data.get(id).get(10).trim());
		colorlibFormValidationPage.setTxtIp(data.get(id).get(11).trim());
		colorlibFormValidationPage.setTxtDate3(data.get(id).get(12).trim());
		colorlibFormValidationPage.setTxtDatePast(data.get(id).get(13).trim());
		colorlibFormValidationPage.validate();
	}
	
	@Step
	public void verificar_formulario_Exitoso() {
		colorlibFormValidationPage.formSinErrores();
	}
	
	@Step
	public void verificar_formulario_Errores() {
		
	}

}
