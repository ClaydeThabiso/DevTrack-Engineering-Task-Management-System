package com.devTrack_M.devtrack_M.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;
    
    public Task() {}

	/**
	 * @param title
	 * @param description
	 */
	public Task(String title, String description) {
		this.title = title;
		this.description = description;
	}

	public Long getId() {
		return id;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
    
	public void updateTask(String title, String description)
	{
		this.title=title;
		this.description=description;
	}
    

}