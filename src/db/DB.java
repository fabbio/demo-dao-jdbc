package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DB {
	
	//criando uma vari�vel est�tica para conex�o com o banco
	public static Connection conn = null;
	
	//criar um m�todo static getconnection para me retornar uma conex�o com o banco
	public static Connection getConnection() {
		
		//Testar se a conex�o est� nula
		if(conn == null) {
		//Trato a excess�o aqui porque estou acessando um recurso externo	
			try {
				
				Properties props = loadProperties();
				
				String url = props.getProperty("dburl");
				conn = DriverManager.getConnection(url,props);
				
			} catch (SQLException e) {
				// TODO: handle exception
				throw new DbException(e.getMessage());
			}
		}
		return conn;
	}
	
	//M�todo para carregar as propriedades do banco
	public static Properties loadProperties() {
		
		//Vou acessar um recurso externo ao programa
		try(FileInputStream fs = new FileInputStream("db.properties")) {
			
			//Crio um objeto para acessar as propriedade
			Properties props = new Properties();
			props.load(fs);
			
			return props;
			
		} catch (IOException e) {
			// TODO: handle exception
			throw new DbException(e.getMessage());
		}
		
	}
	//M�todo para desconectar do banco de dados e liberar recursos.
	public static void closeConnetion() {
		
		if(conn != null) {
			//Liberar um recurso externo, logo uso try/catch
			try {
				conn.close();
				
			} catch (SQLException e) {
				// TODO: handle exception
				throw new DbException(e.getMessage());
			}
		}
	}
	
	public static void closeStatement(Statement st) {
		if(st != null) {
			try {
				st.close();
				
			}  catch (SQLException e) {
				// TODO: handle exception
				throw new DbException(e.getMessage());
			}
		}
		
	}
	public static void closeResultSet(ResultSet rs) {
		if(rs != null) {
			try {
				rs.close();
				
			}  catch (SQLException e) {
				// TODO: handle exception
				throw new DbException(e.getMessage());
			}
		}
		
	}
	

}
