package za.co.reverside.training.pattern.p04;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProgramTest {

    @Test
    public void test1(){
        Program program = new Program();
        String result = program.generate(5);
        assertEquals(
                "    *****\n" +
                "   *****\n" +
                "  *****\n" +
                " *****\n" +
                "*****\n", result);

    }

}