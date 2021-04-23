
public class CassettaPosta {
	private int numeroLettere;
	private int numeroLettereMax;
	private String nome;
	
	public CassettaPosta(String nome, int numeroLettereMax) {
		this.nome = nome;
		this.numeroLettere = 0;
		this.numeroLettereMax = numeroLettereMax;
	};
	
	public CassettaPosta(String nome) {
		this(nome,5);
	};
	
	public boolean inserisciLettera() {
		if (numeroLettere<numeroLettereMax) {
			numeroLettere++;
			return true;
		};
		return false;
	};
	
	public int prelevaPosta() {
		int numero = numeroLettere;
		numeroLettere = 0;
		return numero;
	};
	
	public boolean equals(CassettaPosta altra) {
		if (altra == this)
			return true;
		if (altra == null)
			return false;
		if (altra.getNome().equals(nome))
			return true;
		return false;
	};
	
	public String toString() {
		return "CassettaPosta [numeroLettere=" + numeroLettere + ", numeroLettereMax=" + numeroLettereMax + ", nome="
				+ nome + "]";
	}
	
	public String getNome() {
		return nome;
	};
	
}
