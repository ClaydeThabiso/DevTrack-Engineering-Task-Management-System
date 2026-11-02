package com.devTrack_M.devtrack_M.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.devTrack_M.devtrack_M.entity.Task;
import com.devTrack_M.devtrack_M.repository.TaskRepository;

@Service
public class TaskService {

	private final TaskRepository taskRepository;

	/**
	 * @param taskRepository
	 */
	public TaskService(TaskRepository taskRepository) {
		this.taskRepository = taskRepository;
	}
	
	public Task createTask(Task task)
	{
		return taskRepository.save(task);
	}
	
	public List<Task> getAllTasks()
	{
		return taskRepository.findAll();
	}
	
	public Task findTaskById(Long id)
	{
		Optional<Task> task= taskRepository.findById(id);
		if(task.isPresent())
		{
			return task.get();
		}
		else
		{
			throw new RuntimeException("Task not found with ID: " + id);
		}
	}
	
	public Task updateTaskById(Long id,String title, String description)
	{
		Optional<Task> task= taskRepository.findById(id);
		if(task.isPresent())
		{
			Task exisitingTask= task.get();
			exisitingTask.updateTask(title, description);
			return taskRepository.save(exisitingTask);
		}
		else
		{
			throw new RuntimeException("Task not found with ID: " + id);
		}
	}
	
	public boolean removeTaskById(Long id)
	{
		Optional<Task> task= taskRepository.findById(id);
		if(task.isPresent())
		{
			taskRepository.deleteById(id);
			return true;
		}
		else
		{
			throw new RuntimeException("Task not found with ID: " + id);
		}
	}
}
