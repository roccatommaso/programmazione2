
public class Autenticazione implements Operazione {
	private DatabaseUtenti database;
	
	public Autenticazione(DatabaseUtenti database) {
		this.database = database;
	};
	
	public String [] esegui(String [] pacchetto) throws OperazioneException {
		if (pacchetto == null || pacchetto.length<2 || pacchetto[0]==null || pacchetto[1]==null)
			throw new OperazioneException();
		String nomeUtente = pacchetto[0];
		String password = pacchetto[1];
		String res = this.database.getPasswordPerUtente(nomeUtente);
		if (!(password.equals(res)))
			throw new OperazioneException();
		String [] pacchetto2 = new String[pacchetto.length-2];
		for(int i=0; i<pacchetto2.length; i++)
			pacchetto2[i] = pacchetto[i+2];
		return pacchetto2;
	};
}
