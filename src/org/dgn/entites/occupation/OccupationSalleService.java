package org.dgn.entites.occupation;

import java.util.List;

import org.dgn.entites.Salle;
import org.dgn.entites.Session;

/**
 * Décrit les méthodes de services pour la gestion des occupations de salle
 * 
 * @author DIGINAMIC
 *
 */

public interface OccupationSalleService {

	/**
	 * Retourne les occupations pour une session donnée
	 * 
	 * @param session session
	 * @return List d'Occupation
	 */
	List<OccupationSalle> getOccupations(Session session);

	/**
	 * Détecte un changement d'occupation: nouvelle salle
	 * 
	 * @param salle salle
	 * @param salle2 autre salle
	 * @return boolean
	 */
	boolean changementOccupation(Salle salle, Salle salle2);
}
