public class Main {

    public static void main(String[] args) {

        // istanziamo un oggetto di tipo Persona con nome "Kevin" e età 30
        Persona person = new Persona("Kevin", 30);

        // stampiamo il nome e l'età dell'oggetto person
        System.out.println(person.getName()); // Output: "Kevin"
        System.out.println(person.getAge()); // Output: 30

        // cambiamo il nome e l'età dell'oggetto person usando i metodi setter
        person.setName("Jane");
        person.setAge(25);

        // stampiamo il nuovo nome e la nuova età dell'oggetto person
        System.out.println(person.getName()); // Output: "Jane"
        System.out.println(person.getAge()); // Output: 25
    }
}