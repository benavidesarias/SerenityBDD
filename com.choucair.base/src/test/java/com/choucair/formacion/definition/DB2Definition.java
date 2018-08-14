package com.choucair.formacion.definition;

import java.sql.SQLException;
import java.util.List;

import com.choucair.formacion.steps.DB2Steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class DB2Definition {
	
	@Steps
	DB2Steps db2Steps;
	
	@Given("^Consultar CNAME$")
	public void consultar_CNAME(DataTable dtDatosPrueba) throws SQLException  {
		List<List<String>> data = dtDatosPrueba.raw();	
		db2Steps.Consultar_CNAME(data);
	}

}
