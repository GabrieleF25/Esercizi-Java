public class Main {

    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount();

        myAccount.deposit(1000);
        System.out.println("Il Saldo attuale è: " + myAccount.getBalance());

        myAccount.withdraw(500);
        System.out.println("Il Saldo attuale è: " + myAccount.getBalance());

        myAccount.withdraw(550);
        System.out.println("Il Saldo attuale è: " + myAccount.getBalance());

        myAccount.withdraw(450);
        System.out.println("Il Saldo attuale è: " + myAccount.getBalance());

        myAccount.withdraw(50);
        System.out.println("Il Saldo attuale è: " + myAccount.getBalance());

        myAccount.deposit(1500);
        System.out.println("Il Saldo attuale è: " + myAccount.getBalance());



    }
}
