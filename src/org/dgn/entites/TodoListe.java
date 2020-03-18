package org.dgn.entites;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Représente un template de liste des tâches à effectuer dans le cadre de la préparation d'une nouvelle session de formation
 * 
 * @author DIGINAMIC
 *
 */
@Entity
@Table(name = "CHECK_LISTE")
@Cacheable(value = true)
public class TodoListe {

	/** identifiant */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	/** Nom de la liste */
	@Column(name = "NOM")
	private String nom;

	/** Liste des tâches à effectuer */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "todoListe")
	private List<Tache> taches = new ArrayList<>();

	/** dateMaj : LocalDateTime */
	@Column(name = "DATE_MAJ")
	private LocalDateTime dateMaj;

	/** userMaj : String */
	@Column(name = "USER_MAJ")
	private String userMaj;

	/** previous : TodoListe */
	@OneToOne
	@JoinColumn(name = "ID_PREVIOUS")
	private TodoListe previous;

	/** parent : TodoListe */
	@OneToOne
	@JoinColumn(name = "ID_PARENT")
	private TodoListe parent;

	/** next : TodoListe */
	@OneToOne
	@JoinColumn(name = "ID_NEXT")
	private TodoListe next;

	/**
	 * Constructor
	 */
	public TodoListe() {
	}

	/**
	 * Constructor
	 * 
	 * @param id identifiant
	 */
	public TodoListe(Long id) {
		this.id = id;
	}

	/**
	 * Getter for id
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
	 * Getter for nom
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter
	 * 
	 * @return the taches
	 */
	public List<Tache> getTaches() {
		return taches;
	}

	/**
	 * Setter
	 * 
	 * @param taches the taches to set
	 */
	public void setTaches(List<Tache> taches) {
		this.taches = taches;
	}

	/**
	 * Getter
	 * 
	 * @return the dateMaj
	 */
	public LocalDateTime getDateMaj() {
		return dateMaj;
	}

	/**
	 * Setter
	 * 
	 * @param dateMaj the dateMaj to set
	 */
	public void setDateMaj(LocalDateTime dateMaj) {
		this.dateMaj = dateMaj;
	}

	/**
	 * Getter
	 * 
	 * @return the userMaj
	 */
	public String getUserMaj() {
		return userMaj;
	}

	/**
	 * Setter
	 * 
	 * @param userMaj the userMaj to set
	 */
	public void setUserMaj(String userMaj) {
		this.userMaj = userMaj;
	}

	/**
	 * Getter
	 * 
	 * @return the previous
	 */
	public TodoListe getPrevious() {
		return previous;
	}

	/**
	 * Setter
	 * 
	 * @param previous the previous to set
	 */
	public void setPrevious(TodoListe previous) {
		this.previous = previous;
	}

	/**
	 * Getter
	 * 
	 * @return the parent
	 */
	public TodoListe getParent() {
		return parent;
	}

	/**
	 * Setter
	 * 
	 * @param parent the parent to set
	 */
	public void setParent(TodoListe parent) {
		this.parent = parent;
	}

	/**
	 * Getter
	 * 
	 * @return the next
	 */
	public TodoListe getNext() {
		return next;
	}

	/**
	 * Setter
	 * 
	 * @param next the next to set
	 */
	public void setNext(TodoListe next) {
		this.next = next;
	}

}
