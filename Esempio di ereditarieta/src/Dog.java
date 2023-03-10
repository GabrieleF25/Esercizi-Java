 class Cane extends Animale {
    private String razza;

    public Cane(String nome, int eta, String razza) {
        super(nome, eta);
        this.razza = razza;
    }

    public String getRazza() {
        return razza;
    }

    public void setRazza(String razza) {
        this.razza = razza;
    }

    public void abbaia() {
        System.out.println("Il cane abbaia");
    }
}
