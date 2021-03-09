package quangson.brad.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import quangson.brad.model.TodoData;
import quangson.brad.util.Mappings;
import quangson.brad.util.ViewNames;

@Controller
public class TodoItemController {

    // == model attributes ==
    @ModelAttribute
    public TodoData todoData(){
        return new TodoData();
    }

    // == handler methods ==
    @GetMapping(Mappings.ITEMS)
    public String items(){
        return ViewNames.ITEMS_LIST;
    }
}
