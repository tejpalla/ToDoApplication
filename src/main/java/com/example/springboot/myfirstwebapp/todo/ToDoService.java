package com.example.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ToDoService {

    private static List<ToDo> todos = new ArrayList<ToDo>();

    static{

        new ToDo (1, "tej", "learn AWS", LocalDate.now().plusYears(1), false );
        new ToDo (2, "tej", "learn Spring", LocalDate.now().plusYears(2), false );
        new ToDo (3, "tej", "learn Devops", LocalDate.now().plusYears(1), false );

    }

    public List<ToDo> findByUsername(String username){
		return todos;
	}
    
}
