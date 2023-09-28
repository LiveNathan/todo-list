package dev.nathanlively.todolist.adapter.in.web.getUsers;

import com.fasterxml.jackson.annotation.JsonProperty;

public record GetUserError(

	@JsonProperty("message")
	String message
) {
}