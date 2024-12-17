package tema3;

public class Repaso7 {
	public static void main(String[] args) {
		Integer[] listaNotas = new Integer[] { 7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10 };
		Integer i=0;
		for ( i = 0; i < listaNotas.length; i++) {
			Integer nota = listaNotas[i];
			if (i%2==0) {
			 listaNotas[i]=nota*2;
				
			}
		}
		for ( i = 0; i < listaNotas.length; i++) {
			System.out.print(listaNotas[i]+" ");
			
		}
		
	}

}
