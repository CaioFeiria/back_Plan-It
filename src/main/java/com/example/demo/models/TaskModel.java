package com.example.demo.models;

import com.example.demo.enums.TaskPriority;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter @Setter
@Table(name = "TB_TASKS")
public class TaskModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String description;
    private Date creationDate;
    private Date deadlineDate;

    @Enumerated(EnumType.STRING) // Salva os valores como texto no banco
    private TaskPriority priority;
}
