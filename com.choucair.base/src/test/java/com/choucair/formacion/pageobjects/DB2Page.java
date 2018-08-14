package com.choucair.formacion.pageobjects;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import com.choucair.formacion.utilities.Sql_Execute;

import net.serenitybdd.core.pages.PageObject;

public class DB2Page extends PageObject{
	
	public String Armar_query_consulta_CNAME(String strDocumento) {
		String strSQL = "select * from gplilibra.mytmpcname where CNNOSS = '<documento>'";
		strSQL = strSQL.replace("<documento>", strDocumento);
		return strSQL;
	}
	
	public ResultSet Ejecutar_query(String strSQL) throws SQLException {
		Sql_Execute dao = new Sql_Execute();
		ResultSet rs = dao.sql_Execute(strSQL);
		return rs;
	}
	
	public void Verificar_consulta_CNAME(ResultSet rs,List<List<String>> data) throws SQLException {
		
		while(rs.next()) {
			String documento_Recibido = rs.getString(1);
			String documento_Esperado = data.get(0).get(0);
			assertThat(documento_Recibido.trim(),equalTo(documento_Esperado.trim()));
			
			String tipoDcto_Recibido = rs.getString(2);
			String tipoDcto_Esperado = data.get(0).get(1);
			assertThat(tipoDcto_Recibido.trim(),equalTo(tipoDcto_Esperado.trim()));
			
			String nombre_Recibido = rs.getString(3);
			String nombre_Esperado = data.get(0).get(2);
			assertThat(nombre_Recibido.trim(),equalTo(nombre_Esperado.trim()));
			
			String ctrlTer_Recibido = rs.getString(4);
			String ctrlTer_Esperado = data.get(0).get(3);
			assertThat(ctrlTer_Recibido.trim(),equalTo(ctrlTer_Esperado.trim()));
		}
	}

}
