package za.co.reverside.training.p05;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProgramTest {

    @Test
    public void test1(){
        Program program = new Program();
        int result  = program.findLargest(new int[]{1, 4, 9, 3, 7, 5, 8 });
        assertEquals(9, result);
    }

    @Test
    public void test2(){
        Program program = new Program();
        int result  = program.findLargest(new int[]{1, 4, 2, 3, 7, 5, 9 });
        assertEquals(9, result);
    }

    @Test
    public void test3(){
        Program program = new Program();
        int result  = program.findLargest(new int[]{9, 4, 2, 3, 7, 5, 1 });
        assertEquals(9, result);
    }

    @Test
    public void test4(){
        Program program = new Program();
        int result  = program.findLargest(new int[]{9, 4, 2, 3, 7, 5, 9 });
        assertEquals(9, result);
    }

}