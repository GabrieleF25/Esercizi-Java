public class BankAccount {
        private double balance;                                         // attributo che rappresenta il saldo del conto

                                                                        // metodo per depositare fondi sul conto
        public void deposit(double amount) {
            balance += amount;
        }
                                                                        // metodo per prelevare fondi dal conto
        public void withdraw(double amount) {
            if (balance >= amount) {
                balance -= amount;
            } else {
                System.out.println("Saldo insufficiente per effettuare il prelievo.");
            }
        }
                                                                         // metodo getter per ottenere il saldo attuale del conto
        public double getBalance() {
            return balance;
        }
}