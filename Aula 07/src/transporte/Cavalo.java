package transporte;

public class Cavalo implements Transporte {

    public void mover() {
        System.out.println("Cavalo galopa rapidamente!");
    }

    public void parar() {
        System.out.println("Cavalo para de se mover.");
    }

    public void exibirInfo() {
        System.out.println("Transporte: Cavalo | Tipo: Terrestre");
    }
}