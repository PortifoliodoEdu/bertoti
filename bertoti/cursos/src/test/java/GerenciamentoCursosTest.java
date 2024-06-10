import static org.junit.Assert.*;

import java.util.ArrayList;

import org.example.Curso;
import org.example.GerenciamentoCursos;
import org.junit.Before;
import org.junit.Test;

public class GerenciamentoCursosTest {

    private GerenciamentoCursos gerenciamentoCursos;

    @Before
    public void setUp() {
        gerenciamentoCursos = new GerenciamentoCursos();
    }

    @Test
    public void testAdicionarCurso() {
        Curso curso = new Curso("Introdução à Programação", "Informática", 10);
        gerenciamentoCursos.adicionarCurso(curso);
        ArrayList<Curso> cursos = gerenciamentoCursos.getCursos();
        assertEquals(1, cursos.size());
        assertEquals("Introdução à Programação", cursos.get(0).getTitulo());
        assertEquals("Informática", cursos.get(0).getCategoria());
    }

    @Test
    public void testMatricularAluno() {
        Curso curso = new Curso("Introdução à Programação", "Informática", 10);
        gerenciamentoCursos.adicionarCurso(curso);
        gerenciamentoCursos.matricularAluno("Introdução à Programação");
        assertEquals(9, curso.getVagasDisponiveis());
    }

    @Test
    public void testCancelarMatricula() {
        Curso curso = new Curso("Introdução à Programação", "Informática", 10);
        gerenciamentoCursos.adicionarCurso(curso);
        gerenciamentoCursos.matricularAluno("Introdução à Programação");
        gerenciamentoCursos.cancelarMatricula("Introdução à Programação");
        assertEquals(10, curso.getVagasDisponiveis());
    }
}
