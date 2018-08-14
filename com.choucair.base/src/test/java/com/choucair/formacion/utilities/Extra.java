/*
package com.choucair.formacion.utilities;

import static org.junit.Assert.*;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.junit.Test;

//import com.grupobancolombia.oficina.utilidades.XMLUtil;
//import com.grupobancolombia.oficina.utilidades.utilidades;

import utilidades.utilidadesCH;
import myextra.MyExtra_init;
import myextra.Screen;
import myextra._Session;
import myextra._System;

public class Extra {
	public Screen pantalla=null;
	public _Session sesion=null;
	public _System ssystem=null;
	
	public void iniciar_Extra() throws InterruptedException
	{
		
		
		try
		{
			if(utilidadesCH.isProcessRunning("EXTRA.exe"))
			{
				MyExtra_init.cerrarMyExtraAbierto();
			}
			
			MyExtra_init.abrirArchivoDeMyExtra("C:\\Users\\rperezr\\Desktop\\CALIDAD.EDP");
			Thread.sleep(5000);
			ssystem= MyExtra_init.crearSistema();
			sesion=MyExtra_init.crearSesion(ssystem);
			pantalla=MyExtra_init.crearPantalla(sesion);
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	@Test
	public void test() {		
		
		try {
			
			iniciar_Extra();			
			// Interaccion del usuario
			pantalla.putString("CRHPEREZ", 6, 53, null);
			Thread.sleep(2000);
			pantalla.putString("r7vniqk1", 7, 53, null);
			pantalla.sendKeys("<Enter>");
			Thread.sleep(3000);
			pantalla.sendKeys("<Enter>");
			Thread.sleep(3000);
			pantalla.sendKeys("<Enter>");
			Thread.sleep(3000);
			pantalla.sendKeys("<Enter>");
			Thread.sleep(4000);
			pantalla.putString("1", 8, 10, null);
			pantalla.sendKeys("<Enter>");
			Thread.sleep(2000);
			pantalla.putString("1", 18, 8, null);
			pantalla.sendKeys("<Enter>");
			Thread.sleep(2000);
			pantalla.putString("1", 13, 9, null);
			pantalla.sendKeys("<Enter>");
			Thread.sleep(2000);
			pantalla.sendKeys("<Enter>");
			Thread.sleep(2000);
			//Opcional se cerrar�a el MyExtra
			MyExtra_init.cerrarMyExtraAbierto();
			
			System.out.print(pantalla.getString(4, 7, 80, null));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}

*/
