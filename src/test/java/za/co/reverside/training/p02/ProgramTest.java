package za.co.reverside.training.p02;

import org.junit.Assert;
import org.junit.Test;

public class ProgramTest {

    @Test
    public void test1(){
        Program program = new Program();
        int result  = program.findLargestNumber(5, 7);
        Assert.assertEquals(7, result);
    }

    @Test
    public void test2(){
        Program program = new Program();
        int result  = program.findLargestNumber(7, 5);
        Assert.assertEquals(7, result);
    }

    @Test
    public void test3(){
        Program program = new Program();
        int result  = program.findLargestNumber(7, 7);
        Assert.assertEquals(7, result);
    }

}