package factory;

import armas.Arma;
import armas.Cajado;
import personagens.Mago;
import personagens.Personagem;
import transporte.Transporte;
import transporte.Vassoura;

public class FabricaFantasia implements FabricaAbstrata {

    public Personagem criarPersonagem() {
        return new Mago(criarArma());
    }

    public Arma criarArma() {
        return new Cajado();
    }

    public Transporte criarTransporte() {
        return new Vassoura();
    }
}