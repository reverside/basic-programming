package za.co.reverside.training.p50;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProgramTest {

    @Test
    public void testSquareStarPattern(){
        Program program = new Program();
        String result = program.generateSquareStarPattern(5);
        assertEquals(
                "*****\n" +
                "*****\n" +
                "*****\n" +
                "*****\n" +
                "*****\n", result);
    }

}