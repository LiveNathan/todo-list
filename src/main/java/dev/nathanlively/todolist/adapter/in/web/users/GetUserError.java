package dev.nathanlively.todolist.adapter.in.web.users;

import com.fasterxml.jackson.annotation.JsonProperty;

public record GetUserError(

	@JsonProperty("message")
	String message
) {
}