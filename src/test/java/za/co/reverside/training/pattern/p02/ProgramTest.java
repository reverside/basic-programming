package za.co.reverside.training.pattern.p02;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProgramTest {

    @Test
    public void test1(){
        Program p = new Program();
        String result = p.generate(5);
        assertEquals(
                "*****\n" +
                "*   *\n" +
                "*   *\n" +
                "*   *\n" +
                "*****\n", result);
    }

}