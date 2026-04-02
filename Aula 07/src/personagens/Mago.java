package personagens;

import armas.Arma;
import personagens.Personagem;

public class Mago implements Personagem {
    private Arma arma;

    public Mago(Arma arma) {
        this.arma = arma;
    }

    public void atacar() {
        System.out.println("Mago ataca conjurando magia com seu Cajado!");
    }

    public void defender() {
        System.out.println("Mago cria um escudo mágico!");
    }

    public void exibirInfo() {
        System.out.println("Personagem: Mago | Tema: Fantasia");
    }
}