
public class Sostituzione implements Operazione {
	private String stringaDaSostituire,stringaSostituita;
	public Sostituzione(String stringaDaSostituire, String stringaSostituita) {
		this.stringaDaSostituire = stringaDaSostituire;
		this.stringaSostituita = stringaSostituita;
	};
	
	public String [] esegui(String [] pacchetto) throws OperazioneException {
		if (pacchetto == null)
			throw new OperazioneException();
		for(int i=0; i<pacchetto.length; i++) {
			if (pacchetto[i] != null) {
				pacchetto[i] = pacchetto[i].replace(stringaDaSostituire,stringaSostituita);
			};
		};
		return pacchetto;
	};
}
