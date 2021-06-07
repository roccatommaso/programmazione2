
public class DistributoreAutomatico {
	private int numeroMonete;
	public void aggungiMonete(int numeroMonete) {
		// TODO Auto-generated method stub
		if (numeroMonete>0)
			this.numeroMonete+=numeroMonete;
	}

	public int checkNumeroMonete() {
		// TODO Auto-generated method stub
		return numeroMonete;
	}

	public boolean vendi() {
		if (numeroMonete>0) {
			numeroMonete = 0;
			return true;
		};
		// TODO Auto-generated method stub
		return false;
	}
	
	public DistributoreAutomatico() {
		numeroMonete = 0;
	};
	
}
