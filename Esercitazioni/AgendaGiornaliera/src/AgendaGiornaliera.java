/**
 * 
 */

/**
 * @author Francesco
 *
 */
public class AgendaGiornaliera {
	private Studente [] appuntamenti;
	private int giorno;
	private String docente;
	
	/**
	 * @param giorno
	 * @param docente
	 */
	public AgendaGiornaliera(String docente, int giorno, int numeroAppuntamentiGiornalieri) {
		this.giorno = giorno;
		this.docente = docente;
		appuntamenti = new Studente[numeroAppuntamentiGiornalieri];
	}
	
	public AgendaGiornaliera(String docente, int giorno) {
		this(docente,giorno,6);
	};
	
	public boolean isLibero(int slot) {
		if (slot>=0 && slot<appuntamenti.length)
			return (appuntamenti[slot] == null);
		return false;
	};
	
	public int getNumeroAppuntamentiGiornalieri() {
		return appuntamenti.length;
	};
	
	public Studente getStudente(int slot) {
		return appuntamenti[slot];
	};
	
	public boolean prenota(Studente studente, int orario) {
		if (esisteAppuntamento(studente))
			return false;
		if (isLibero(orario)) {
			appuntamenti[orario] = studente;
			return true;
		};
		return false;
	};
	
	public boolean prenota(Studente studente) {
		if (studente == null)
			return false;
		if (esisteAppuntamento(studente))
			return false;
		for(int i=0; i<appuntamenti.length; i++) {
			if (appuntamenti[i] == null) {
				appuntamenti[i] = studente;
				return true;
			};
		};
		return false;
	};
	
	private boolean esisteAppuntamento(Studente studente) {
		for(Studente altro : appuntamenti) {
			if (altro != null)
				if (altro.equals(studente))
					return true;
		};
		return false;
	};
	
	public boolean annulla(Studente studente) {
		if (esisteAppuntamento(studente)) {
			for(int i=0; i<appuntamenti.length; i++) {
				if (appuntamenti[i] != null)
					if (appuntamenti[i].equals(studente)) {
						appuntamenti[i] = null;
						return true;
					};
			};
		};
		return false;
	}

	/**
	 * @return the giorno
	 */
	public int getGiorno() {
		return giorno;
	}

	/**
	 * @return the docente
	 */
	public String getDocente() {
		return docente;
	};
}
