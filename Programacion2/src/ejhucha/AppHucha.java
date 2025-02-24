package ejhucha;

import java.math.BigDecimal;

public class AppHucha {
	public static void main(String[] args) {
		Hucha hucha = new Hucha();
		System.out.println(hucha);

		hucha.meterDinero(new BigDecimal(100));
		System.out.println(hucha);

		hucha.meterDinero(new BigDecimal(50.501));
		System.out.println(hucha);

		hucha.sacarDinero(new BigDecimal(20.5));
		System.out.println(hucha);

		hucha.sacarDinero(new BigDecimal(200));
		System.out.println(hucha);

		hucha.meterDinero(new BigDecimal(130));
		System.out.println(hucha);

		hucha.meterDinero(hucha.contarDinero());
		System.out.println(hucha);
		
		hucha.meterDinero(hucha.romperHucha());
		System.out.println(hucha);
	}
}
