package todo;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class TodoTest {
    @Test public void shouldInitializedEmptyList() {
        Todo todo = new Todo();
        assertTrue("Initial task list is empty", todo.tasks.isEmpty());
    }

    @Test public void shouldAddNewTask() {
        Todo todo = new Todo();
        ArrayList<String> expectedList = new ArrayList<String>();
        expectedList.add("Buy eggs");

        assertEquals("should reflect new task has been added", expectedList, todo.addTask("Buy eggs"));
    }

    @Test public void shouldGetListOfTasks() {
        Todo todo = new Todo();
        ArrayList<String> expectedList = new ArrayList<String>();
        expectedList.add("Do washing");
        expectedList.add("Do hoovering");

        todo.addTask("Do washing");
        todo.addTask("Do hoovering");

        assertEquals("should reflect all tasks added to array", expectedList, todo.getTasks());
    }
}