package acn.project.TaskList;

import org.springframework.data.repository.CrudRepository;

//CRUD refers Create, Read, Update, Delete
public interface TaskRepository extends CrudRepository<Task, Long> 
{
}