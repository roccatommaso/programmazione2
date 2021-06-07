
public class Libro extends Monografia {
	private int numPagine;
	public Libro(String titolo, String autore, int numeroPagine) throws MonografiaInvalidaException {
		super(titolo,autore);
		if (numeroPagine<=0)
			throw new MonografiaInvalidaException();
		this.numPagine=numeroPagine;
	}

	public int numPagine() {
		// TODO Auto-generated method stub
		return this.numPagine;
	}

}
