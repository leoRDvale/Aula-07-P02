package transporte;

import transporte.Transporte;

public class NaveEspacial implements Transporte {

    public void mover() {
        System.out.println("Nave espacial viaja na velocidade da luz!");
    }

    public void parar() {
        System.out.println("Nave espacial entra em órbita.");
    }

    public void exibirInfo() {
        System.out.println("Transporte: Nave Espacial | Tipo: Aéreo");
    }
}