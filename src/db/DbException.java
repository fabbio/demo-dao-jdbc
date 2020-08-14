package db;

public class DbException extends RuntimeException {

	/**
	 * Usar esse excess�o para que n�o seja preciso tratar todas as excess�es 
	 * dos pacotes jdbc
	 */
	private static final long serialVersionUID = 1L;
	
	public DbException (String msg) {
		super(msg);
	}
	

}
