package com.example.restserver.service;

import com.example.restserver.model.Note;

import java.util.List;

interface NoteService {
    List<Note> getAll();
    void save(Note note);
}
