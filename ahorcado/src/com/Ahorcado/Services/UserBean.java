package com.Ahorcado.Services;

import java.sql.Connection;

public class UserBean {

	public boolean login(){ 
		DAOManager conexion=null;
		boolean bandera=false;
		try {
			conexion = new DAOManager();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Connection conn=conexion.Conectar();
			if(conn==null){
				bandera=false;
			}
			else{
				bandera=true;
			
			
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bandera;
	}
	
	public boolean logout(){
		return false;
		
	}
	
}
