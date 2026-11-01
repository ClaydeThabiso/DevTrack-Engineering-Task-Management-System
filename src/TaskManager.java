
import java.util.HashMap;

public class TaskManager {
	private HashMap<String, Task> tasks;
	
	public TaskManager() {
		this.tasks= new HashMap<>();
	}
	
	public boolean addTask(Task task)
	{
	
		if(!tasks.containsKey(task.getId()))
		{
			 tasks.put(task.getId(), task);
			 return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public Task findTaskById(String id) 
	{
	    return tasks.get(id);
	}
	
	public boolean removeTask(String id)
	{
		if(tasks.containsKey(id))
		{
			tasks.remove(id);
			return true;
		}
		else {
			return false;
		}
	}
}
