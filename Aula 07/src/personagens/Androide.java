package personagens;

import armas.Arma;
import personagens.Personagem;

public class Androide implements Personagem {
    private Arma arma;

    public Androide(Arma arma) {
        this.arma = arma;
    }

    public void atacar() {
        System.out.println("Androide ataca disparando seu Laser!");
    }

    public void defender() {
        System.out.println("Androide ativa escudo de energia!");
    }

    public void exibirInfo() {
        System.out.println("Personagem: Androide | Tema: Futurista");
    }
}