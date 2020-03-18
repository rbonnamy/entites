package org.dgn.entites;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * Liste de tâches à effectuer pour une session spécifique
 * 
 * @author DIGINAMIC
 *
 */
@Entity
@Table(name = "CHECK_LISTE_PLANIFIEE")
public class TodoListePlanifiee {

	/** identifiant */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	/** nom : String */
	@Column(name = "NOM")
	private String nom;

	/** Liste de tâches modèle */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_CHECKLISTE")
	private TodoListe todoListe;

	/**
	 * Liste des tâches planifiées pour la session: cette liste peut évoluer par rapport au template avec + ou - de tâches
	 */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "todoListe")
	private List<TachePlanifiee> taches = new ArrayList<>();

	/** Session rattachée */
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_SESSION")
	private Session session;

	/**
	 * Constructeur
	 */
	public TodoListePlanifiee() {

	}

	/**
	 * Constructor
	 * 
	 * @param id identifiant de la liste
	 * @param nom nom de la liste
	 */
	public TodoListePlanifiee(Long id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof TodoListePlanifiee)) {
			return false;
		}
		TodoListePlanifiee other = (TodoListePlanifiee) object;
		return new EqualsBuilder().append(id, other.getId()).isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(id).toHashCode();
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
	 * Getter for session
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
	 * @return the taches
	 */
	public List<TachePlanifiee> getTaches() {
		return taches;
	}

	/**
	 * Setter
	 * 
	 * @param taches the taches to set
	 */
	public void setTaches(List<TachePlanifiee> taches) {
		this.taches = taches;
	}

	/**
	 * Getter
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
	 * @return the todoListe
	 */
	public TodoListe getTodoListe() {
		return todoListe;
	}

	/**
	 * Setter
	 * 
	 * @param todoListe the todoListe to set
	 */
	public void setTodoListe(TodoListe todoListe) {
		this.todoListe = todoListe;
	}
}
