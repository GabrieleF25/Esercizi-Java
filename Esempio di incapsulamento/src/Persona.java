public class Persona {

    // definizione degli attributi della classe Persona come privati
    private String name;
    private int age;

    // costruttore della classe Persona
    public Persona(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // metodo getter per l'attributo name
    public String getName() {
        return name;
    }

    // metodo setter per l'attributo name
    public void setName(String name) {
        this.name = name;
    }

    // metodo getter per l'attributo age
    public int getAge() {
        return age;
    }

    // metodo setter per l'attributo age
    public void setAge(int age) {
        this.age = age;
    }
}
