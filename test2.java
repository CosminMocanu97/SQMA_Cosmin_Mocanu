import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class test2 {
    Utils object;

     @BeforeClass
   	public void setUp(){
		object=new Utils();
	}
    
    @Test
    public void testFindMax(){
        assertEquals(4,object.findMax(new int[]{1,3,4,2}));
        assertEquals(-1,object.findMax(new int[]{-12,-1,-3,-4,-2}));
    }

    @Test
    public void testFindMin(){
        assertEquals(1,object.findMin(new int[]{1,3,4,2}));
        assertEquals(-12,object.findMin(new int[]{-12,-1,-3,-4,-2}));
    }

    @Test
    public void testCube(){
        assertEquals(27,object.cube(3));
    }

    @Test
    public void testSquare(){
        assertEquals(9,object.square(3));
    }

    @Test
    public void testReverseWord() {
        assertEquals("gnitset",object.reverse("testing"));
    }
}
