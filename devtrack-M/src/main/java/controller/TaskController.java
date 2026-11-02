package controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.Task;
import service.TaskService;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

	private final TaskService taskService;

	/**
	 * @param taskService
	 */
	public TaskController(TaskService taskService) {
		this.taskService = taskService;
	}
	
	//create a task
	@PostMapping
	public Task createTask(@RequestBody Task task)
	{
		return taskService.createTask(task);
	}
	
	//get all tasks
	@GetMapping
	public List<Task> getAllTasks()
	{
		return taskService.getAllTasks();
	}
}
