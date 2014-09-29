package com.Ahorcado.Services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.faces.context.FacesContext;

public class DAOManager {
	private static final long serialVersionUID = 9204275723046653468L;
    private String db_server   = "localhost/3306"; 
    private String db_user     = "root";
    private String db_password = "";
    private String db_driver   = "com.mysql.jdbc.Driver";

    public Connection connection = null;

    public DAOManager() throws Exception {
    	  inicia();
    
    }

    public void inicia(){
    	FacesContext fc = FacesContext.getCurrentInstance();
        db_server   = fc.getExternalContext().getInitParameter("DB-SERVER");
        db_user     = fc.getExternalContext().getInitParameter("DB-USER");
        db_password = fc.getExternalContext().getInitParameter("DB-PASSWORD");
        db_driver   = fc.getExternalContext().getInitParameter("JDBC-DRIVER");
        try {
			Class.forName(db_driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     

    }
         

    public Connection Conectar() throws Exception{
        if( this.connection == null ){
            this.connection = DriverManager.getConnection(db_server, db_user, db_password);
            this.connection.setAutoCommit(false);
        }else if( this.connection.isClosed() ){
            this.connection = null;
            this.connection = DriverManager.getConnection(db_server, db_user, db_password);
            this.connection.setAutoCommit(false);
        }
        return this.connection;
    }

    public void Desconectar(){
        try {
            if( this.connection != null ){
                this.connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
