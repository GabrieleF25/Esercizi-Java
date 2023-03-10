// Definiamo una sottoclasse Dog che eredita dalla classe Animal

public class Dog extends Animal {

    // Sovrascriviamo il metodo makeSound() della classe Animal
    // per farlo "abbaiare" invece di "fare un suono generico"

    public void makeSound() {
        System.out.println("The dog barks");
    }
}