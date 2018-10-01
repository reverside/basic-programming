package za.co.reverside.training.p47;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProgramTest {

    @Test
    public void test(){
        Program program = new Program();
        String result = program.generate(5);
        assertEquals(
                "*********\n" +
                " *     *\n" +
                "  *   *\n" +
                "   * *\n" +
                "    *\n", result);
    }

}