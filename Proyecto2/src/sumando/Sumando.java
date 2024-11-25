package sumando;

import java.util.Scanner;

public class Sumando {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Dame el primer número: ");
		double num1 = scanner.nextDouble();
		
		System.out.print("Dame el segundo número: ");
		double num2 = scanner.nextDouble();
		
		double suma = num1 + num2;
		
		System.out.print("La suma entre los dos numeros es: " + suma);
		
		scanner.close();
	}

}
