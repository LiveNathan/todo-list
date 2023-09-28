package dev.nathanlively.todolist.adapter.out.persistence;

import dev.nathanlively.todolist.adapter.in.web.getUsers.GetUsersResponse;

interface UserRepository {
    GetUsersResponse getAllUsers();
}
