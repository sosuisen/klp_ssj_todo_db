package com.example.model;

import jakarta.ws.rs.FormParam;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ToDoDTO {
	@FormParam("id")
	private int id;
	@FormParam("title")
	private String title;
	@FormParam("priority")
	private int priority;
}

