/**
 * 
 */

/**
 * @author Francesco
 *
 */
public class Studente {
	private String cognome;
	private int matricola;
	
	/**
	 * @return the cognome
	 */
	public String getCognome() {
		return cognome;
	}
	/**
	 * @return the matricola
	 */
	public int getMatricola() {
		return matricola;
	}
	
	/**
	 * @param cognome
	 * @param matricola
	 */
	public Studente(String cognome, int matricola) {
		this.cognome = cognome;
		this.matricola = matricola;
	}
	
	/**
	 * @return stringa rappresentazione
	 */
	public String toString() {
		return "Studente [cognome=" + cognome + ", matricola=" + matricola + "]";
	}
	
	/**
	 * equals
	 */
	public boolean equals(Studente altro) {
		if (altro == this)
			return true;
		if (altro == null)
			return false;
		if (altro.getMatricola() == matricola)
			return true;
		return false;
	}
	
	
}
