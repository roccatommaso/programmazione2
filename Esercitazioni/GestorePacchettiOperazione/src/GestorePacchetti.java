import java.util.ArrayList;
public class GestorePacchetti {
	ArrayList<Operazione> operazioniDaEseguire = new ArrayList<>();
	public GestorePacchetti() {
	}
	
	public GestorePacchetti(Operazione primaOperazione) {
		this.aggiungiOperazione(primaOperazione);
	};
	
	public void aggiungiOperazione(Operazione operazione) {
		this.operazioniDaEseguire.add(operazione);
	};
	
	public String[] formattaPacchetto(String[] pacchetto) {
		try {
			for(Operazione op : this.operazioniDaEseguire)
				pacchetto = op.esegui(pacchetto);
		} catch(OperazioneException e) {
			return null;
		};
		return pacchetto;
	};

}
