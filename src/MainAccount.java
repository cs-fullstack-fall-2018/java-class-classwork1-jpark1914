public class MainAccount {
    public static void main(String[] args){
        Account myAccount = new Account("JP", 100);
        myAccount.deposit(20);
        System.out.println(myAccount.balance());

    }
}
