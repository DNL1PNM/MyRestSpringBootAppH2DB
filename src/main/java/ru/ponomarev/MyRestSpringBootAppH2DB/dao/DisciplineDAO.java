package ru.ponomarev.MyRestSpringBootAppH2DB.dao;

import ru.ponomarev.MyRestSpringBootAppH2DB.entity.Discipline;

import java.util.List;

public interface DisciplineDAO {
    List<Discipline> getAllDisciplines();

    void saveDiscipline(Discipline discipline);

    Discipline getDiscipline(int id);

    void deleteDiscipline(int id);
}