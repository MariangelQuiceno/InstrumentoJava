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

public class PrincipalViaje {
public static void main(String[] args) {
	PrincipalViaje.menu();
}

public static void menu (){
	int opcion = 0;
	
	
	
	String msj = "�Bienvenido! \n\n Felicidades por ganar el premio :) \n\n" +
	"1.Registrarse para el Viaje \n" +
	"2. Imprimir Comprobante\n" +
	"3. Salir \n" +
	"Elija una opci�n\n";
	
	int opcionViaje = Integer.parseInt(JOptionPane.showInputDialog(msj));
	

	
	switch (opcionViaje) {
	case 1:
		break;
	case 2:
		break;
	case 3:
		break;
	default:
		JOptionPane.showMessageDialog(null, "Esa opci�n no existe", "Error", JOptionPane.ERROR_MESSAGE);
		PrincipalViaje.menu();
	}
}

}
