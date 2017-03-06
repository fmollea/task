package gestorDeTarea;

import java.util.UUID;

public class TaskModel {
    
    private String tittle;
    private String description;
    private int complete;

    public TaskModel(){
    	
    	tittle = "";
        description = "";
        complete = 0;
    }
    
    public TaskModel(String t, String d){
        
    	tittle = t;
        description = d;
        complete = 0;
    }
    
    //sets and gets
    
    public void setTittle(String t){
        tittle= t;
    }
    
    public String getTittle(){
        return tittle;
    }
    
    public void setDescription(String descr){
        description = descr;
    }

    public String getDescription(){
        return description;
    }

    // true = 1, false = 0
    public void setComplete(int compl){
      complete = compl;
    }
    
    // true = 1, false = 0
    public int getComplete(){
      return complete;
    }


}
