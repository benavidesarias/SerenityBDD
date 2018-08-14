package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.IseriesMyExtraPage;
import net.thucydides.core.annotations.Step;

public class IseriesMyExtraSteps {
	IseriesMyExtraPage iseriesMyExtraPage;

	@Step
	public void Abrir_Extra(String rutaCalidad) throws InterruptedException {
		iseriesMyExtraPage.iniciar_Extra(rutaCalidad);
	}

	@Step
	public void Autenticar_Extra(String strUsuario, String strClave) throws InterruptedException {
		if (iseriesMyExtraPage.Sess0 != null) {
			iseriesMyExtraPage.Autenticar_Extra(strUsuario, strClave);
		} else {
			System.out.println("No es posible ejecutar no se cuenta con una sesion activa");
		}
	}

	@Step
	public void Ingresar_Menu_SQL() throws InterruptedException {
		iseriesMyExtraPage.Ingresar_Menu_SQL();
		
	}
}
