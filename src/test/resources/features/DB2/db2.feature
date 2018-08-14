#@tag
Feature: Title of your feature
#  I want to use this template for my feature file

  @CasoFeliz
  Scenario Outline: Consultar tablas clientes y verificar resultados
    Given Consultar CNAME
    | <documento>  |  <tipo docto>  |  <nombre>  | <control tercero> |
    
    Examples: 
      | documento       | tipo docto | nombre  				|  control tercero |
      | 000008000003931 |     3			 | PERFORMANCE 		| 			8					 |
      | 000008000004576 |     3			 | ELIANA MORALES | 			1					 | 	 
