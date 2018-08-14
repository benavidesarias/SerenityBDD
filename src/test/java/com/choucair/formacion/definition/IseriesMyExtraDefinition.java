package com.choucair.formacion.definition;

import java.io.FileReader;
import java.util.Properties;
import com.choucair.formacion.steps.IseriesMyExtraSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class IseriesMyExtraDefinition {
	private String user;
	private String password;
	@Steps
	IseriesMyExtraSteps iseriesMyExtraSteps;

	@Given("^Abrir MyExtra \"([^\"]*)\"$")
	public void abrir_MyExtra(String rutaCalidad) throws Throwable {
		iseriesMyExtraSteps.Abrir_Extra(rutaCalidad);
	}

	@When("^Autenticar MyExtra$")
	public void autenticar_MyExtra() throws Throwable {
		Properties prop = new Properties();
		prop.load(new FileReader("D:\\JAVA\\documentos\\com.choucair.base\\dbconfig.properties"));
		this.user = prop.getProperty("db.user");
		this.password = prop.getProperty("db.password");
		iseriesMyExtraSteps.Autenticar_Extra(user, password);
	}
	
	@When("^Ingreso a opcion SQL$")
	public void ingreso_a_opcion_SQL() throws Throwable {
		iseriesMyExtraSteps.Ingresar_Menu_SQL();
	}
}
