import java.util.ArrayList;

import javax.swing.JOptionPane;

/* 1. Un estudiante gan� un premio correspondiente a un viaje a una ciudad que elija, haga un algoritmo que solicite al estudiante 
 * su nombre, 
 * documento, 
 * tel�fono y el c�digo de la ciudad a la que quiere viajar
 * e imprima un comprobante indicando los datos anteriores m�s:
 *  el d�a del viaje y la ciudad seleccionada.	

C�digo 			Nombre			Fecha y Hora

1				Medell�n		6 de octubre � 8 am
2				Bogot�			10 de noviembre 6 pm
3				Cartagena		5 de abril 2 pm
4				Barranquilla	4 de mayo 4 am

Haga esto para varios estudiantes y use estructuras de datos para almacenar la informaci�n e imprimir, 
cada que se procese un estudiante se mostrar� la informaci�n y cuando ya no se desee procesar a nadie m�s, 
el sistema deber� imprimir la lista completa de todos los estudiantes y sus resultados.

*/


public class Procesos {
	
	ArrayList <String> ganador = new ArrayList <>();
	
	public void Agregar () {
		
		String nombre = JOptionPane.showInputDialog("Ingrese su Nombre");
		String documento = JOptionPane.showInputDialog("Ingrese su Documento");
		
	}

}
