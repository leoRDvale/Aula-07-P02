package armas;

import armas.Arma;

public class Espada implements Arma {

    public void usar() {
        System.out.println("Espada corta o inimigo com precisão!");
    }

    public void guardar() {
        System.out.println("Cavaleiro guarda Espada.");
    }

    public void exibirInfo() {
        System.out.println("Arma: Espada | Tipo: Corpo a Corpo");
    }
}