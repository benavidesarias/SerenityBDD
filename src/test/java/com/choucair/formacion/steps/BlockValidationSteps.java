package com.choucair.formacion.steps;

import java.util.List;

import com.choucair.formacion.pageobjects.ColorlibFormBlockValidationPage;

import net.thucydides.core.annotations.Step;

public class BlockValidationSteps {
	
	ColorlibFormBlockValidationPage colorlibFormBlockValidationPage;
	
	@Step
	public void diligenciar_Form_Block_Validation(List<List<String>> data, int id) {
		//colorlibFormValidationPage.cerrar();
		
		colorlibFormBlockValidationPage.setWeRequired(data.get(id).get(0).trim());
		colorlibFormBlockValidationPage.setWeEmail(data.get(id).get(1).trim());
		colorlibFormBlockValidationPage.setWePassword(data.get(id).get(2).trim());
		colorlibFormBlockValidationPage.setWeConfirmPassword(data.get(id).get(3).trim());
		colorlibFormBlockValidationPage.setWeDate(data.get(id).get(4).trim());
		colorlibFormBlockValidationPage.setWeUrl(data.get(id).get(5).trim());
		colorlibFormBlockValidationPage.setWeDigits(data.get(id).get(6).trim());
		colorlibFormBlockValidationPage.setWeRange(data.get(id).get(7).trim());
		colorlibFormBlockValidationPage.setWeAgree(data.get(id).get(8).trim());
		colorlibFormBlockValidationPage.validate();
		
		
	}

	@Step
	public void verificar_forBlockValidation_Exitoso() {
		colorlibFormBlockValidationPage.formSinErrores();
		
	}
	
	@Step
	public void verificar_formBlockValidation_Fallido() {
		colorlibFormBlockValidationPage.formConErrores();	
	}


}
