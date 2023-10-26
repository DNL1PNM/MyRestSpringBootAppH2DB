package ru.ponomarev.MyRestSpringBootAppH2DB.dao;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.ponomarev.MyRestSpringBootAppH2DB.entity.Discipline;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Slf4j
@Repository
public class DisciplineDAOImpl implements DisciplineDAO {
    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Discipline> getAllDisciplines() {
        Query query = entityManager.createQuery("from Discipline");
        List allDiscipline= query.getResultList();
        log.info("getAllDiscipline" + allDiscipline);
        return allDiscipline;
    }

    @Override
    public void saveDiscipline(Discipline discipline) {
        entityManager.merge(discipline);
    }

    @Override
    public Discipline getDiscipline(int id) {
        return entityManager.find(Discipline.class, id);}

    @Override
    public void deleteDiscipline(int id) {
        Query query = entityManager.createQuery("delete from Discipline"
                + " where id =:disciplineId");
        query.setParameter("disciplineId" ,id);
        query.executeUpdate();

    }
}