import java.util.HashSet;
import java.util.Set;

public class RegolaAccessoAPagamento extends RegolaAccesso {
	private Set<String> registroTassePaganti = new HashSet<>();
	public RegolaAccessoAPagamento(String descrizione) {
		super(descrizione);
	};

	public void registraPagamento(String targa) throws VeicoloException {
		if (targa!=null && targa.length()!=0) {
			if (this.registroTassePaganti.contains(targa)) {
				throw new VeicoloException("Targa già registrata");
			} else {
				this.registroTassePaganti.add(targa);
			};
		};
		
	};

	public boolean multa(Veicolo v1) {
		return !(this.registroTassePaganti.contains(v1.getTarga()));
	};
};