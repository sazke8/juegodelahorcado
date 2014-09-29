package com.Ahorcado.Services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.faces.context.FacesContext;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


public class DAOManager {

	private DataSource ds;

	public DAOManager() {
		try {
			Context ctx = new InitialContext();
			ds = (DataSource) ctx.lookup("java:comp/env/jdbc/sesiones");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

	public Connection Conectar() throws Exception {

		Connection conexion = ds.getConnection();
		return conexion;

	}

	public void Desconectar() {

	}

	public boolean ejecutarSQL(String nombre){
		Connection conexion = null;
		boolean bandera=false;
		try {
			conexion = this.Conectar();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
		PreparedStatement SQL = conexion.prepareStatement("insert into usuarios (Nombre,PartidasJugadas,PartidasPerdidas,PartidasGanadas) values(?,0,0,0)");
		SQL.setString(1, nombre);
		if(SQL.execute()){
			bandera=true;
		}
		else{
			bandera=false;
		}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	return bandera;
		
	}
	
	public ResultSet realizarConsulta(String consulta){
		ResultSet resultado = null;
		Connection conexion = null;
		try {
			conexion = this.Conectar();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
		PreparedStatement SQL = conexion.prepareStatement(consulta);
	resultado=SQL.executeQuery();
		
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	return resultado;
	
		
	}
}
