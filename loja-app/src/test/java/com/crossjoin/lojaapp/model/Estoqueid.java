package com.crossjoin.lojaapp.model;

//import java.io.Serializable;
import java.util.Objects;

public class Estoqueid {
 //implements Serializable
	private int idlojaest;
	private int idprodest;
	
	public Estoqueid( ) {
	}
	
	public Estoqueid(int idlojaest, int idprodest) {
		this.idlojaest = idlojaest;
		this.idprodest = idprodest;
	}

	public int getIdlojaest() {
		return idlojaest;
	}

	public void setIdlojaest(int idlojaest) {
		this.idlojaest = idlojaest;
	}

	public int getIdprodest() {
		return idprodest;
	}

	public void setIdprodest(int idprodest) {
		this.idprodest = idprodest;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idlojaest, idprodest);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estoqueid other = (Estoqueid) obj;
		return idlojaest == other.idlojaest && idprodest == other.idprodest;
	}

}
