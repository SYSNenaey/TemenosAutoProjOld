package org.example;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {

    @BeforeMethod
    public void setUp() {
        // Code to run before each test method
    }
    public static void main(String[] args) {
       LoginClass.login("INPUTT","123456");
       HomeMenuNav.MenuCreateIndCustomer();
       CreateIndCustomer.CreateIndCustomer();
       LogoutClass.Logout();
       LoginClass.login("AUTHOR","1234567");
        // HomeMenuNav.MenuAuthorizeCustomer();
// authorize
       //CustomerEnquiryClass.CustomerEnquiryClass();
    }

    @AfterMethod
    public void tearDown() {
        // Code to run after each test method
    }
}