package Arq;
import java.util.Scanner;
import java.lang.Long;
import java.lang.String;
import java.lang.System;
//Alumna: Maribel Santiago Bautista
public class ConversorDecimalBinario {
    // Este metodo convierte el numero base ingresado a decimal. 
    public static long convertToDecimal(String number, int base) {
        return Long.parseLong(number, base);
    }
    // Este método convierte el numero decimal ingresado a otra base.
    public static String convertFromDecimal(long number, int base) {
        return Long.toString(number, base).toUpperCase();
    }
    // El metodo principal del conversor.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero que desea convertir:");
        String number = scanner.nextLine();

        System.out.println("Ingrese la base del numero ya sea (2, 8, 10, 16, 18...):");
        int fromBase = scanner.nextInt();

        System.out.println("Ingrese la base a la que desea convertir (2, 8, 10, 16):");
        int toBase = scanner.nextInt();

        // Esto convierte el numero ingresado a decimal.
        long decimalNumber = convertToDecimal(number, fromBase);

        // Esto convierte el numero decimal ingresado a la base que se desea convertir. 
        String convertedNumber = convertFromDecimal(decimalNumber, toBase);

        System.out.println("La conversion del numero ingresado es: " + convertedNumber);
    }
}


