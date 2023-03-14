package com.example.restserver.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "notes")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NonNull
    @Column(nullable = false)
    private String value;
}
