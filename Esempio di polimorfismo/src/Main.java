public class Main {

    public static void main(String[] args) {

        // Creiamo un oggetto di tipo Dog e uno di tipo Cat
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        // Chiamiamo il metodo makeSound() per ogni animale
        // Questo esempio dimostra il polimorfismo, in cui la stessa
        // chiamata di metodo produce risultati diversi a seconda
        // del tipo di oggetto su cui viene chiamato.
        animal1.makeSound(); // Output: "The dog barks"
        animal2.makeSound(); // Output: "The cat meows"
    }
}