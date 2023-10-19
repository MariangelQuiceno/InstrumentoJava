import javax.swing.JOptionPane;

/* 4. Halle el área de un triángulo rectángulo si su base y altura son de un valor desconocido (área=(base*altura)/2), 
este proceso debe realizarlo n veces y valide que no permita el ingreso de números negativos. */

public class AreaTriangulo {
public static void main(String[] args) {
	int opcion = 0;
	
	do {
		
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Altura"));
		double base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Base"));
		
		if (altura < 0 || base < 0 || base < 0 && altura < 0) {
			JOptionPane.showMessageDialog(null, "No pueden haber numeros negativos", "Error", JOptionPane.ERROR_MESSAGE);
		}else {
			double area = (base * altura) / 2;
			String msj = "El area del triangulo es: " + area;
			opcion = JOptionPane.showConfirmDialog(null, msj + " \n ¿Desea probar con otro? ", "Confirmar", JOptionPane.YES_NO_OPTION);
		}
		
	}while(opcion != JOptionPane.NO_OPTION);
}

}
