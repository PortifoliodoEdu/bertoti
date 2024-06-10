import static org.junit.Assert.*;

import org.example.Instrutor;
import org.junit.Test;

public class InstrutorTest {

    @Test
    public void testGetNome() {
        Instrutor instrutor = new Instrutor("João", "Matemática");
        assertEquals("João", instrutor.getNome());
    }

    @Test
    public void testGetEspecialidade() {
        Instrutor instrutor = new Instrutor("João", "Matemática");
        assertEquals("Matemática", instrutor.getEspecialidade());
    }
}
