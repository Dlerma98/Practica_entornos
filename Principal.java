import java.time.LocalDateTime;
import java.time.Month;

public class Principal {
	public static void main(String[] args) {
		System.out.println("Hola mundo");
		mostrarHora();
		 
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
}