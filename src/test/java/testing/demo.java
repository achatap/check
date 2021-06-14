package testing;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class demo {


    @Parameters("username")
    @Test
    public void checkSecret(String user){
        System.out.println("Username is "+ user);
        if(user.equals("achatap") || user.contains("achatap")){
            System.out.println("username is correct");
        }
        else System.out.println("user is not correct");
    }
}
