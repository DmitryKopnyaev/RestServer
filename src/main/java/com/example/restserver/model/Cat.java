package com.example.restserver.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cat {
    @NonNull
    private String name;

    @NonNull
    private String color;

    @NonNull
    private int age;

    @NonNull
    private String comment;
}
