package org.dgn.entites;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * Représente une tâche planifiée associée à une session
 * 
 * @author DIGINAMIC
 *
 */
@Entity
@Table(name = "TACHE_PLANIFIEE")
public class TachePlanifiee {

	/** id : Long */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/** libelle : String */
	@Column(name = "LIBELLE")
	private String libelle;

	/** dateFin : LocalDateTime */
	@Column(name = "DATE_FIN")
	private LocalDateTime dateFin;

	/** commentaires : String */
	@Column(name = "COMMENTAIRES", length = 500)
	private String commentaires;

	/** order : int */
	@Column(name = "TACHE_ORDER")
	private Integer order;

	/** statutTache : StatutTache */
	@Column(name = "STATUT")
	@Enumerated(EnumType.STRING)
	private StatutTache statut;

	/** todoListe : TodoListePlanifiee */
	@ManyToOne
	@JoinColumn(name = "ID_CHP")
	private TodoListePlanifiee todoListe;

	/**
	 * Constructeur
	 */
	public TachePlanifiee() {

	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(id).toHashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof TachePlanifiee)) {
			return false;
		}

		TachePlanifiee other = (TachePlanifiee) obj;
		return new EqualsBuilder().append(this.id, other.getId()).isEquals();
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
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Getter for dateFin
	 * 
	 * @return the dateFin
	 */
	public LocalDateTime getDateFin() {
		return dateFin;
	}

	/**
	 * Setter
	 * 
	 * @param dateFin
	 *            the dateFin to set
	 */
	public void setDateFin(LocalDateTime dateFin) {
		this.dateFin = dateFin;
	}

	/**
	 * Getter
	 * 
	 * @return the commentaires
	 */
	public String getCommentaires() {
		return commentaires;
	}

	/**
	 * Setter
	 * 
	 * @param commentaires
	 *            the commentaires to set
	 */
	public void setCommentaires(String commentaires) {
		this.commentaires = commentaires;
	}

	/**
	 * Getter
	 * 
	 * @return the statut
	 */
	public StatutTache getStatut() {
		return statut;
	}

	/**
	 * Setter
	 * 
	 * @param statut
	 *            the statut to set
	 */
	public void setStatut(StatutTache statut) {
		this.statut = statut;
	}

	/**
	 * Getter
	 * 
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * Setter
	 * 
	 * @param libelle
	 *            the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	/**
	 * Getter
	 * 
	 * @return the todoListe
	 */
	public TodoListePlanifiee getTodoListe() {
		return todoListe;
	}

	/**
	 * Setter
	 * 
	 * @param todoListe
	 *            the todoListe to set
	 */
	public void setTodoListe(TodoListePlanifiee todoListe) {
		this.todoListe = todoListe;
	}

	/**
	 * Getter
	 * 
	 * @return the order
	 */
	public Integer getOrder() {
		return order;
	}

	/**
	 * Setter
	 * 
	 * @param order
	 *            the order to set
	 */
	public void setOrder(Integer order) {
		this.order = order;
	}
}
