package com.devTrack_M.devtrack_M.repository;

import org.springframework.data.jpa.repository.JpaRepository;	
import com.devTrack_M.devtrack_M.entity.Task;
public interface TaskRepository extends JpaRepository<Task, Long>{

}
