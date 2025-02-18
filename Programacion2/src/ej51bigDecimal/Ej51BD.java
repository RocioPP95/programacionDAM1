package ej51bigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.IllegalFormatCodePointException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ej51BD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<BigDecimal> numeros = new ArrayList<>();
		Boolean correcto = true;
		Integer contador = 0;

		for (int i = 0; i < 5; i++) {
			do {
				correcto = true;
				System.out.println("Introduce cinco números: ");
				BigDecimal c = sc.nextBigDecimal();
				numeros.add(c);
				if (i > 0) {
					if (numeros.get(i).compareTo(numeros.get(i - 1)) < 0) {
						correcto = false;

					}
				}

			} while (correcto == false);

		}

		BigDecimal suma = new BigDecimal(0);
		for (BigDecimal bigDecimal : numeros) {
			suma = suma.add(bigDecimal);

		}

		suma = suma.setScale(1, RoundingMode.HALF_DOWN);
		System.out.println(suma);

		BigDecimal division = new BigDecimal(0);

		division = numeros.get(0).divide(numeros.get(1), 3, RoundingMode.HALF_UP);
		System.out.println(division);
		sc.close();
	}

}
