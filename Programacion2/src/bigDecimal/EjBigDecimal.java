package bigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class EjBigDecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		BigDecimal x = new BigDecimal(10.55);
		BigDecimal y = new BigDecimal("5");

		System.out.println("Introduce un numero");
		BigDecimal c = sc.nextBigDecimal();

		BigDecimal suma = x.add(y);
		BigDecimal resta = x.subtract(y);
		BigDecimal multi = x.multiply(y);
		BigDecimal division = x.divide(y, 2, RoundingMode.HALF_DOWN);

		BigDecimal z = new BigDecimal("1234565.7");
		DecimalFormat formato = new DecimalFormat("#,###.00");
		System.out.println(formato.format(z));
//setScale para redondear el numero
		suma = suma.setScale(1, RoundingMode.HALF_DOWN);

		sc.close();
	}

}
