package repasoTema2;

import java.util.Scanner;

public class Ejerccio20Repaso2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i2 = 0; i2 < 5; i2++) {
			System.out.println();
			for (int i = 0; i < 5; i++) {
				if (i == i2) {
					System.out.print("* ");

				} else {
					System.out.print("- ");
				}
			}

		}

		sc.close();
	}

}
