package com.crossjoin.lojaapp.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_produto")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idprod;

	private String nomeprod;
	private String marcaprod;
	private String dispprod;

	public Long getIdprod() {
		return idprod;
	}

	public void setIdprod(Long idprod) {
		this.idprod = idprod;
	}

	public String getNomeprod() {
		return nomeprod;
	}

	public void setNomeprod(String nomeprod) {
		this.nomeprod = nomeprod;
	}

	public String getMarcaprod() {
		return marcaprod;
	}

	public void setMarcaprod(String marcaprod) {
		this.marcaprod = marcaprod;
	}

	public String getDispprod() {
		return dispprod;
	}

	public void setDispprod(String dispprod) {
		this.dispprod = dispprod;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dispprod, idprod, marcaprod, nomeprod);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(dispprod, other.dispprod) && Objects.equals(idprod, other.idprod)
				&& Objects.equals(marcaprod, other.marcaprod) && Objects.equals(nomeprod, other.nomeprod);
	}

}
