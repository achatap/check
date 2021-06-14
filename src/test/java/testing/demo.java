package testing;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class demo {

    @Parameters("username")
    @Test
    public void checkSecret(String user){
        System.out.println("Username is "+ user);
    }
}
