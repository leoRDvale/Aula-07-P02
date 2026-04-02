import armas.Arma;
import factory.FabricaAbstrata;
import factory.FabricaFantasia;
import factory.FabricaFuturista;
import factory.FabricaMedieval;
import personagens.Personagem;
import transporte.Transporte;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        Map<String, Supplier<FabricaAbstrata>> fabricas = new HashMap<>();

        fabricas.put("medieval", FabricaMedieval::new);
        fabricas.put("futurista", FabricaFuturista::new);
        fabricas.put("fantasia", FabricaFantasia::new);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tema: medieval | futurista | fantasia");
        String escolha = scanner.nextLine().toLowerCase();

        Supplier<FabricaAbstrata> fabricaSupplier = fabricas.get(escolha);

        if (fabricaSupplier == null) {
            System.out.println("Tema inválido!");
            return;
        }

        FabricaAbstrata fabrica = fabricaSupplier.get();

        Personagem p = fabrica.criarPersonagem();
        Arma a = fabrica.criarArma();
        Transporte t = fabrica.criarTransporte();

        System.out.println("\n=== Tema " + escolha.toUpperCase() + " ===");

        p.exibirInfo();
        a.exibirInfo();
        t.exibirInfo();

        p.atacar();
        a.usar();
        t.mover();

        a.guardar();
        t.parar();
    }
}