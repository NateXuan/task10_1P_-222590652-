package sit707_week10;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TaskInboxTest {

    @Test
    public void testGetTasks() {
        TaskInbox inbox = new TaskInbox();
        Assert.assertTrue("Task inbox should be empty initially",inbox.getTasks().isEmpty());
    }

    @Test
    public void testAddTask() {
        TaskInbox inbox = new TaskInbox();
        inbox.addTask("Task 1");
        List<String> tasks = inbox.getTasks();
        Assert.assertEquals("Task inbox should contain one task", 1, tasks.size());
        Assert.assertEquals("The task should be 'Task 1'", "Task 1", tasks.get(0));
    }
}
