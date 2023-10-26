package ru.ponomarev.MyRestSpringBootAppH2DB.service;

import org.springframework.stereotype.Service;
import ru.ponomarev.MyRestSpringBootAppH2DB.entity.Discipline;

import java.util.List;
@Service
public interface DisciplineService {
    List<Discipline> getAllDisciplines();

    void saveDiscipline(Discipline discipline);

    Discipline getDiscipline(int id);

    void deleteDiscipline(int id);
}