package factory;

import armas.Arma;
import personagens.Personagem;
import transporte.Transporte;

public interface FabricaAbstrata {
    Personagem criarPersonagem();
    Arma criarArma();
    Transporte criarTransporte();
}