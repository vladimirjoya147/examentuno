package com.DAWI_T1_JOYA_VLADIMIR.demo.Repositorio;

import com.DAWI_T1_JOYA_VLADIMIR.demo.Entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CursoRepositorio extends JpaRepository<Curso, Long> {

    public List<Curso> findByNombreContaining(String Nombre);
}
