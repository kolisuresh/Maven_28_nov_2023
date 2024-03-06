package testng.priority;

import org.testng.annotations.Test;

public class PriorityExample {
    @Test(priority=1)
    public void testscriptA(){
        System.out.println("Test Script A");
    }

    @Test (priority=0)
    public void testscriptB(){
        System.out.println("Test Script B");
    }

    @Test (priority=3)
    public void testscriptC(){
        System.out.println("Test Script C");
    }

    @Test (priority=2)
    public void testscriptD(){
        System.out.println("Test Script D");
    }
}
