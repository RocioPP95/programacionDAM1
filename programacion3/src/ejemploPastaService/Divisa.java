package ejemploPastaService;

import java.math.BigDecimal;

public class Divisa {

	private String codigo;
	private String descripcion;
	private String pais;
	private BigDecimal conversion;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public BigDecimal getConversion() {
		return conversion;
	}

	public void setConversion(BigDecimal conversion) {
		this.conversion = conversion;
	}

}
