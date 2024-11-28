package com.zawa.todosimple.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.zawa.todosimple.models.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    //@Query(value = "SELECT t FROM Task t WHERE t.user.id = :id" )
    List<Task> findByUser_Id(Long id);

    
}