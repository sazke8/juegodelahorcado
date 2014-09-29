package com.Ahorcado.Controllers;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.Ahorcado.Modelo.Usuario;
import com.Ahorcado.Services.UserBean;
@ManagedBean(name="main2")
@ApplicationScoped
public class MainGUI {

	
	
	public String entrarAlSistema(){
		UserBean usuario=new UserBean() ;
      if(usuario.login()==true){
    	  return "felicidades entraste";
      }
      else{
    	  return "no entraste";
      }
		
		
	}
	
	public String registrar(){
		Usuario user=new Usuario();
		
		ControlPrincipal control=new ControlPrincipal();
		if(control.registroUsuario(user))
		
		
	}
}
