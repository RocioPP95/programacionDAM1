
import java.util.Scanner;

public class AppFecha {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Fecha fecha = new Fecha("", "", "");
		
		
		System.out.println("Introduce el dia actual ");
		fecha.setDia(sc.nextLine());
		System.out.println("Introduce el mes actual");
		fecha.setMes(sc.nextLine());
		System.out.println("Introduce el año actual");
		fecha.setAño(sc.nextLine());
		System.out.println(fecha);
		if (!fecha.validarFechaActual()) {
			System.out.println("La fecha no es la fecha actual");
		}else {
			System.out.println("Fecha correcta");
		}
		
		
		sc.close();

	}
}
