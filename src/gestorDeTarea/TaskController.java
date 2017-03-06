package gestorDeTarea;

import java.util.ArrayList;

import dao.TaskDAOImplement;


public class TaskController {
	
	protected static TaskController unique_instance = null;
	
	/**
     * Class constructor
     */

    public static TaskController getInstance() {
        if (unique_instance == null)
            unique_instance = new TaskController();
        return unique_instance;
    }
    
    /*
     * Class methods
     */
	
	public void addTask(TaskModel task){
		TaskDAOImplement taskDao = new TaskDAOImplement();
		taskDao.addTaskDAO(task);				
	}
	
	public void updateTask(TaskModel task, String t){
		TaskDAOImplement taskDao = new TaskDAOImplement();
		taskDao.updateTaskDAO(task,t);
	}
	
	public void markComplete(String tittle){
            TaskDAOImplement taskDao = new TaskDAOImplement();
            taskDao.markCompleteDAO(tittle);
	}
	
	public void deleteTask(String tittle){
            TaskDAOImplement taskDao = new TaskDAOImplement();
            taskDao.deleteTaskDAO(tittle);
		
	}
	
	public TaskModel findByTittle(String tittle){
            TaskDAOImplement taskDao = new TaskDAOImplement();
            TaskModel myTask = new TaskModel();
            myTask =taskDao.findByTittleDAO(tittle);
            return myTask;
	}
	
	public ArrayList<TaskModel> listOfTask(){
            TaskDAOImplement taskDao = new TaskDAOImplement();
            ArrayList<TaskModel> myList = new ArrayList<TaskModel>();
            
            myList = taskDao.listOfTaskDAO();
            return myList;
            
            
	}
	
	
}
	
