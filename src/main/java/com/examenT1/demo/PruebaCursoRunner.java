package com.examenT1.demo;

import com.examenT1.demo.Entity.Curso;
import com.examenT1.demo.Model.MatriculaModel;
import com.examenT1.demo.Repositorio.CursoRepositorio;
import com.examenT1.demo.Service.CursoService;
import com.examenT1.demo.Service.MatriculaService;
import lombok.RequiredArgsConstructor;
import org.springframework.aot.hint.annotation.RegisterReflection;
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

            // Crear datos hardcodeados (si la BD está vacía)
            /*cursoRepositorio.save(new Curso(null, "Matemática I", 4));
            cursoRepositorio.save(new Curso(null, "Matemática Avanzada", 5));
            cursoRepositorio.save(new Curso(null, "Historia Universal", 2));
            cursoRepositorio.save(new Curso(null, "Lenguaje y Comunicación", 3));*/

            // Probar método
            List<Curso> resultado = cursoService.listarCursos("mate");
            List<MatriculaModel> matriculas = matriculaService.listarMatriculas("juan.perez@mail.com");

            // Mostrar resultados por consola
            System.out.println("Cursos que contienen 'mate':");
            resultado.forEach(c -> System.out.println(c.getNombre() + " (" + c.getCreditos() + " créditos)"));

            System.out.println("Matriculas que listan por email");
            matriculas.forEach(m-> System.out.println(m.getNombre_curso()+" "+ m.getEmail()+" "+ m.getNombre()+ " "+m.getCreditos()));
    }
}
