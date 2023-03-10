// Definiamo una sottoclasse Cat che eredita dalla classe Animal

public class Cat extends Animal {

    // Sovrascriviamo il metodo makeSound() della classe Animal
    // per farlo "miagolare" invece di "fare un suono generico"

    public void makeSound() {
        System.out.println("The cat meows");
    }
}