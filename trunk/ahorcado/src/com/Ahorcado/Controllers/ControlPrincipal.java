package com.Ahorcado.Controllers;

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
		boolean bandera=sql.ejecutarSQL("insert into usuarios (Nombre,PartidasJugadas,PartidasPerdidas,PartidasGanadas) values('?',0,0,0)",user.getUsuario());
		return bandera;
		
	}
	public void iniciarJuego(Usuario user){
		
	}
	
	public ArrayList<Usuario> MostrarTopTen(){
		return null;
		
	}
}
