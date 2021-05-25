package com.Jiabin.TodoList.Service;

import com.Jiabin.TodoList.Bean.Task;
import com.Jiabin.TodoList.Dao.TaskDao;
import com.Jiabin.TodoList.Http.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Id;

@Service
@Transactional
public class TaskService {
    @Autowired
    TaskDao taskDao;

    public Response createTask(Task task) {
        taskDao.save(task);

        return new Response(true);
    }

    public Response updateTask(Task task) {
        taskDao.save(task);

        return new Response(true);
    }

    public Response deleteTask(Id id) {
        taskDao.delete(id);

        return new Response(true);
    }
}
