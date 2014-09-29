package com.Ahorcado.Controllers;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.Ahorcado.Modelo.Usuario;
import com.Ahorcado.Services.UserBean;
@ManagedBean(name="main2")
@ApplicationScoped
public class MainGUI {

	String estado="esperando registro";
	
	public String entrarAlSistema(){
		UserBean usuario=new UserBean() ;
      if(usuario.login()==true){
    	  return "felicidades entraste";
      }
      else{
    	  return "no entraste";
      }
		
		
	}
	
	public void registrar(Usuario user){
		
		ControlPrincipal control=new ControlPrincipal();
		if(!control.registroUsuario(user)){
		
		this.setEstado("el usuario ha sido registrado");
    	}
	
		
		else{
			this.setEstado("Error ");
		}
}
	
	public ArrayList<Usuario> mostrarTop10(){
		ControlPrincipal control=new ControlPrincipal();
	
			ArrayList<Usuario> lista = null;
			try {
				lista = control.MostrarTodos();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return lista;
		
	}
	
	

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	

}