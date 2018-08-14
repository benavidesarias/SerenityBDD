package com.choucair.formacion.steps;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.choucair.formacion.pageobjects.DB2Page;

import net.thucydides.core.annotations.Step;

public class DB2Steps {
	
	DB2Page db2Page;

	@Step
	public void Consultar_CNAME(List<List<String>> data) throws SQLException {
		//Armar el SQL
		String strDocumento = data.get(0).get(0);
		String strSQL = db2Page.Armar_query_consulta_CNAME(strDocumento);
		
		//Ejecutar la consulta
		ResultSet rs = db2Page.Ejecutar_query(strSQL);
		
		//Verificar resultados
		db2Page.Verificar_consulta_CNAME(rs, data);
		
		
	}
	
	

}
