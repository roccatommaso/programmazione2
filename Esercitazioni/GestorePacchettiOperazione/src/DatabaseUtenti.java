import java.util.Hashtable;


public class DatabaseUtenti {
	private Hashtable<String, String> database;
	
	/* Costruisce un oggetto DatabaseUtenti opportunamente popolato */
	public DatabaseUtenti(){
		database = new Hashtable<String, String>();
		database.put("tizio", "passwdtizio");
		database.put("caio", "passwdcaio");
		database.put("sempronio", "passwdsempronio");
	}

	/* Restituisce la password associata ad un utente */
	public String getPasswordPerUtente(String utente) {
		return database.get(utente);
	}

}
