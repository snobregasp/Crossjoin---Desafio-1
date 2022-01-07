package com.crossjoin.lojaapp.model;

//import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.IdClass;

@Entity
//@IdClass(Estoqueid.class)
public class Estoque {
//implements Serializable {

		@Id
		private int idlojaest;

		@Id
		private int idprodest;
		
		
		private String nomelojaest;
		private String nomeprodest;
		private String quantest;
		
		public Estoque( ) {
		}
		
		public Estoque(int idlojaest, int idprodest) {
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
		public String getNomelojaest() {
			return nomelojaest;
		}
		public void setNomelojaest(String nomelojaest) {
			this.nomelojaest = nomelojaest;
		}
		public String getNomeprodest() {
			return nomeprodest;
		}
		public void setNomeprodest(String nomeprodest) {
			this.nomeprodest = nomeprodest;
		}
		public String getQuantest() {
			return quantest;
		}
		public void setQuantest(String quantest) {
			this.quantest = quantest;
		}
		@Override
		public int hashCode() {
			return Objects.hash(idlojaest, idprodest, nomelojaest, nomeprodest, quantest);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Estoque other = (Estoque) obj;
			return idlojaest == other.idlojaest && idprodest == other.idprodest
					&& Objects.equals(nomelojaest, other.nomelojaest) && Objects.equals(nomeprodest, other.nomeprodest)
					&& Objects.equals(quantest, other.quantest);
		}
}
