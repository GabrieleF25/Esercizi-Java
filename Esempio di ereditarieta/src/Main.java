public class Main {

    public static void main(String[] args) {

        Animale animale = new Animale("Fido", 5);
        System.out.println("Nome: " + animale.getNome());
        System.out.println("Età: " + animale.getEta());
        animale.emettiVerso();

        Cane cane = new Cane("Jack", 3, "Bulldog");
        System.out.println("Nome: " + cane.getNome());
        System.out.println("Età: " + cane.getEta());
        System.out.println("Razza: " + cane.getRazza());
        cane.emettiVerso();
        cane.abbaia();

        Gatto gatto = new Gatto("Rose", 2, true);
        System.out.println("Nome: " + gatto.getNome());
        System.out.println("Età: " + gatto.getEta());
        System.out.println("Pelo lungo: " + gatto.isPeloLungo());
        gatto.emettiVerso();
        gatto.miagola();

    }
}