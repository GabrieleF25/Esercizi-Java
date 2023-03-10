public class Main {

    public static void main(String[] args) {

        Car myCar = new Car(2021, "Fiat");
        System.out.println("Anno: " + myCar.getYear() + ", Marca: " + myCar.getMake());
        myCar.startEngine();


    }
}