package conecction;

import java.sql.*;

public class DbConnection {
	static String bd = "schema";
	static String login = "root";
    static String password = "";
    static String url = "jdbc:mysql://localhost/task";
	 
    Connection connection = null;

    // Constructor de DbConnection 
    public DbConnection() {
       try{
          
          Class.forName("com.mysql.jdbc.Driver");
          
          connection = DriverManager.getConnection(url,login,password);
  
          if (connection!=null){
             System.out.println("Conexión a base de datos "+bd+" OK\n");
          }
       }
       catch(SQLException e){
          System.out.println(e);
       }catch(ClassNotFoundException e){
          System.out.println(e);
       }catch(Exception e){
          System.out.println(e);
       }
    }
    
    //Permite retornar la conexión
    
    public Connection getConnection(){
       return connection;
    }
  
    public void desconectar(){
       connection = null;
    }
 }

