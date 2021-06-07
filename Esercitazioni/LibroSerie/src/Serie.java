import java.util.HashSet;

public class Serie extends Monografia {
	private HashSet<Monografia> monografie = new HashSet<>();
	public Serie(Monografia[] monografie, String titolo, String autore) throws MonografiaInvalidaException {
		super(titolo,autore);
		if (monografie==null)
			throw new MonografiaInvalidaException();
		for(Monografia mono : monografie) {
			this.aggiungiMonografia(mono);
		};
	}

	public int numPagine() {
		int res=0;
		for(Monografia mono : this.monografie)
			res+=mono.numPagine();
		return res;
	}

	public int getNumMonografie() {
		return this.monografie.size();
	}

	public int contaLibriNonSerie() {
		int res=0;
		for(Monografia mono : this.monografie)
			if (mono instanceof Libro)
				res++;
		return res;
	}

	public void aggiungiMonografia(Monografia mono) throws MonografiaInvalidaException {
		if (mono.getAutore().equals(getAutore()))
			this.monografie.add(mono);
		else
			throw new MonografiaInvalidaException();
	}

	@Override
	public String toString() {
		String res = "Serie [ titolo="+getTitolo()+", autore="+getAutore()+", numPagine="+numPagine()+", monografie=[";
		for(Monografia mono : this.monografie)
			res += " +"+mono.toString()+"+ ";
		res += "] ]";
		return res;
	}

}
