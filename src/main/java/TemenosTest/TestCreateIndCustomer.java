package TemenosTest;
import TemenosHelperPages.Customers.IndCustomer.AuthorizeIndCustomer;
import TemenosHelperPages.MenuNav.HomeMenuNav;
import TemenosHelperPages.Customers.IndCustomer.CreateIndCustomer;
import TemenosHelperPages.AppAuth.LoginClass;
import TemenosHelperPages.AppAuth.LogoutClass;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class TestCreateIndCustomer {


    public static void main(String[] args) {
        LoginClass.login("INPUTT","123456");
        HomeMenuNav.MenuCreateIndCustomer();
        CreateIndCustomer.CreateIndCustomer();
        LogoutClass.Logout();
        LoginClass.login("AUTHOR","1234567");
        HomeMenuNav.MenuAuthorizeCustomer();
        AuthorizeIndCustomer.AuthorizeIndCustomer();
    }

}