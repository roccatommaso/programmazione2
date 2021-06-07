import java.util.Set;
import java.util.TreeSet;

public class Varco {
	private RegolaAccesso regolaAccesso;
	private TreeSet<Veicolo> multati = new TreeSet<>();
	public Varco(RegolaAccesso regolaAccesso) {
		this.regolaAccesso = regolaAccesso;
	};

	public void convalidaEntrata(Veicolo v1) {
		if (this.regolaAccesso != null) {
			if (this.regolaAccesso.multa(v1)) {
				this.multati.add(v1);
			};
		};
	};

	public Set<Veicolo> getMultati() {
		return this.multati;
	}

	@Override
	public String toString() {
		String f = "Varco [regolaAccesso=" + regolaAccesso.getDescrizione() + ", multati=[ ";
		for(Veicolo v : multati) {
			if (v!=null)
				f+=v.getTarga()+" ";
		};
		return f+"]]";
	};

}
