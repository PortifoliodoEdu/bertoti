import static org.junit.Assert.*;

import org.example.CadastrarAluno;
import org.junit.Test;

public class CadastrarAlunoTest {

    @Test
    public void testGetNome() {
        CadastrarAluno aluno = new CadastrarAluno("Maria", 25);
        assertEquals("Maria", aluno.getNome());
    }

    @Test
    public void testGetIdade() {
        CadastrarAluno aluno = new CadastrarAluno("Maria", 25);
        assertEquals(25, aluno.getIdade());
    }
}
