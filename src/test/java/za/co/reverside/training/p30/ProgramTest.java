package za.co.reverside.training.p30;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProgramTest {

    @Test
    public void test(){
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