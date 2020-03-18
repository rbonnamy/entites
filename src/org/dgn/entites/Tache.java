package org.dgn.entites;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Représente une tâche dans une Todo liste
 * 
 * @author DIGINAMIC
 *
 */
@Entity
@Table(name = "TACHE")
@Cacheable(value = true)
public class Tache {

	/** id : Long */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/** libelle : String */
	@Column(name = "LIBELLE")
	private String libelle;

	/** todoListe : TodoListe */
	@ManyToOne
	@JoinColumn(name = "ID_TODO")
	private TodoListe todoListe;

	/**
	 * Constructeur
	 * 
	 */
	public Tache() {

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
	 * Getter for libelle
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
	public TodoListe getTodoListe() {
		return todoListe;
	}

	/**
	 * Setter
	 * 
	 * @param todoListe
	 *            the todoListe to set
	 */
	public void setTodoListe(TodoListe todoListe) {
		this.todoListe = todoListe;
	}
}
