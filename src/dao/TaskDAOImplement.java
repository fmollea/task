package dao;

import java.sql.*;
import java.util.*;
import javax.swing.*;
import conecction.DbConnection;

import gestorDeTarea.*;

public class TaskDAOImplement implements TaskDAO{
	 
    /**
      * add a task	
      * @param task
      */
    public void addTaskDAO(TaskModel task){
        DbConnection conex= new DbConnection();
        try {
			 
            //add a new task in the database
            Statement estatuto = conex.getConnection().createStatement();
            estatuto.executeUpdate("INSERT INTO task (tittle, description, complete) VALUES "
                    + "('"+task.getTittle()+"', '"+task.getDescription()+"', '"+task.getComplete()+"')");
		  
            //show a message
            JOptionPane.showMessageDialog(null, "Tarea creada","Información",JOptionPane.INFORMATION_MESSAGE);
		  
            estatuto.close();
            conex.desconectar();
	    
	} catch (SQLException e) {

            //show a message
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se pudo crear");
        }
    }
	 
    /**
      * update a task
      * @param task
      * @param tittle
     */
    public void updateTaskDAO(TaskModel task, String t) {
		
        DbConnection conex= new DbConnection();
		 
        try {
			  
            //update a task
            Statement estatuto = conex.getConnection().createStatement();
                    
            estatuto.executeUpdate("UPDATE task SET tittle='"+task.getTittle()+"', description='"+task.getDescription()+"' WHERE tittle='"+t+"'");
            
            JOptionPane.showMessageDialog(null, "Tarea modificada");
            
            // close of connection
            estatuto.close();
            conex.desconectar();
			  
			  
	} catch(SQLException e){
			  
            //show a message
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se pudo modificar");			  
	}
    }
	 
	 /**
	  * mark as like complete
	  */
    public void markCompleteDAO(String tittle){
		 
        DbConnection conex= new DbConnection();
		     
        try {
			    
            // update task, complete in 1 (true)
            Statement estatuto = conex.getConnection().createStatement();
            estatuto.executeUpdate("UPDATE task SET complete='"+1+"' WHERE tittle='"+tittle+"'");
            
            JOptionPane.showMessageDialog(null, "Tarea completada");
            // close of connection
            estatuto.close();
            conex.desconectar();
		   
		  
	} catch(SQLException e){
			  
            //show a message
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se pudo marcar");			  
	}
		 
    }
	 
    /**
    * Delete a task
    * @param tittle
    */
    public void deleteTaskDAO(String tittle){
		 
        DbConnection conex= new DbConnection();
		  
        try {
            PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM task WHERE tittle='"+tittle+"'");
            ResultSet res = consulta.executeQuery();;
            
            //delete a task of the database
            Statement estatuto = conex.getConnection().createStatement();
            estatuto.execute("DELETE FROM task WHERE tittle='"+tittle+"'");
           
            //show a message
            if (res.next()){
                JOptionPane.showMessageDialog(null, "Tarea eliminada","Información",JOptionPane.INFORMATION_MESSAGE);
            } else{
                JOptionPane.showMessageDialog(null, "La tarea no existe","Información",JOptionPane.INFORMATION_MESSAGE);
            }
            
            //show a message
            res.close();
            estatuto.close();
            conex.desconectar();
		  
        } catch  (SQLException e) {
                      
            //show a message
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se pudo eliminar");
        }		 
    }
	  
    /**
    * find a task by tittle
    * @param tittle
    * @return task
    */
    public TaskModel findByTittleDAO(String t) {
		  
        TaskModel myTask = new TaskModel();
	DbConnection conex= new DbConnection();
		     
	try {
            PreparedStatement consulta = conex.getConnection().prepareStatement(" SELECT * FROM task WHERE tittle= '"+t+"'");
            ResultSet res = consulta.executeQuery();; 
            
            //advance the pointer
            res.next();
            //myTask.setId(Integer.parseInt(res.getString("id")));
            myTask.setTittle(res.getString("tittle"));
            myTask.setDescription(res.getString("description"));
            myTask.setComplete(Integer.parseInt(res.getString("complete")));
			
            //close the connection
            res.close();
            consulta.close();
	    conex.desconectar();
			
		
	} catch (Exception e) {
			
            //show a message
            JOptionPane.showMessageDialog(null, "Tarea no encontrada");
	}	
		
	return myTask;
    }  
	 
    /**
     *
    * @return get all task
    */
    public ArrayList<TaskModel> listOfTaskDAO() {
	 
	ArrayList<TaskModel> myTask = new ArrayList<TaskModel>();
	DbConnection conex= new DbConnection();
	     
	try {
            PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM task");
            ResultSet res = consulta.executeQuery();
			
            //add task in myTask (arraylist - my list of task)
            while(res.next()){
				
                //set values in a task
		TaskModel task= new TaskModel();
		task.setTittle(res.getString("tittle"));
		task.setDescription(res.getString("description"));
		task.setComplete(Integer.parseInt(res.getString("complete")));
				
		//add the task
		myTask.add(task);
            }
			
            //close the connection
            res.close();
	    consulta.close();
            conex.desconectar();
	    
        } catch (Exception e) {
			
            //show a message
            JOptionPane.showMessageDialog(null, "No se pudo listar las tareas\n"+e);
	}
	return myTask;
    }	 
}
