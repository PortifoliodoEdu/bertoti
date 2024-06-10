import static org.junit.Assert.*;

import org.example.Curso;
import org.junit.Test;

public class CursoTest {

    @Test
    public void testMatricular() {
        Curso curso = new Curso("Introdução à Programação", "Informática", 10);
        assertEquals(10, curso.getVagasDisponiveis());
        assertTrue(curso.matricular());
        assertEquals(9, curso.getVagasDisponiveis());
    }

    @Test
    public void testCancelarMatricula() {
        Curso curso = new Curso("Introdução à Programação", "Informática", 10);
        curso.matricular();
        assertEquals(9, curso.getVagasDisponiveis());
        curso.cancelarMatricula();
        assertEquals(10, curso.getVagasDisponiveis());
    }
}
