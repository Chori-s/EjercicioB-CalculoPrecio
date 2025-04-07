package Ejercicio;

import java.util.Scanner;

public class EjercicioB {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Pedir datos al usuario
	        System.out.print("Introduzca la base imponible: ");
	        double baseImponible = scanner.nextDouble();

	        System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
	        String tipoIVA = scanner.next();

	        System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
	        String codigoPromocion = scanner.next();

	        // Calcular el precio con IVA
	        double porcentajeIVA = 0;
	        if (tipoIVA.equalsIgnoreCase("general")) {
	            porcentajeIVA = 0.21;
	        } else if (tipoIVA.equalsIgnoreCase("reducido")) {
	            porcentajeIVA = 0.10;
	        } else if (tipoIVA.equalsIgnoreCase("superreducido")) {
	            porcentajeIVA = 0.04;
	        }

	        double precioConIVA = baseImponible + (baseImponible * porcentajeIVA);

	        // Aplicar código promocional
	        double precioFinal = precioConIVA;
	        if (codigoPromocion.equalsIgnoreCase("mitad")) {
	            precioFinal = precioConIVA / 2;
	        } else if (codigoPromocion.equalsIgnoreCase("meno5")) {
	            precioFinal = precioConIVA - 5;
	        } else if (codigoPromocion.equalsIgnoreCase("5porc")) {
	            precioFinal = precioConIVA * 0.95;
	        }

	        // Mostrar resultados
	        System.out.printf("Base imponible        %.2f\n", baseImponible);
	        System.out.printf("Precio con IVA        %.2f\n", precioConIVA);
	        System.out.printf("TOTAL                 %.2f\n", precioFinal);

	        scanner.close();
	    }
	}

	

