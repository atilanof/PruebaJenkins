import static org.junit.Assert.*;

public class CuadradoTest {
    private Cuadrado cuadrado;
    @org.junit.Before
    public void setUp() throws Exception {
        cuadrado=new Cuadrado(2);
    }

    @org.junit.Test
    public void getLado() {
        assertEquals(2, cuadrado.getLado(),0);
    }

    @org.junit.Test
    public void setLado() {
        cuadrado.setLado(3);
        assertEquals(3, cuadrado.getLado(),0);
    }

    @org.junit.Test
    public void perimetro() {
        assertEquals(8, cuadrado.perimetro(),0);
    }
}