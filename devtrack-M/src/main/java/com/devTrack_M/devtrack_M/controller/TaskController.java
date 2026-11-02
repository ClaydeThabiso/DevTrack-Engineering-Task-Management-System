package com.devTrack_M.devtrack_M.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import com.devTrack_M.devtrack_M.entity.Task;
import com.devTrack_M.devtrack_M.service.TaskService;

@RestController
@RequestMapping("/api/tasks")
@PathVariable Long id
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
	
	@GetMapping("/{id}")
	public Task getTaskById(@PathVariable Long id) {
	    return taskService.findTaskById(id);
	}
	
	@GetMapping("/{id}")
	public boolean removeTaskById(@PathVariable Long id)
	{
		return taskService.removeTaskById(id);
	}
	
	@PutMapping("/{id}")
	public Task 
	
}
