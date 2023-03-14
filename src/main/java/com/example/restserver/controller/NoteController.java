package com.example.restserver.controller;

import com.example.restserver.model.Note;
import com.example.restserver.service.NoteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/note")
//@CrossOrigin(origins = {"http://localhost:3000", "http://localhost:4200"})
@RestController
public class NoteController {

    private NoteServiceImpl noteService;

    @Autowired
    public void setNoteService(NoteServiceImpl noteService) {
        this.noteService = noteService;
    }

    @GetMapping(value = "/all", produces = "application/json")
    public List<Note> getAll() {
        return this.noteService.getAll();
    }

    @PostMapping(value = "/add", produces = "application/json", consumes = "application/json")
    public ResponseEntity save(@RequestBody Note note) {
        try {
            this.noteService.save(note);
            System.out.println("-> " + note);
            return new ResponseEntity<>(note, HttpStatus.OK);
        } catch (IllegalArgumentException e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
