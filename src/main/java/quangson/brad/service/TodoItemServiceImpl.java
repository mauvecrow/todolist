package quangson.brad.service;

import org.springframework.stereotype.Service;
import quangson.brad.model.TodoData;
import quangson.brad.model.TodoItem;

@Service
public class TodoItemServiceImpl implements TodoItemService{

    // == fields ==
    private final TodoData data = new TodoData();

    // == public methods ==
    @Override
    public void addItem(TodoItem todoItem) {
        data.addItem(todoItem);
    }

    @Override
    public void removeItem(int id) {
        data.removeItem(id);
    }

    @Override
    public TodoItem getItem(int id) {
        return data.getItem(id);
    }

    @Override
    public void updateItem(TodoItem todoItem) {
        data.updateItem(todoItem);
    }

    @Override
    public TodoData getData() {
        return data;
    }
}
