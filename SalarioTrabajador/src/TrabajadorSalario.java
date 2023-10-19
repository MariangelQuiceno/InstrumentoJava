import javax.swing.JOptionPane;

/*3. Algoritmo que solicite el nombre de un trabajador, documento y horas trabajadas, calcule lo que gana teniendo en 
cuenta que cada hora se paga a 2000, adicionalmente se le realiza 
unos descuentos con respecto a un impuesto de seguridad del 10% sobre su salario solo para los de mas de 4 años de antigüedad. */

public class TrabajadorSalario {
public static void main(String[] args) {
	
	String nombre = JOptionPane.showInputDialog("Bienvenido al algoritmo: Calcular Salario\n\n" + "Ingrese su Nombre");
	String documento = JOptionPane.showInputDialog("Ingrese su Documento");
	int horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas trabajadas"));
	int pregunta = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos años lleva en la empresa?"));
	
	int horasPago = 2000;
	
	if(pregunta > 4) {
		int pagoHoras = (horas * horasPago);
		double pagoFinal =  pagoHoras - (pagoHoras * 0.1) ;
		
		String msj = "Hola ¡" + nombre + "! \n\n" +
				"Documento: " + documento + " \n" +
				"Horas Trabajadas " + horas + " \n" +
				"Salario: " + pagoFinal + " \n" +
				"Años en la empresa: " + pregunta + "\n\n" +
				"*Recuerde que por llevar mas de 4 años en la empresa se le hace un descuento del 10% en su salario por impuesto de seguridad \n" +
				"¡Usted aplica para el descuento!\n";
				
				JOptionPane.showConfirmDialog(null, msj, "Reporte", JOptionPane.CANCEL_OPTION);			
	}else {
		
		int pagoHoras = (horas * horasPago);
		
		String msj = "Hola ¡" + nombre + "! \n\n" +
				"Documento: " + documento + " \n" +
				"Horas Trabajadas " + horas + " \n" +
				"Salario: " + pagoHoras + " \n" +
				"Años en la empresa: " + pregunta + "\n\n" +
				"*Recuerde que por llevar mas de 4 años en la empresa se le hace un descuento del 10% en su salario por impuesto de seguridad, us \n" +
				"¡Usted no aplica para el descuento!\n";
				JOptionPane.showConfirmDialog(null, msj, "Reporte", JOptionPane.CANCEL_OPTION);			
	}
	
	
}

}
