package com.choucair.formacion.definition;

import java.util.List;

import com.choucair.formacion.steps.BlockValidationSteps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class BlockValidationDefinition {
	
	@Steps
	BlockValidationSteps blockValidationSteps;
	
	@When("^Diligencio Formulario Block Validation$")
	public void diligencio_Formulario_Block_Validation(DataTable dtDatosForms) {
		List<List<String>> data = dtDatosForms.raw();
		for(int i=1;i<data.size();i++)
			blockValidationSteps.diligenciar_Form_Block_Validation(data, i);
	}

	@Then("^Verifico Block_Validation Exitoso$")
	public void verifico_Block_Validation_Exitoso() {
		blockValidationSteps.verificar_forBlockValidation_Exitoso();
	}
	
	@Then("^Verifico Block_Validation Fallido$")
	public void verifico_Block_Validation_Fallido() {
		blockValidationSteps.verificar_formBlockValidation_Fallido();
	}


}
