// ToDoDAO.java
package dao;
import java.util.List;
import bean.Register;
import bean.Task;

public interface ToDoDAO {
  public int register(Register register);
  public int login(String email, String pass);
  public List<Task> findAllTasksByRegId(int regId);
  public int addTask(Task task, int regId);
  public boolean markTaskCompleted(int taskId, int regId);
  public String getFLNameByRegID(int regId);
}