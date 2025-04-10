package ejemploPastaService;

import java.math.BigDecimal;
import java.sql.SQLException;

public class App {

	public static void main(String[] args) {

		Divisa divisa = new Divisa();
		divisa.setCodigo("EUR");
		divisa.setDescripcion("Euro");
		divisa.setPais("Europa");
		divisa.setConversion(BigDecimal.ONE);

		PastaService service = new PastaService();
//
//		try {
//			service.crearDivisa(divisa);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}

		try {
			service.actualizarConversionDivisa("EUR", BigDecimal.TWO);
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}
}
