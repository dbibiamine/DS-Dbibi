package org.TP1.Entites;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Client implements Serializable {
	
	private long Code;
	private String Nom;
	private String Prenom;
	private Date DateN;
	
	public long getCode() {
		return Code;
	}
	public void setCode(long code) {
		Code = code;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public Date getDateN() {
		return DateN;
	}
	public void setDateN(Date dateN) {
		DateN = dateN;
	}
	
	public Client () {
		super();	
	}
	public Client(Date DateN) {
		super();
		this.DateN = DateN;
	}
	
	
	
	

}
