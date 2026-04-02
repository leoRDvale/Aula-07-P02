package factory;

import armas.Arma;
import armas.Espada;
import personagens.Cavaleiro;
import personagens.Personagem;
import transporte.Cavalo;
import transporte.Transporte;

public class FabricaMedieval implements FabricaAbstrata {

    public Personagem criarPersonagem() {
        return new Cavaleiro(criarArma());
    }

    public Arma criarArma() {
        return new Espada();
    }

    public Transporte criarTransporte() {
        return new Cavalo();
    }
}