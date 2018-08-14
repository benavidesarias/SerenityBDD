#Author: andres benavides - abenavides@choucairtesting.com
@Regresion
Feature: Formulario Popup Validation
  El usuario debe poder ingresar al formulario los datos requeridos
  Cada campo del formulario realiza validaciones de obligatoriedad,
  longitud y formato, el sistema debe presentar las validaciones respectivas
  para cada campo a través de un globo informativo.
  

  @CasoExitoso
  Scenario: Diligenciamiento exitoso del fomulario Popup Validation,
  					no se presenta ningun mensaje de validacion 
 		Given Autentico en colorlib con usuario "demo" y clave "demo"
  		And Ingreso a la funcionalidad Forms Validation
  	When Diligencio Formulario Block Validation
  		| Requeried | email | password    | confirmpassword | date         |      url    | digits | range | check |
  		| valor1    | a@b.c |    abcdef   |     abcdef      | 08/02/2018   | http://a.c  |  121   |  6    |  true |
  	Then Verifico Block_Validation Exitoso
  	
   @CasoAlterno
   Scenario: Diligenciamiento con errores del fomulario Popup Validation
   Given Autentico en colorlib con usuario "demo" y clave "demo"
  		And Ingreso a la funcionalidad Forms Validation
  	When Diligencio Formulario Block Validation
  		| Requeried | email | password    | confirmpassword | date         |      url    | digits | range | check |
  		| valor1    | a@b.c |    abcdef   |     123456      | 08/02/2018   | http://a.c  |  121   |  6    |  true |
  	Then Verifico Block_Validation Fallido