import java.util.Scanner;

class MinMaxAverage {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int count = 0;
        double sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        System.out.print("Inserisci una serie di numeri interi (scrivi 'fine' per terminare): ");
        while (input.hasNext()) {
            String line = input.next();
            if (line.equals("fine")) {
                break;
            }
            try {
                int num = Integer.parseInt(line);
                count++;
                sum += num;
                if (num < min) {
                    min = num;
                }
                if (num > max) {
                    max = num;
                }
            } catch (NumberFormatException e) {
                System.out.println("Input non valido. Riprova.");
            }
        }

        if (count == 0) {
            System.out.println("Nessun numero inserito.");
        } else {
            double average = sum / (double) count;
            System.out.println("Numero minore: " + min);
            System.out.println("Numero maggiore: " + max);
            System.out.println("Media: " + average);
        }
    }
}