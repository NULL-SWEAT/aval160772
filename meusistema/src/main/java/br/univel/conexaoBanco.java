package br.univel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexaoBanco {
	
	private static conexaoBanco self;
	
	private Connection con;
	
	private conexaoBanco() {
		
		try {
			
			Class.forName("org.postgresql.Driver");		
			this.con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/prova", "postgres", "univel");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public final static synchronized conexaoBanco getInstance() {
		if (self == null) {
			self = new conexaoBanco();
		}
		return self;
	}
	
	public Connection getConnection() {
		return this.con;
	}

}
