package ej50Pais;

import java.util.Objects;

public class Pais {

	private String codigo;
	private String desc;

	public Pais(String codigo, String desc) {
		super();
		this.codigo = codigo.toUpperCase();
		this.desc = desc;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return codigo + " " + desc;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pais other = (Pais) obj;
		return Objects.equals(codigo, other.codigo);
	}
// para mdificar aqui para que sea igual indepedientemente en mayusculas o minusculas se pone 
// en los dos codigos de abajo y en el del hashCode(se pone o todo en mayusculas
// o minusculas o lo que quieras)
}
