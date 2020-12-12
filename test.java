import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class test {
     Utils object;

     @BeforeClass
   	public void setUp(){
		object=new Utils();
	}

    @Test
    public void testOrdineaOperatiilor() {
        assertEquals(19,object.ordineaOperatiilor(2,3,5));
    }

    @Test
    public void testDiferenta() {
        int rezultat = object.diferenta(3, 2);
        int rezultatAsteptat = 1;
        assertEquals(rezultatAsteptat, rezultat);
    }

    @Test
    public void testGetCharacters() {
         assertEquals("Sec", object.getFirst3Characters("Security"));
    }

    @Test
    public void testInmultire() {
        assertEquals(12, object.inmultire(6,2), 0.1);
    }

    @Test
    public void testTrueOrFalse() {
        assertEquals(true, object.TrueOrFalse(5));
    }
}
