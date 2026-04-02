package personagens;

import armas.Arma;

public class Cavaleiro implements Personagem {
    private Arma arma;

    public Cavaleiro(Arma arma) {
        this.arma = arma;
    }

    public void atacar() {
        System.out.println("Cavaleiro ataca brandindo sua Espada!");
    }

    public void defender() {
        System.out.println("Cavaleiro se defende com sua armadura!");
    }

    public void exibirInfo() {
        System.out.println("Personagem: Cavaleiro | Tema: Medieval");
    }
}