package Utility;

import org.testng.annotations.DataProvider;

public class DataSet {

    @DataProvider(name = "validCredentials")
    public static Object ValidCredentials(){
        Object[][] data = {
                {"standard_user", "secret_sauce"}
        };
        return data;
    }

    @DataProvider(name = "inValidCredentials")
    public static Object InValidCredentials(){
        Object[][] data = {
                {"Kishore_user", "Kishore11"}
        };
        return data;
    }

    @DataProvider(name = "lockedOutUserCredentials")
    public static Object LockedOutUserCredentials(){
        Object[][] data = {
                {"locked_out_user", "secret_sauce"}
        };
        return data;
    }
}
