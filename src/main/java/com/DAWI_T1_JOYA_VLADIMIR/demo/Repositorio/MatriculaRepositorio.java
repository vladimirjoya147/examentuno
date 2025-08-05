package com.DAWI_T1_JOYA_VLADIMIR.demo.Repositorio;

import com.DAWI_T1_JOYA_VLADIMIR.demo.Entity.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MatriculaRepositorio extends JpaRepository<Matricula, Long> {

    @Query("SELECT m FROM Matricula m WHERE m.alumno.email = :email")
    List<Matricula> findByAlumnoEmail(@Param("email") String email);
}
