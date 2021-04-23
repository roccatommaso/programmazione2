public class Piatto {
	public static final String PRIMO = "primo";
	public static final String SECONDO = "secondo";
	public static final String DOLCE = "dolce";
	private String categoria;
	private String nome;
	
	public Piatto(String categoria, String nome) {
		this.categoria = categoria;
		this.nome = nome;
	}
	
	public boolean equals(Piatto altro) {
		if (altro == this)
			return true;
		if (altro == null)
			return false;
		if (altro.getCategoria().equals(categoria))
			if (altro.getNome().equals(nome))
				return true;
		return false;
	}

	public String toString() {
		return "Piatto [categoria=" + categoria + ", nome=" + nome + "]";
	}

	public String getCategoria() {
		return categoria;
	}

	public String getNome() {
		return nome;
	}
}
