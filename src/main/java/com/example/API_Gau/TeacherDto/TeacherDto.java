package com.example.API_Gau.TeacherDto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class TeacherDto {

    @Id
    private Long id;
    private String name;
}
