import java.util.ArrayList;

import javax.swing.JOptionPane;

/* 2. Construya un programa que permita a un usuario ingresar las ventas mensuales de una tienda durante un tiempo determinado 
(debe indicar la cantidad de meses a calcular). El programa debe calcular el 
promedio mensual de ventas, 
el mes con las ventas más altas y 
el mes con las ventas más bajas. 
Almacena esta información en un arreglo o una estructura de datos adecuada e imprime la información. */

public class PrincipalVentas {
public static void main(String[] args) {
	
	int opcion = 0;
	
	do {
	
	int numMeses = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido al algoritmo: Calcular Ventas Mensuales \n\n" + "Ingrese la cantidad de meses a calcular"));
	
	ArrayList <Integer> ventasMensuales = new ArrayList <>();
	ArrayList <String> mes = new ArrayList <>();
	
	for (int i = 0; i < numMeses; i++) {
		String meses = JOptionPane.showInputDialog("Ingrese el nombre del mes " + (i+1));
		int ventas =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de ventas para el mes: " + meses));
		
		mes.add(meses);
		ventasMensuales.add(ventas);
	}
	
	int maxVentas = 0;
	String maxMes = "";
	
	for (int i = 0; i < ventasMensuales.size(); i++) {
		if(ventasMensuales.get(i) > maxVentas) {
			maxVentas = ventasMensuales.get(i);
			maxMes = mes.get(i);
		}	
	}
	
	int minVentas = Integer.MAX_VALUE;
	String minMes = "";
	
	for (int i = 0; i < ventasMensuales.size(); i++) {
		if(ventasMensuales.get(i) < minVentas) {
			minVentas = ventasMensuales.get(i);
			minMes = mes.get(i);
		}	
	}
	
	int sumaVentas = 0;
	
	for (int venta : ventasMensuales) {
		sumaVentas += venta;
	}
	
	int promedioVentas = sumaVentas / numMeses;
	
	String msj = "Reporte de ventas: \n\n" +
	"Mes con la ventas mas altas: " + maxMes + " - " + maxVentas + " Ventas \n" +
	"Mes con la ventas mas bajas: " + minMes + " - " + minVentas + " Ventas\n" +
	"Promedio de Ventas: " + promedioVentas + " Ventas \n\n";
	
	opcion = JOptionPane.showConfirmDialog(null, msj + "¿Desea empezar de nuevo?", "Reporte", JOptionPane.CANCEL_OPTION);
	
	}while(opcion != JOptionPane.CANCEL_OPTION);
	

}

}
