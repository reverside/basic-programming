package za.co.reverside.training.p06;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProgramTest {

    @Test
    public void test1(){
        za.co.reverside.training.p05.Program program = new za.co.reverside.training.p05.Program();
        int result  = program.findLargest(new int[]{1, 4, 9, 3, 7, 5, 8 });
        assertEquals(8, result);
    }

    @Test
    public void test2(){
        za.co.reverside.training.p05.Program program = new za.co.reverside.training.p05.Program();
        int result  = program.findLargest(new int[]{1, 4, 2, 3, 7, 5, 9 });
        assertEquals(7, result);
    }

    @Test
    public void test3(){
        za.co.reverside.training.p05.Program program = new za.co.reverside.training.p05.Program();
        int result  = program.findLargest(new int[]{9, 4, 2, 3, 7, 5, 1 });
        assertEquals(7, result);
    }

    @Test
    public void test4(){
        za.co.reverside.training.p05.Program program = new za.co.reverside.training.p05.Program();
        int result  = program.findLargest(new int[]{9, 4, 2, 3, 7, 5, 9 });
        assertEquals(7, result);
    }


}