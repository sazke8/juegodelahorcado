package com.Ahorcado.Services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.faces.context.FacesContext;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DAOManager {
	
	private DataSource ds;
	
public DAOManager(){
	 try {
			Context ctx = new InitialContext();
			ds = (DataSource)ctx.lookup("java:comp/env/jdbc/sesiones");
		  } catch (NamingException e) {
			e.printStackTrace();
		  }
}

	public Connection Conectar() throws Exception {

	Connection conexion=ds.getConnection();
	return conexion;
	
	}

	public void Desconectar() {

	}

}
