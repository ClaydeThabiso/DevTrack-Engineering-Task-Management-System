package service;

import org.springframework.stereotype.Service;

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
}
