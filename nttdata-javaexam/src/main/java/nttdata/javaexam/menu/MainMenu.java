package nttdata.javaexam.menu;

import java.util.Scanner;

public class MainMenu {

	static final Scanner scanner = new Scanner(System.in);

	public static void main() {
		final int MAXOPT = 12;
		int opt;
		do {
			System.out.println("Menú de gestión");
			System.out.println("1. Añadir alumno");
			System.out.println("2. Eliminar alumno");
			System.out.println("3. Editar alumno");
			System.out.println("4. Listar alumnos");
			System.out.println("5. Listar alumnos alfabeticamente");
			System.out.println("6. Listar alumnos por edad");
			System.out.println("7. Listar alumnos por centro");
			System.out.println("8. Exportar alumnos a un archivo de texto");
			System.out.println("9. Exportar alumnos a un archivo binario");
			System.out.println("10. Exportar alumnos a un archivo xml");
			System.out.println("11. Exprotar alumnos a un archivo JSON");
			System.out.println("12. Recuperar alumnos de un archivo");
			System.out.println("Selecciona una opcion [ 0 - Salir ]: ");
			opt = Integer.parseInt(scanner.nextLine());
			if (opt == 0)
				break;
		} while (opt < 0 || opt > MAXOPT);

	}

}
