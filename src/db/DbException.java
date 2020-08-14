package db;

public class DbException extends RuntimeException {

	/**
	 * Usar esse excessão para que não seja preciso tratar todas as excessões 
	 * dos pacotes jdbc
	 */
	private static final long serialVersionUID = 1L;
	
	public DbException (String msg) {
		super(msg);
	}
	

}
