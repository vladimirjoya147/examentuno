package com.examenT1.demo.Repositorio;

import com.examenT1.demo.Entity.Matricula;
import com.examenT1.demo.Model.MatriculaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MatriculaRepositorio extends JpaRepository<Matricula, Long> {

    @Query(
            """
               SELECT new com.examenT1.demo.Model.MatriculaModel(a.nombre, a.email, c.nombre, c.creditos)
                             FROM Matricula m
                             JOIN m.alumno a
                             JOIN m.curso c
                             WHERE a.email = :email                           
            """
    )
    public List<MatriculaModel> listarMatriculasPorEmail (@Param("email") String email);
}
