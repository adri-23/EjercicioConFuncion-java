import java.util.Scanner;

public class EjercicioConFuncion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer = new Scanner(System.in);
		System.out.println("¿cual es tu nombre ?");
		String nombre = leer.nextLine();
		System.out.println(saludo(nombre));
	}

	public static String saludo(String saludo) {
		return "hola, "+ saludo; 
	}
}
