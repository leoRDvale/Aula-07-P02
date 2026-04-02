package factory;

import armas.Arma;
import armas.Laser;
import personagens.Androide;
import personagens.Personagem;
import transporte.NaveEspacial;
import transporte.Transporte;

public class FabricaFuturista implements FabricaAbstrata {

    public Personagem criarPersonagem() {
        return new Androide(criarArma());
    }

    public Arma criarArma() {
        return new Laser();
    }

    public Transporte criarTransporte() {
        return new NaveEspacial();
    }
}