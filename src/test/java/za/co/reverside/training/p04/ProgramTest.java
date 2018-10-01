package za.co.reverside.training.p04;

import org.junit.Assert;
import org.junit.Test;

public class ProgramTest {

    @Test
    public void test1(){
        Program program = new Program();
        int result = program.findLargest(1, 2, 3, 4);
        Assert.assertEquals(4, result);
    }

    @Test
    public void test2(){
        Program program = new Program();
        int result = program.findLargest(1, 4, 3, 2);
        Assert.assertEquals(4, result);
    }

    @Test
    public void test3(){
        Program program = new Program();
        int result = program.findLargest(4, 3, 2, 4);
        Assert.assertEquals(4, result);
    }

    @Test
    public void test4(){
        Program program = new Program();
        int result = program.findLargest(4, 4, 4, 4);
        Assert.assertEquals(4, result);
    }

}