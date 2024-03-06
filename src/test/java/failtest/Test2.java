package failtest;


import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {
    @Test
    public void verifyLogin(){
        Assert.assertTrue(true);
        System.out.println("Verify Login");
    }

    @Test
    public void verifyLogin1(){
        Assert.assertTrue(true);
        System.out.println("Verify Login1");
    }

    @Test
    public void verifyHomePage(){
        System.out.println("Verify Home Page");
    }
    @Test
    public void verifyFundsTransfer()
    {
        System.out.println("Verify Fund Transfer");
    }
}


