package com.DAWI_T1_JOYA_VLADIMIR.demo;

import com.DAWI_T1_JOYA_VLADIMIR.demo.Entity.Curso;
import com.DAWI_T1_JOYA_VLADIMIR.demo.Entity.Matricula;
import com.DAWI_T1_JOYA_VLADIMIR.demo.Repositorio.CursoRepositorio;
import com.DAWI_T1_JOYA_VLADIMIR.demo.Service.CursoService;
import com.DAWI_T1_JOYA_VLADIMIR.demo.Service.MatriculaService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class PruebaCursoRunner implements CommandLineRunner {
    private final CursoService cursoService;
    private final CursoRepositorio cursoRepositorio; // Para insertar cursos de prueba
    private final MatriculaService matriculaService;

    @Override
    public void run(String... args) throws Exception {

            //(si la BD está vacía)
            /*cursoRepositorio.save(new Curso(null, "Matemática I", 4));
            cursoRepositorio.save(new Curso(null, "Matemática Avanzada", 5));
            cursoRepositorio.save(new Curso(null, "Historia Universal", 2));
            cursoRepositorio.save(new Curso(null, "Lenguaje y Comunicación", 3));*/


            List<Curso> resultado = cursoService.listarCursos("mate");
            List<Matricula> matriculas = matriculaService.listarMatriculas("juan.perez@mail.com");


            System.out.println("Cursos que contienen 'mate':");
            resultado.forEach(c -> System.out.println(c.getNombre() + " (" + c.getCreditos() + " créditos)"));

            System.out.println("Matriculas que listan por email");
            matriculas.forEach(m-> System.out.println(m.getCurso().getNombre()+" "+
                    m.getAlumno().getNombre()+" "+ m.getAlumno().getEmail()));
    }
}
