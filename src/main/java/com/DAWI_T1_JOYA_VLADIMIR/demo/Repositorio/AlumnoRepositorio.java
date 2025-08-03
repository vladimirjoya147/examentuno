package com.DAWI_T1_JOYA_VLADIMIR.demo.Repositorio;

import com.DAWI_T1_JOYA_VLADIMIR.demo.Entity.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoRepositorio extends JpaRepository<Alumno, Long> {
}
