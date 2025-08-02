package com.examenT1.demo.Repositorio;

import com.examenT1.demo.Entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CursoRepositorio extends JpaRepository<Curso, Long> {

    public List<Curso> findByNombreContaining(String Nombre);
}
