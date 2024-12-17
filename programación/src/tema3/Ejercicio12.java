package tema3;

import java.util.Scanner;

public class Ejercicio12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String web;

		System.out.println("Introduce dirección web: ");
		web = sc.nextLine();
		String[] parte = web.split("//");
		String[] parte1 = parte[1].split("\\.");
		System.out.println(parte[0]);
		for (int i = 0; i < parte1.length; i++) {
			System.out.println(parte1[i]);
		}

		sc.close();
	}

}
