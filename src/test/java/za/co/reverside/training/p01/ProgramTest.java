package za.co.reverside.training.p01;


import org.junit.Assert;
import org.junit.Test;



public class ProgramTest {

    @Test
    public void test(){
        Program program = new Program();
        int result = program.add(5, 7);
        Assert.assertEquals(12, result);
    }
}
