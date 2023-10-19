import java.util.ArrayList;

import javax.swing.JOptionPane;

/* 1. Un estudiante ganó un premio correspondiente a un viaje a una ciudad que elija, haga un algoritmo que solicite al estudiante 
 * su nombre, 
 * documento, 
 * teléfono y el código de la ciudad a la que quiere viajar
 * e imprima un comprobante indicando los datos anteriores más:
 *  el día del viaje y la ciudad seleccionada.	

Código 			Nombre			Fecha y Hora

1				Medellín		6 de octubre – 8 am
2				Bogotá			10 de noviembre 6 pm
3				Cartagena		5 de abril 2 pm
4				Barranquilla	4 de mayo 4 am

Haga esto para varios estudiantes y use estructuras de datos para almacenar la información e imprimir, 
cada que se procese un estudiante se mostrará la información y cuando ya no se desee procesar a nadie más, 
el sistema deberá imprimir la lista completa de todos los estudiantes y sus resultados.

*/


public class Procesos {
	
	ArrayList <String> ganador = new ArrayList <>();
	
	public void Agregar () {
		
		String nombre = JOptionPane.showInputDialog("Ingrese su Nombre");
		String documento = JOptionPane.showInputDialog("Ingrese su Documento");
		
	}

}
