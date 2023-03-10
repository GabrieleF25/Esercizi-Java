class Car {
    private int year;
    private String make;

    public Car(int year, String make) {
        this.year = year;
        this.make = make;
    }

    public void startEngine() {
        System.out.println("Motore avviato");
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
}