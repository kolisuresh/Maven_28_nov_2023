package annotation;

import org.testng.annotations.*;

public class AfterClassBeforeClassAnnotation {

    @BeforeClass
    public void beforeClassMethod() {
        System.out.println("Before Class");
    }

    @BeforeMethod
    public void Method1() {
        System.out.println("Before Method");
    }

    @Test
    public void testcase1() {
        System.out.println("Test Case 1");
    }

    @Test
    public void testcase2() {
        System.out.println("Test Case 2");
    }

    @AfterMethod
    public void afterMethod1() {
        System.out.println("After Method");
    }

    @AfterClass
    public void AfterClassMethod() {
        System.out.println("Before Class");
    }
}
