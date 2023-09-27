package dev.nathanlively.todolist.adapter.out.persistence;

import dev.nathanlively.todolist.adapter.in.web.users.GetUserDataItem;
import dev.nathanlively.todolist.adapter.in.web.users.GetUserError;
import lombok.Data;

import java.util.List;

@Data
public class UserApiEntity {

    private List<GetUserDataItem> data;
    private GetUserError getUserError;
}
