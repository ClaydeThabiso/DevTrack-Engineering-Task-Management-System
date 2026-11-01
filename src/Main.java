
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

	        TaskManager manager= new TaskManager();
	        Task task1 = new Task("DEV-101", "Login", "Build login", TaskPriority.HIGH);
	        Task task2 = new Task("DEV-102", "Registration", "Build registration", TaskPriority.LOW);
	        
	        System.out.println("Task 2 added "+manager.addTask(task2));
	        System.out.println("Task 1 added "+manager.addTask(task1));
	        System.out.println("find task 1 "+ manager.findTaskById("DEV-101"));
	        System.out.println("REMOVE task 1 "+manager.removeTask("DEV-102"));
	        System.out.println("find task 1 "+ manager.findTaskById("DEV-102"));
	}

}
