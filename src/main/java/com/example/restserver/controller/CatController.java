package com.example.restserver.controller;

import com.example.restserver.model.Cat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/cat")
//@CrossOrigin(origins = {"http://localhost:3000", "http://localhost:4200"})
@RestController
public class CatController {

    @GetMapping(value = "/all", produces = "application/json")
    public List<Cat> getAll(){
        return List.of(
                new Cat("Барсик", "Серый", 5, "Я очень мягкий котэ, люблю играть с фантиками, флешками и зарядниками"),
                new Cat("Мурзик", "Черный", 2, "Считаю что эти двуногие кожаные мешки созданы для того чтобы прислуживать мне"),
                new Cat("Саша", "Белый", 3, "Люблю сталкивать airpods'ы со стола и смотреть как они разлетаются на кусочки")
        );
    }
}
