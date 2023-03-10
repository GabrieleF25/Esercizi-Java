class Gatto extends Animale {
    private boolean peloLungo;

    public Gatto(String nome, int eta, boolean peloLungo) {
        super(nome, eta);
        this.peloLungo = peloLungo;
    }

    public boolean isPeloLungo() {
        return peloLungo;
    }

    public void setPeloLungo(boolean peloLungo) {
        this.peloLungo = peloLungo;
    }

    public void miagola() {
        System.out.println("Il gatto miagola");
    }
}