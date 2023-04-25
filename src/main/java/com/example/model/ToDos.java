package com.example.model;

import java.util.ArrayList;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class ToDos extends ArrayList<ToDoDTO> {

}
