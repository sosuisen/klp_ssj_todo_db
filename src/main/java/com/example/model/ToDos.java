package com.example.model;

import java.util.ArrayList;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@RequestScoped
@Named
public class ToDos extends ArrayList<ToDoDTO> {

}
