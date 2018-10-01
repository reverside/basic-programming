package za.co.reverside.training.p07;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProgramTest {

    @Test
    public void test1(){
        Program program = new Program();
        int result = program.findPositionOfSmallest(new int[] {3, 7, 3, 9, 5, 8, 6, 1});
        assertEquals(8, result);
    }


    @Test
    public void test2(){
        Program program = new Program();
        int result = program.findPositionOfSmallest(new int[] {1, 7, 3, 9, 5, 8, 6, 3});
        assertEquals(1, result);
    }


    @Test
    public void test3(){
        Program program = new Program();
        int result = program.findPositionOfSmallest(new int[] {9, 7, 3, 1, 5, 8, 6, 3});
        assertEquals(4, result);
    }

    @Test
    public void test4(){
        Program program = new Program();
        int result = program.findPositionOfSmallest(new int[] {9, 7, 3, 1, 1, 8, 6, 3});
        assertEquals(4, result);
    }


}