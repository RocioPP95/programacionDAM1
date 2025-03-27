package ej55Evaluacion;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class APP {
	public static void main(String[] args) {
		Evaluacion e = new Evaluacion();
		DecimalFormat format = new DecimalFormat("#,###.0");
		e.addNota("1234A", BigDecimal.valueOf(9.2));
		e.addNota("1232C", BigDecimal.valueOf(3.9));
		e.addNota("4452X", BigDecimal.valueOf(7.9));
		e.addNota("0923S", BigDecimal.valueOf(8.1));
		e.addNota("8273R", BigDecimal.valueOf(4.2));
		System.out.println(e);
		e.addNota("0923S", BigDecimal.valueOf(3.3));
		System.out.println(e);
		e.corregirNota("0923S", BigDecimal.valueOf(3.3));
		e.corregirNota("0923Z", BigDecimal.valueOf(3.3));
		System.out.println(e);
		System.out.println(format.format( e.obtenerNotaAlumno("0923S")));
		System.out.println(format.format(e.obtenerNotaMedia()));
		System.out.println(e.obtenerCantidadAprobados());
		System.out.println(e.obtenerSuspensos());
		e.borrarAprobados();
		System.out.println(e);

	}
}
