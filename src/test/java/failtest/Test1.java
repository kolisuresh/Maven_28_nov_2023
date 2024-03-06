package failtest;

import iretryanalysis.IRetryanalzerExample;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
    @Test(retryAnalyzer = IRetryanalzerExample.class)
    public void verifyLogin(){
        Assert.assertTrue(true);
        System.out.println("Verify Login");
    }

    @Test(retryAnalyzer = IRetryanalzerExample.class)
    public void verifyLogin1(){
        Assert.assertTrue(false);
        System.out.println("Verify Login1");
    }

    @Test(retryAnalyzer = IRetryanalzerExample.class)
    public void verifyHomePage(){
        System.out.println("Verify Home Page");
    }
    @Test(retryAnalyzer = IRetryanalzerExample.class)
    public void verifyFundsTransfer()
    {

        System.out.println("Verify Fund Transfer");
    }
}


