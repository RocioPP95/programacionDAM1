package Semaforo;

public class AppSemaforo {
	public static void main(String[] args) {

		Boolean parpadeando;
		Integer contador = 0;
		Semaforo semaforo = new Semaforo();

		semaforo.setColor("amarillo");
		System.out.println(semaforo);
		semaforo.setParpadeando(true);
		System.out.println(semaforo);
		semaforo.setColor(Semaforo.VERDE);
		System.out.println(semaforo);
		semaforo.setParpadeando(true);
		System.out.println(semaforo);
		semaforo.setColor(Semaforo.AMBAR);
		System.out.println(semaforo);
		semaforo.setParpadeando(true);
		System.out.println(semaforo);

		while (contador < 5) {
			semaforo.cambiarEstado();
			contador++;
		}
		System.out.println(semaforo);
		Semaforo semaforo2 = new Semaforo();
		semaforo2.setColor(semaforo.getColor());
		semaforo2.setParpadeando(semaforo.getParpadeando());

		System.out.println(semaforo);

	}
}
