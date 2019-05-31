package eu.ensup.formulaire.domaine;

/**
 * @author benja
 * Classe m�tier CompteCourant
 * Utilise {@link Compte}
 */
public class CompteCourant extends Compte {

	private float decouvert;

	public CompteCourant(float decouvert) {
		super();
		this.decouvert = decouvert;
	}

	@Override
	public String toString() {
		return "CompteCourant [decouvert=" + decouvert + "]";
	}

	public float getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(float decouvert) {
		this.decouvert = decouvert;
	}
	
	
}
