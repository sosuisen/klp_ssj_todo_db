package com.example.model;

import jakarta.ws.rs.FormParam;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @Getter
@NoArgsConstructor
@AllArgsConstructor
public class ToDoDTO {
	@FormParam("id")
	private int id;
	@FormParam("title")
	private String title;
	@FormParam("priority")
	private int priority;
}

