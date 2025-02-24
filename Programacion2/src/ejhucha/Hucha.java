package ejhucha;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Hucha {
	private BigDecimal ahorro;

	public Hucha() {
		super();

		this.ahorro = new BigDecimal(0).setScale(2, RoundingMode.HALF_UP);

	}

	public BigDecimal meterDinero(BigDecimal dinero) {

		return this.ahorro = this.ahorro.add(dinero);

	}

	public BigDecimal sacarDinero(BigDecimal dinero) {
		if (dinero.compareTo(this.ahorro) > 0) {
			BigDecimal dineroDevuelto = this.ahorro;
			this.ahorro = BigDecimal.ZERO;
			return dineroDevuelto;

		}

		this.ahorro = this.ahorro.subtract(dinero);
		return dinero;

	}

	public BigDecimal contarDinero() {
		return this.ahorro;
	}

	public BigDecimal romperHucha() {
		BigDecimal dinero = this.ahorro;
		this.ahorro = BigDecimal.ZERO;
		return dinero;

	}

	@Override
	public String toString() {
		DecimalFormat formato = new DecimalFormat("#,##0.00 €");

		return formato.format(this.ahorro);
	}
}
