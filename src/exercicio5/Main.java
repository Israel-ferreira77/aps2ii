package exercicio5;

import exercicio5.*;


 public class Main {
    public static void main(String[] args) {
        // Fábricas
        FabricaIngredientes fabricaNY = new FabricaNovaYork();
        FabricaIngredientes fabricaChicago = new FabricaChicago();

        // Pizzas de Nova York
        System.out.println("=== Pizzas de Nova York ===");
        Pizza[] pizzasNY = {
            new Pizza("queijo", fabricaNY),
            new Pizza("pepperoni", fabricaNY),
            new Pizza("calabresa", fabricaNY)
        };
        for (Pizza pizza : pizzasNY) {
            pizza.mostrarIngredientes();
            System.out.println();
        }

        // Pizzas de Chicago
        System.out.println("=== Pizzas de Chicago ===");
        Pizza[] pizzasChicago = {
            new Pizza("queijo", fabricaChicago),
            new Pizza("pepperoni", fabricaChicago),
            new Pizza("calabresa", fabricaChicago)
        };
        for (Pizza pizza : pizzasChicago) {
            pizza.mostrarIngredientes();
            System.out.println();
        }
    }
}

//SOU EU ISRAEL