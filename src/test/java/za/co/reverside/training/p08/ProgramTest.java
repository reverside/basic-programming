package za.co.reverside.training.p08;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProgramTest {

    @Test
    public void test1(){
        za.co.reverside.training.p07.Program program = new za.co.reverside.training.p07.Program();
        int result = program.findPositionOfSmallest(new int[] {3, 7, 3, 9, 5, 8, 6, 1});
        assertEquals(8, result);
    }


    @Test
    public void test2(){
        za.co.reverside.training.p07.Program program = new za.co.reverside.training.p07.Program();
        int result = program.findPositionOfSmallest(new int[] {1, 7, 3, 9, 5, 8, 6, 3});
        assertEquals(8, result);
    }


    @Test
    public void test3(){
        za.co.reverside.training.p07.Program program = new za.co.reverside.training.p07.Program();
        int result = program.findPositionOfSmallest(new int[] {9, 7, 3, 1, 5, 8, 6, 3});
        assertEquals(8, result);
    }

    @Test
    public void test4(){
        za.co.reverside.training.p07.Program program = new za.co.reverside.training.p07.Program();
        int result = program.findPositionOfSmallest(new int[] {9, 7, 3, 1, 1, 8, 6, 3});
        assertEquals(8, result);
    }

    @Test
    public void test5(){
        za.co.reverside.training.p07.Program program = new za.co.reverside.training.p07.Program();
        int result = program.findPositionOfSmallest(new int[] {9, 9, 9, 9, 9, 9, 9, 9, 9});
        assertEquals(8, result);
    }

}