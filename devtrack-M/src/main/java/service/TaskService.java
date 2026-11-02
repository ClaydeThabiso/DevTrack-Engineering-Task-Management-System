package service;

import java.util.List;

import org.springframework.stereotype.Service;

import entity.Task;
import repository.TaskRepository;

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
}
