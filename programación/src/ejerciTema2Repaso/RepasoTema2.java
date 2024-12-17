package ejerciTema2Repaso;

public class RepasoTema2 {
	public static void main(String[] args) {
		
		String palabra= "ehhmondongo";
		
		String palabraMay = palabra.toUpperCase(); //cambia la palabra a mayusculas 
		System.out.println(palabraMay);
		
		String palabraMin = palabraMay.toLowerCase(); // cambia la palabra a minusculas
		System.out.println(palabraMin);
		
		String palabraSinEsp = palabra.trim();  // quita los espacios
		System.out.println(palabraSinEsp);
		
		Integer longitud= palabra.length(); //para contar carácteres
		System.out.println(longitud);
		
		
//		String palabra = "";
		 
		if (palabra.contains("mondo")) {
			System.out.println("Contiene mondo");
		}
		if (palabra.startsWith("ehh")){
			System.out.println("Empieza por ehh");
		}
		if (palabra.endsWith("Go")) {
			System.out.println("Termina en Go");
		}
		if (palabra.isEmpty()) {
			System.out.println("La palabra no tiene nada");
		}
		if (palabra.isBlank()) {
			System.out.println("Sólo tiene espacios o nada");
		}
		
		String palabra1 = "ehhmongongo";
		
		if (palabra1.startsWith("ehh")) {
			System.out.println("Empieza por ehh");
		}
		if (palabra1.endsWith("Go")) {
			System.out.println("Termina en Go");
		}
		if (palabra1.isEmpty()) {
			System.out.println("la palabra no tiene nada");
		}
		
	

}
}
