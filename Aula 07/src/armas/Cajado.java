package armas;

public class Cajado implements Arma {

    public void usar() {
        System.out.println("Cajado lança magia poderosa!");
    }

    public void guardar() {
        System.out.println("Mago guarda Cajado.");
    }

    public void exibirInfo() {
        System.out.println("Arma: Cajado | Tipo: Mágico");
    }
}