package annotation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroup {

    @Test(groups = {"smoke"})
    public void verifyLogin() {
        Assert.assertTrue(true);
        System.out.println("Verify Login");
    }

    @Test(dependsOnGroups = {"smoke"},alwaysRun = true)
    public void verifyHomePage() {
        System.out.println("Verify Home Page");
    }

    @Test
    public void verifyFundsTransfer() {
        System.out.println("Verify Fund Transfer");
    }
    @Test(enabled = true)

    public void CashBackOffer() {
        System.out.println("Cash Back Offer");

        {

        }
    }
}
