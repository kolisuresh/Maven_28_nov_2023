package testng.priority;

import org.testng.annotations.Test;

public class WithoutPriority {
    @Test
    public void testscriptA(){
        System.out.println("Test Script A");
    }

    @Test
    public void testscriptB(){
        System.out.println("Test Script B");
    }

    @Test
    public void testscriptC(){
        System.out.println("Test Script C");
    }

    @Test
    public void testscriptD(){
        System.out.println("Test Script D");
    }

}
