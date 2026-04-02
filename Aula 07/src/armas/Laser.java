package armas;

public class Laser implements Arma {

    public void usar() {
        System.out.println("Laser destrói o inimigo com energia pura!");
    }

    public void guardar() {
        System.out.println("Android guarda Laser.");
    }

    public void exibirInfo() {
        System.out.println("Arma: Laser | Tipo: Longa Distância");
    }
}