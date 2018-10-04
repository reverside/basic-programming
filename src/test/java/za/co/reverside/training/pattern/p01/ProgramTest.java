package za.co.reverside.training.pattern.p01;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProgramTest {

    @Test
    public void test1(){
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