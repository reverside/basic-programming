package za.co.reverside.training.p36;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProgramTest {

    @Test
    public void test(){
        String result = new Program().generate(5);
        assertEquals(
                "*\n" +
                "**\n" +
                "***\n" +
                "****\n" +
                "*****\n", result);
    }

}