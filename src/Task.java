
public class Task {
	private final String Id;
	private String Description;
	private String title;
	private TaskStatus status;
	private TaskPriority priority;
	
	public Task(String Id, String description, String title, TaskPriority priority) {
		this.Id =Id;
		this.Description = description;
		this.title = title;
		this.status=TaskStatus.TODO;
		this.priority = priority;
	}

	/**
	 * @return the iD
	 */
	public String getId() {
		return Id;
	}


	/**
	 * @return the description
	 */
	public String getDescription() {
		return Description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.Description = description;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the status
	 */
	public TaskStatus getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(TaskStatus status) {
		this.status = status;
	}

	/**
	 * @return the priority
	 */
	public TaskPriority getPriority() {
		return priority;
	}

	/**
	 * @param priority the priority to set
	 */
	public void setPriority(TaskPriority priority) {
		this.priority = priority;
	}
	
	//method to update status
	public void updateStatus(TaskStatus newStatus)
	{
		this.status=newStatus;
	}
	
}
