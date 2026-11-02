package com.devTrack_M.devtrack_M.service;

import java.util.List;

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
}
