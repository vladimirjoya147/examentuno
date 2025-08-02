package com.examenT1.demo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MatriculaModel {
    private String nombre;
    private String email;
    private String nombre_curso;
    private int creditos;
}
