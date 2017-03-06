package dao;

import java.util.ArrayList;

import gestorDeTarea.TaskModel;

public interface TaskDAO{
	
	public void addTaskDAO(TaskModel task);
	
	public void updateTaskDAO(TaskModel task, String t);
	
	public void markCompleteDAO(String tittle);
	
	public void deleteTaskDAO(String task);
	
	public TaskModel findByTittleDAO(String tittle);
	
	public ArrayList<TaskModel> listOfTaskDAO();
	
	
}
