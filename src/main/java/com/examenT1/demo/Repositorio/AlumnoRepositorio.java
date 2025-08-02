package com.examenT1.demo.Repositorio;

import com.examenT1.demo.Entity.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoRepositorio extends JpaRepository<Alumno, Long> {
}
