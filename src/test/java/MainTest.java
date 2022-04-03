import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void testSumOK(){
        Main main = new Main();
        main.sum(2,5);
        assertEquals(7,main.sum(2,5));
    }
    @Test
    public void testSumFail(){
        Main main = new Main();
        main.sum(2,5);
        assertEquals(8,main.sum(2,5));
    }
    @Test
    public void testMultipleOK(){
        Main main = new Main();
        main.multiple(2,5);
        assertEquals(10, main.multiple(2,5));
    }
    @Test
    public void testMultipleFail(){
        Main main = new Main();
        main.multiple(2,5);
        assertEquals(8, main.multiple(2,5));
    }
    @Test
    public void testAverageOK(){
        Main main = new Main();
        main.multiple(2,5);
        assertEquals(3, main.average(2,4));
    }
    @Test
    public void testAverageFail(){
        Main main = new Main();
        main.multiple(2,5);
        assertEquals(5, main.average(2,4));
    }

}
