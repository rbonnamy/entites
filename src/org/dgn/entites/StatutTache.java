package org.dgn.entites;

/**
 * Statut d'une tâche planifiée
 * 
 * @author DIGINAMIC
 *
 */
public enum StatutTache {

	/** A_FAIRE : StatutTache */
	A_FAIRE("A faire"),

	/** EN_COURS : StatutTache */
	EN_COURS("En cours"),

	/** TERMINEE : StatutTache */
	TERMINEE("Terminée");

	/** libelle : String */
	private String libelle;

	/**
	 * Constructor
	 * 
	 * @param libelle
	 *            libellé
	 */
	private StatutTache(String libelle) {
		this.libelle = libelle;
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
}
