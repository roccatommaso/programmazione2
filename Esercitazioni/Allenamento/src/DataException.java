
public class DataException extends Exception {
	private static final long serialVersionUID = 1L;
	String cause;
	DataException(String line) {
		this.cause = line;
	};
}
