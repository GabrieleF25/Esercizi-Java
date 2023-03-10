import java.math.BigInteger;

public class Fibonacci {
    public static void main(String[] args) {
        //i numeri di Fibonacci che vogliamo generare.
        int n = 100;

        // Inizializziamo un array di BigInteger per contenere i numeri di Fibonacci.
        BigInteger[] fib = new BigInteger[n];

        // Inizializziamo i primi due elementi della sequenza di Fibonacci.
        fib[0] = BigInteger.ZERO; // il primo numero è 0
        fib[1] = BigInteger.ONE; // il secondo numero è 1

        // Calcoliamo gli elementi successivi della sequenza di Fibonacci.
        for (int i = 2; i < n; i++) {
            // L'elemento corrente è la somma degli elementi precedenti.
            fib[i] = fib[i-1].add(fib[i-2]);
        }

        // Stampiamo tutti gli elementi della sequenza di Fibonacci.
        for (int i = 0; i < n; i++) {
            System.out.println(fib[i]);
        }
    }
}