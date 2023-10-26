package ru.ponomarev.MyRestSpringBootAppH2DB.controller.discipline;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.ponomarev.MyRestSpringBootAppH2DB.entity.Discipline;
import ru.ponomarev.MyRestSpringBootAppH2DB.service.DisciplineService;

import java.util.List;
@RestController
@RequestMapping("/api")
public class MyConttoller {

        @Autowired
        private DisciplineService disciplineService;

        @GetMapping("/discipline")
        public List<Discipline> showAllDiscipline() {
            List<Discipline> allDiscipline = disciplineService.getAllDisciplines();
            return allDiscipline;
        }

        @GetMapping("/discipline/{id}")
        public Discipline getDiscipline(@PathVariable("id") int id) {
                return disciplineService.getDiscipline(id); }

        @PostMapping("/discipline")
        public String saveDiscipline(@RequestBody Discipline discipline) {
                return "add disciplines success";}

        @PutMapping("/discipline")
        public String updateDiscipline(@RequestBody Discipline discipline){disciplineService.saveDiscipline(discipline);
                return "update disciplines success";
        }
        @DeleteMapping("/discipline/{id}")
        public void updateDiscipline(@PathVariable("id") int id) {
            disciplineService.deleteDiscipline(id);}
}
