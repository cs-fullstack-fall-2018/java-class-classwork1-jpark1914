public class MainAccount2 {

    public static void main(String[] args){
        Account hisAccount = new Account("Matt's Account", 1000);
        Account myAccount = new Account("My Account", 0);
        hisAccount.withdrawal(100);
        myAccount.deposit(100);
        System.out.println(hisAccount);
        System.out.println(myAccount);
    }
}
