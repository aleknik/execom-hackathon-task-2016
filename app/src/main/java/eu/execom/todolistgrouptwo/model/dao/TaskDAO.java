package eu.execom.todolistgrouptwo.model.dao;

import org.androidannotations.annotations.EBean;
import org.androidannotations.rest.spring.annotations.RestService;

import eu.execom.todolistgrouptwo.api.RestApi;
import eu.execom.todolistgrouptwo.model.Task;

@EBean
public class TaskDAO {

    @RestService
    RestApi restApi;

    public Task create(Task task) {
//        taskDAO.create(task);
        return restApi.createTask(task);
    }

    public Task update(Task task) {
        return restApi.updateTask(task, task.getId());
    }

    public Task remove(Long id) {
        return restApi.removeTask(id);
    }

}
