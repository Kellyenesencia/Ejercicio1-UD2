package mostrandodatos;

import java.util.Scanner;

public class MostrandoDatos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Dame tu nombre: ");
		String nombre = scanner.nextLine();
		
		System.out.print("Dame tus apellidos: ");
		String apellidos = scanner.nextLine();
		
		System.out.print("Tu nombre completo es: " + nombre + " " + apellidos);
		
		scanner.close();
		
	}

}
