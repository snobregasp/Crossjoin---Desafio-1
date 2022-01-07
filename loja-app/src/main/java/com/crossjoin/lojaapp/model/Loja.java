package com.crossjoin.lojaapp.model;

import java.util.Objects;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name = "tbl_loja")
public class Loja {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idloja;

	private String nomeloja;
	private String moradaloja;
	private String cidadeloja;
	private String regiaoloja;
	private int telefloja;
	private int outra;

	public int getOutra() {
		return outra;
	}

	public void setOutra(int outra) {
		this.outra = outra;
	}

	public Long getIdloja() {
		return idloja;
	}

	public void setIdloja(Long idloja) {
		this.idloja = idloja;
	}

	public String getNomeloja() {
		return nomeloja;
	}

	public void setNomeloja(String nomeloja) {
		this.nomeloja = nomeloja;
	}

	public String getMoradaloja() {
		return moradaloja;
	}

	public void setMoradaloja(String moradaloja) {
		this.moradaloja = moradaloja;
	}

	public String getCidadeloja() {
		return cidadeloja;
	}

	public void setCidadeloja(String cidadeloja) {
		this.cidadeloja = cidadeloja;
	}

	public String getRegiaoloja() {
		return regiaoloja;
	}

	public void setRegiaoloja(String regiaoloja) {
		this.regiaoloja = regiaoloja;
	}

	public int getTelefloja() {
		return telefloja;
	}

	public void setTelefloja(int telefloja) {
		this.telefloja = telefloja;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cidadeloja, idloja, moradaloja, nomeloja, regiaoloja, telefloja);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Loja other = (Loja) obj;
		return Objects.equals(cidadeloja, other.cidadeloja) && Objects.equals(idloja, other.idloja)
				&& Objects.equals(moradaloja, other.moradaloja) && Objects.equals(nomeloja, other.nomeloja)
				&& Objects.equals(regiaoloja, other.regiaoloja) && telefloja == other.telefloja;
	}

}
