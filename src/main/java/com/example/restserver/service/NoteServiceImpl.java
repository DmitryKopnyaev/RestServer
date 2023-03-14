package com.example.restserver.service;

import com.example.restserver.model.Note;
import com.example.restserver.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteServiceImpl implements NoteService{
    private NoteRepository noteRepository;

    @Autowired
    public void setNoteRepository(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @Override
    public List<Note> getAll() {
        return this.noteRepository.findAll();
    }

    @Override
    public void save(Note note) {
        try {
            this.noteRepository.save(note);
        } catch (Exception e) {
            throw new IllegalArgumentException("This node already exist");
        }
    }
}
