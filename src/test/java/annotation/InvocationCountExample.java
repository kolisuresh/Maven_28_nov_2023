package annotation;

import org.testng.annotations.Test;

public class InvocationCountExample {

    @Test(invocationCount = 10,invocationTimeOut = 5)
    public void iCountExample(){
        System.out.println("I Count Method");
    }

}
