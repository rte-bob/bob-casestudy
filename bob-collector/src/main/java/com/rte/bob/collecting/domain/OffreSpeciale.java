package com.rte.bob.collecting.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 * 
 * @author wbenmbarek
 * 
 */
@Entity(name= "offre_speciale")
public class OffreSpeciale {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected Long id;
	
	@Column( length=100)
	private String idOffre;
	
	@Column(length=100 ,name="reference_offre")
	private String reference_offre;
	
	
	@Column(length = 100)
	private String eda;
	

	@Column(length = 100)
	private String acteur;
	

	@Column(length = 100)
	private String sens;


	@Column(length = 100)
	
	private String indiceDemarrage;
	

	@Column(length = 100)
	private String prix;
	

	@Column(length = 100)
	private Date heureDebut;
	
	

	@Column(length = 100)
	private Date heureFin;
	

	@Column(length = 100)
	private String idOffrePrecident;
	
/*
 *  gerate getter and setters 
 */
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIdOffre() {
		return idOffre;
	}

	public void setIdOffre(String idOffre) {
		this.idOffre = idOffre;
	}


	

	public String getReference_offre() {
		return reference_offre;
	}

	public void setReference_offre(String reference_offre) {
		this.reference_offre = reference_offre;
	}

	public String getEda() {
		return eda;
	}

	public void setEda(String eda) {
		this.eda = eda;
	}

	public String getActeur() {
		return acteur;
	}

	public void setActeur(String acteur) {
		this.acteur = acteur;
	}

	public String getSens() {
		return sens;
	}

	public void setSens(String sens) {
		this.sens = sens;
	}

	public String getIndiceDemarrage() {
		return indiceDemarrage;
	}

	public void setIndiceDemarrage(String indiceDemarrage) {
		this.indiceDemarrage = indiceDemarrage;
	}

	public String getPrix() {
		return prix;
	}

	public void setPrix(String prix) {
		this.prix = prix;
	}

	public Date getHeureDebut() {
		return heureDebut;
	}

	public void setHeureDebut(Date heureDebut) {
		this.heureDebut = heureDebut;
	}

	public Date getHeureFin() {
		return heureFin;
	}

	public void setHeureFin(Date heureFin) {
		this.heureFin = heureFin;
	}

	public String getIdOffrePrecident() {
		return idOffrePrecident;
	}

	public void setIdOffrePrecident(String idOffrePrecident) {
		this.idOffrePrecident = idOffrePrecident;
	}
	
	
	

}
