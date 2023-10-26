package ru.ponomarev.MyRestSpringBootAppH2DB.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Table(name = "DISCIPLINES")
public class Discipline {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "teacher")
    private String teacher;
    @Column(name = "faculty")
    private String faculty;

    public Discipline() {
    }

    public Discipline(String name, String teacher) {
        this.name = name;
        this.teacher = teacher;
        this.faculty = faculty;
    }
}