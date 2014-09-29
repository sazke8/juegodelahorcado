package com.Ahorcado.Controllers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.Ahorcado.Modelo.Usuario;
import com.Ahorcado.Services.DAOManager;

public class ControlPrincipal {

	
	public boolean registroUsuario(Usuario user){
		DAOManager sql=new DAOManager();
		
		String nombre=user.getUsuario();
		user.setPartidasGanadas(0);
		user.setPartidasPerdidas(0);
		user.setPartidasJugadas(0);
		boolean bandera=sql.ejecutarSQL(user.getUsuario());
		return bandera;
		
	}
	public void iniciarJuego(Usuario user){
		
	}
	
	public ArrayList<Usuario> MostrarTopTen(){
		return null;
		
	}
	
	
	public ArrayList<Usuario> MostrarTodos() throws SQLException{
		DAOManager sql=new DAOManager();
		ResultSet result=sql.realizarConsulta("select *from usuarios");
		ArrayList<Usuario> list = new ArrayList<Usuario>();
		 
		while(result.next()){
			Usuario user = new Usuario();
 
			user.setId(result.getInt("id"));
			user.setUsuario(result.getString("Nombre"));
			user.setPartidasGanadas(result.getInt("PartidasGanadas"));
			user.setPartidasJugadas(result.getInt("PartidasJugadas"));
			user.setPartidasPerdidas(result.getInt("PartidasPerdidas"));
			 
			list.add(user);
		}
 
		return list;
	}
		
		
	}

