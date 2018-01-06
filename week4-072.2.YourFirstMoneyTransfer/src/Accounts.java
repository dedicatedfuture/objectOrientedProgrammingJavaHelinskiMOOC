
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account mattsAcct = new Account("Matt's account", 1000);
        Account myAcct   = new Account("My account", 0);
        mattsAcct.withdrawal(100);
        myAcct.deposit(100);

        System.out.println(mattsAcct);
        System.out.println(myAcct);
    }

}
