package array;

public class Array {
public static void main(String[] args) {
	
	//i es la posición y x lo que va dentro
	
	Integer[] numeros =new Integer [15];
	Integer x=2;
	//llenar el array con los pares del 1 al 30
	for (int i=0;i<numeros.length;i++) {
		numeros[i]=x;
		x=x+2;
		
	}
	//Imprimir lo que hat en el array
	for (int i = 0; i < numeros.length; i++) {
		System.out.println(numeros[i]);
		
	}

	
	
		
	}
}

