package org.dgn.entites;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Représente un suivi stagiares
 * 
 * @author Mélanie
 *
 */
@Entity
@Table(name = "SUIVI_STAGIAIRE_APRES_FORMATION")
public class SuiviStagiairesApresFormation {

	/** id : Long */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/** session : Session */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_SESSION")
	private Session session;

	/** centre : Centre */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_CENTRE")
	private Centre centre;

	/** utilisateur : Utilisateur */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_UTILISATEUR")
	private Utilisateur utilisateur;

	/** societeFinDeFormation : String */
	@Column(name = "SOCIETE_FF")
	private String societeFinDeFormation;

	/** recruteFinFormation : Boolean */
	@Column(name = "RECRUTE_FF")
	private Boolean recruteFinFormation;

	/** societeClientFinaleFinFormation : Societe */
	@Column(name = "SOCIETE_CLIENT_FINALE_FF")
	private String societeClientFinaleFinFormation;

	/** dateEmbaucheFinFormation : LocalDate */
	@Column(name = "DATE_EMBAUCHE_FF")
	private LocalDate dateEmbaucheFinFormation;

	/** societe3MoisApres : Societe */
	@Column(name = "SOCIETE_3MA")
	private String societe3MoisApres;

	/** recrute3MoisApres : Boolean */
	@Column(name = "RECRUTE_3MA")
	private Boolean recrute3MoisApres;

	/** societeClientFinale3MoisApres : Societe */
	@Column(name = "SOCIETE_CLIENT_FINALE_3MA")
	private String societeClientFinale3MoisApres;

	/** dateEmbauche3MA : LocalDate */
	@Column(name = "DATE_EMBAUCHE_3MA")
	private LocalDate dateEmbauche3MA;

	/** societe6MoisApres : Societe */
	@Column(name = "SOCIETE_6MA")
	private String societe6MoisApres;

	/** recrute6MoisApres : Boolean */
	@Column(name = "RECRUTE_6MA")
	private Boolean recrute6MoisApres;

	/** societeClientFinale6MoisApres : Societe */
	@Column(name = "SOCIETE_CLIENT_FINALE_6MA")
	private String societeClientFinale6MoisApres;

	/** dateEmbauche6MA : LocalDate */
	@Column(name = "DATE_EMBAUCHE_6MA")
	private LocalDate dateEmbauche6MA;

	/** remarque : String */
	@Column(name = "REMARQUE")
	private String remarque;

	/** abandon : boolean */
	@Column(name = "ABANDON")
	private Boolean abandon;

	/** dateAbandon : LocalDate */
	@Column(name = "DATE_ABANDON")
	private LocalDate dateAbandon;

	/**
	 * Constructor
	 * 
	 */
	public SuiviStagiairesApresFormation() {
		super();
	}

	@Override
	public String toString() {
		return "SuiviStagiairesApresFormation [id=" + id + ", session=" + session + ", centre=" + centre
				+ ", utilisateur=" + utilisateur + ", societeFinDeFormation=" + societeFinDeFormation
				+ ", recruteFinFormation=" + recruteFinFormation + ", societeClientFinaleFinFormation="
				+ societeClientFinaleFinFormation + ", dateEmbaucheFinFormation=" + dateEmbaucheFinFormation
				+ ", societe3MoisApres=" + societe3MoisApres + ", recrute3MoisApres=" + recrute3MoisApres
				+ ", societeClientFinale3MoisApres=" + societeClientFinale3MoisApres + ", dateEmbauche3MA="
				+ dateEmbauche3MA + ", societe6MoisApres=" + societe6MoisApres + ", recrute6MoisApres="
				+ recrute6MoisApres + ", societeClientFinale6MoisApres=" + societeClientFinale6MoisApres
				+ ", dateEmbauche6MA=" + dateEmbauche6MA + ", remarque=" + remarque + ", abandon=" + abandon
				+ ", dateAbandon=" + dateAbandon + "]";
	}

	/**
	 * Getter
	 * 
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Setter
	 * 
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Getter
	 * 
	 * @return the session
	 */
	public Session getSession() {
		return session;
	}

	/**
	 * Setter
	 * 
	 * @param session the session to set
	 */
	public void setSession(Session session) {
		this.session = session;
	}

	/**
	 * Getter
	 * 
	 * @return the centre
	 */
	public Centre getCentre() {
		return centre;
	}

	/**
	 * Setter
	 * 
	 * @param centre the centre to set
	 */
	public void setCentre(Centre centre) {
		this.centre = centre;
	}

	/**
	 * Getter
	 * 
	 * @return the utilisateur
	 */
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	/**
	 * Setter
	 * 
	 * @param utilisateur the utilisateur to set
	 */
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	/**
	 * Getter
	 * 
	 * @return the societeFinDeFormation
	 */
	public String getSocieteFinDeFormation() {
		return societeFinDeFormation;
	}

	/**
	 * Setter
	 * 
	 * @param societeFinDeFormation the societeFinDeFormation to set
	 */
	public void setSocieteFinDeFormation(String societeFinDeFormation) {
		this.societeFinDeFormation = societeFinDeFormation;
	}

	/**
	 * Getter
	 * 
	 * @return the recruteFinFormation
	 */
	public Boolean getRecruteFinFormation() {
		return recruteFinFormation;
	}

	/**
	 * Setter
	 * 
	 * @param recruteFinFormation the recruteFinFormation to set
	 */
	public void setRecruteFinFormation(Boolean recruteFinFormation) {
		this.recruteFinFormation = recruteFinFormation;
	}

	/**
	 * Getter
	 * 
	 * @return the societeClientFinaleFinFormation
	 */
	public String getSocieteClientFinaleFinFormation() {
		return societeClientFinaleFinFormation;
	}

	/**
	 * Setter
	 * 
	 * @param societeClientFinaleFinFormation the societeClientFinaleFinFormation to set
	 */
	public void setSocieteClientFinaleFinFormation(String societeClientFinaleFinFormation) {
		this.societeClientFinaleFinFormation = societeClientFinaleFinFormation;
	}

	/**
	 * Getter
	 * 
	 * @return the dateEmbaucheFinFormation
	 */
	public LocalDate getDateEmbaucheFinFormation() {
		return dateEmbaucheFinFormation;
	}

	/**
	 * Setter
	 * 
	 * @param dateEmbaucheFinFormation the dateEmbaucheFinFormation to set
	 */
	public void setDateEmbaucheFinFormation(LocalDate dateEmbaucheFinFormation) {
		this.dateEmbaucheFinFormation = dateEmbaucheFinFormation;
	}

	/**
	 * Getter
	 * 
	 * @return the societe3MoisApres
	 */
	public String getSociete3MoisApres() {
		return societe3MoisApres;
	}

	/**
	 * Setter
	 * 
	 * @param societe3MoisApres the societe3MoisApres to set
	 */
	public void setSociete3MoisApres(String societe3MoisApres) {
		this.societe3MoisApres = societe3MoisApres;
	}

	/**
	 * Getter
	 * 
	 * @return the recrute3MoisApres
	 */
	public Boolean getRecrute3MoisApres() {
		return recrute3MoisApres;
	}

	/**
	 * Setter
	 * 
	 * @param recrute3MoisApres the recrute3MoisApres to set
	 */
	public void setRecrute3MoisApres(Boolean recrute3MoisApres) {
		this.recrute3MoisApres = recrute3MoisApres;
	}

	/**
	 * Getter
	 * 
	 * @return the societeClientFinale3MoisApres
	 */
	public String getSocieteClientFinale3MoisApres() {
		return societeClientFinale3MoisApres;
	}

	/**
	 * Setter
	 * 
	 * @param societeClientFinale3MoisApres the societeClientFinale3MoisApres to set
	 */
	public void setSocieteClientFinale3MoisApres(String societeClientFinale3MoisApres) {
		this.societeClientFinale3MoisApres = societeClientFinale3MoisApres;
	}

	/**
	 * Getter
	 * 
	 * @return the dateEmbauche3MA
	 */
	public LocalDate getDateEmbauche3MA() {
		return dateEmbauche3MA;
	}

	/**
	 * Setter
	 * 
	 * @param dateEmbauche3MA the dateEmbauche3MA to set
	 */
	public void setDateEmbauche3MA(LocalDate dateEmbauche3MA) {
		this.dateEmbauche3MA = dateEmbauche3MA;
	}

	/**
	 * Getter
	 * 
	 * @return the societe6MoisApres
	 */
	public String getSociete6MoisApres() {
		return societe6MoisApres;
	}

	/**
	 * Setter
	 * 
	 * @param societe6MoisApres the societe6MoisApres to set
	 */
	public void setSociete6MoisApres(String societe6MoisApres) {
		this.societe6MoisApres = societe6MoisApres;
	}

	/**
	 * Getter
	 * 
	 * @return the recrute6MoisApres
	 */
	public Boolean getRecrute6MoisApres() {
		return recrute6MoisApres;
	}

	/**
	 * Setter
	 * 
	 * @param recrute6MoisApres the recrute6MoisApres to set
	 */
	public void setRecrute6MoisApres(Boolean recrute6MoisApres) {
		this.recrute6MoisApres = recrute6MoisApres;
	}

	/**
	 * Getter
	 * 
	 * @return the societeClientFinale6MoisApres
	 */
	public String getSocieteClientFinale6MoisApres() {
		return societeClientFinale6MoisApres;
	}

	/**
	 * Setter
	 * 
	 * @param societeClientFinale6MoisApres the societeClientFinale6MoisApres to set
	 */
	public void setSocieteClientFinale6MoisApres(String societeClientFinale6MoisApres) {
		this.societeClientFinale6MoisApres = societeClientFinale6MoisApres;
	}

	/**
	 * Getter
	 * 
	 * @return the dateEmbauche6MA
	 */
	public LocalDate getDateEmbauche6MA() {
		return dateEmbauche6MA;
	}

	/**
	 * Setter
	 * 
	 * @param dateEmbauche6MA the dateEmbauche6MA to set
	 */
	public void setDateEmbauche6MA(LocalDate dateEmbauche6MA) {
		this.dateEmbauche6MA = dateEmbauche6MA;
	}

	/**
	 * Getter
	 * 
	 * @return the remarque
	 */
	public String getRemarque() {
		return remarque;
	}

	/**
	 * Setter
	 * 
	 * @param remarque the remarque to set
	 */
	public void setRemarque(String remarque) {
		this.remarque = remarque;
	}

	/**
	 * Getter
	 * 
	 * @return the abandon
	 */
	public Boolean getAbandon() {
		return abandon;
	}

	/**
	 * Setter
	 * 
	 * @param abandon the abandon to set
	 */
	public void setAbandon(Boolean abandon) {
		this.abandon = abandon;
	}

	/**
	 * Getter
	 * 
	 * @return the dateAbandon
	 */
	public LocalDate getDateAbandon() {
		return dateAbandon;
	}

	/**
	 * Setter
	 * 
	 * @param dateAbandon the dateAbandon to set
	 */
	public void setDateAbandon(LocalDate dateAbandon) {
		this.dateAbandon = dateAbandon;
	}

}
