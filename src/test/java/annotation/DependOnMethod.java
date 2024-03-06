package annotation;

import iretryanalysis.IRetryanalzerExample;
import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.Test;

public class DependOnMethod {
    @Test
            public void verifyLogin(){
        Assert.assertTrue(true);
        System.out.println("Verify Login");
    }



    @Test(dependsOnMethods = {"verifyLogin"})
    public void verifyHomePage(){
        System.out.println("Verify Home Page");
    }
    @Test
    public void verifyFundsTransfer()
    {
        System.out.println("Verify Fund Transfer");
    }
}
