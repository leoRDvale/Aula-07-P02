package transporte;

import transporte.Transporte;

public class Vassoura implements Transporte {

    public void mover() {
        System.out.println("A vassoura levanta voo ao chamado do mago");
    }

    public void parar() {
        System.out.println("A vassoura pousa");
    }

    public void exibirInfo() {
        System.out.println("Transporte: Vassoura | Tipo: Voador");
    }
}