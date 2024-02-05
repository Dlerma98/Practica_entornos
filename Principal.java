import java.time.LocalDateTime;
import java.time.Month;
import java.util.Scanner;


public class Principal {
	public static void main(String[] args) {
		System.out.println("Hola mundo");
		mostrarHora();

		int numero = 3;
		Usuario[] resultado = generarAlumnos(numero);
		System.out.println("Lista de usuarios\n-----------------\n");
		for (int i = 0; i < resultado.length; i++) {
				System.out.println((i + 1) + " Usuario" + " Nombre completo:" + resultado[i].nombre + " "+ resultado[i].apellidos + " Email " + resultado[i].email);
		}
		 

	}
	public static void mostrarHora() {
		LocalDateTime locaDate = LocalDateTime.now();
		int dia = locaDate.getDayOfMonth();
		Month mes = locaDate.getMonth();
		int año = locaDate.getYear();
		int horas  = locaDate.getHour();
		int minutos = locaDate.getMinute();
		int segundos = locaDate.getSecond();
		System.out.println("Dia: " + dia + " " + mes + " " + año + " Hora actual : " + horas  + ":"+ minutos +":"+segundos); 
	}

	public static Usuario[] generarAlumnos(int num) {
		Usuario[] usuarios = new Usuario[num];
	
		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < usuarios.length; i++) {
			
			Usuario usuario = new Usuario();
			System.out.println((i + 1) + " Usuario " + "Introduce nombre: ");
			usuario.nombre = teclado.nextLine().trim();

			System.out.println((i + 1) + " Usuario " + "Introduce apellidos: ");
			usuario.apellidos = teclado.nextLine().trim();

			System.out.println((i + 1) + " Usuario " + "Introduce email: ");
			usuario.email = teclado.nextLine().trim();

			usuarios[i] = usuario;
		}
		return usuarios;
	}
}