package za.co.reverside.training.p03;

import org.junit.Assert;
import org.junit.Test;

public class ProgramTest {

    @Test
    public void test1() throws Exception {
        Program program = new Program();
        int result = program.findLargest(1, 2, 3);
        Assert.assertEquals(3, result);
    }

    @Test
    public void test2() throws Exception {
        Program program = new Program();
        int result = program.findLargest(2, 3, 1);
        Assert.assertEquals(3, result);
    }

    @Test
    public void test3() throws Exception {
        Program program = new Program();
        int result = program.findLargest(3, 1, 2);
        Assert.assertEquals(3, result);
    }

    @Test
    public void test4() throws Exception {
        Program program = new Program();
        int result = program.findLargest(3, 3, 3);
        Assert.assertEquals(3, result);
    }
}