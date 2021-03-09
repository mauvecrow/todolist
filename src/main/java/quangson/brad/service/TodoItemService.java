package quangson.brad.service;

import quangson.brad.model.TodoData;
import quangson.brad.model.TodoItem;

public interface TodoItemService {

    void addItem(TodoItem todoItem);
    void removeItem(int id);
    TodoItem getItem(int id);
    void updateItem(TodoItem todoItem);
    TodoData getData();
}
