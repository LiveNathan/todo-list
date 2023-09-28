package dev.nathanlively.todolist.adapter.in.web.getUsers;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public record GetUsersResponse(

	@JsonProperty("data")
	List<GetUserDataItem> data,

	@JsonProperty("error")
	GetUserError getUserError,

	@JsonProperty("status")
	String status
) {
}