package eu.ensup.formulaire.service;

import java.util.ArrayList;

import eu.ensup.formulaire.dao.ConseillerDao;
import eu.ensup.formulaire.domaine.Compte;
import eu.ensup.formulaire.domaine.Personne;



/**
 * @author benja
 * Classe service de Conseiller
 */
public class ConseillerService {

	
	ConseillerDao conseillerDao = new ConseillerDao();
	
	/**
	 * @param personne
	 * M�thode creationClient() utilisant la m�thode creationClient() du Dao {@link ConseillerDao}
	 * @return
	 */
	public boolean creationClient(Personne personne) {
		// TODO Auto-generated method stub
		conseillerDao.creationClient(personne);
		
		return true;
	}

	/**
	 * @param id
	 * M�thode afficherInfoClient() utilisant la m�thode afficherInfoClient() du Dao {@link ConseillerDao}
	 * @return
	 */
	public Personne afficherInfoClient(String id) {
		// TODO Auto-generated method stub
		Personne personne = new Personne();
		personne = conseillerDao.afficherInfoClient(id);

		return personne;
	}

	/**
	 * @param personne
	 *  M�thode modificationClient() utilisant la m�thode modificationClient() du Dao {@link ConseillerDao}
	 * @return
	 */
	public boolean modificationClient(Personne personne) {
		// TODO Auto-generated method stub
		conseillerDao.modificationClient(personne);
		return true;
	}

	/**
	 * @param id
	 * M�thode suppressionClient() utilisant la m�thode suppressionClient() du Dao {@link ConseillerDao}
	 * @return
	 */
	public boolean suppressionClient(String id) {
		// TODO Auto-generated method stub
		conseillerDao.suppressionClient(id);
		return true;
	}

	/**
	 * M�thode listeDesClients() utilisant la m�thode listeDesClients() du Dao {@link ConseillerDao}
	 * @return
	 */
	public ArrayList<Personne> listeDesClients() {
		// TODO Auto-generated method stub
		ArrayList<Personne> listePersonnes = new ArrayList<Personne>();
		listePersonnes = conseillerDao.listeDesClients();
		return listePersonnes;
	}
	
	//Permet d'afficher les comptes d'un client
	/**
	 * @param id
	 *  M�thode listeDesComptes() utilisant la m�thode listeDesComptes() du Dao {@link ConseillerDao}
	 * @return
	 */
	public ArrayList<Compte> listeDesComptes(String id)
	{
		ArrayList<Compte> listeDesComptes = new ArrayList<Compte>();
		listeDesComptes = conseillerDao.listeDesComptes(id);
		return listeDesComptes;
		
	}

	
}
