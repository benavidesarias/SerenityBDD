package com.choucair.formacion.definition;

import java.util.List;

import com.choucair.formacion.steps.PopupValidationSteps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PopupValidationDefinition {
	
	@Steps
	PopupValidationSteps popupValidationSteps;
	
	@Given("^Autentico en colorlib con usuario \"([^\"]*)\" y clave \"([^\"]*)\"$")
	public void autentico_en_colorlib_con_usuario_y_clave(String strUsuario, String strClave) {
		popupValidationSteps.loginColorlib(strUsuario, strClave);    
	}

	@Given("^Ingreso a la funcionalidad Forms Validation$")
	public void ingreso_a_la_funcionalidad_Forms_Validation() {
	    popupValidationSteps.ingresarFormsValidation();
	}

	@When("^Diligencio Formulario Popup Validation$")
	public void diligencio_Formulario_Popup_Validation(DataTable dtDatosForms) {
		List<List<String>> data = dtDatosForms.raw();
		for(int i=1;i<data.size();i++)
			popupValidationSteps.diligenciar_popup_datos_tabla(data,i);	    
	}

	@Then("^Verifico Ingreso Exitoso$")
	public void verifico_Ingreso_Exitoso() {
	   popupValidationSteps.verificar_formulario_Exitoso();
	}

}
