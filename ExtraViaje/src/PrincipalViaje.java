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

public class PrincipalViaje {
public static void main(String[] args) {
	PrincipalViaje.menu();
}

public static void menu (){
	int opcion = 0;
	
	
	
	String msj = "¡Bienvenido! \n\n Felicidades por ganar el premio :) \n\n" +
	"1.Registrarse para el Viaje \n" +
	"2. Imprimir Comprobante\n" +
	"3. Salir \n" +
	"Elija una opción\n";
	
	int opcionViaje = Integer.parseInt(JOptionPane.showInputDialog(msj));
	

	
	switch (opcionViaje) {
	case 1:
		break;
	case 2:
		break;
	case 3:
		break;
	default:
		JOptionPane.showMessageDialog(null, "Esa opción no existe", "Error", JOptionPane.ERROR_MESSAGE);
		PrincipalViaje.menu();
	}
}

}
