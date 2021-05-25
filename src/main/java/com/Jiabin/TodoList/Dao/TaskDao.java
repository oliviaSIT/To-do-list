package com.Jiabin.TodoList.Dao;

import com.Jiabin.TodoList.Bean.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;
import java.util.List;

public interface TaskDao extends JpaRepository<Task, Integer> {
    Task save(Task task);

    Task getById(Id id);

    List<Task> getByTitle(String title);

    List<Task> getByUserId(Id id);

    Void delete(Id id);

}
