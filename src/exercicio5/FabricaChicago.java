package exercicio5;

import exercicio5.*;
public class FabricaChicago implements FabricaIngredientes {
  public Massa criarMassa() {
    return new Massagrossa();
  }

  public Molho criarMolho() {
    return new MolhoTomateProfundo();
  }

  public Queijo criarQueijo() {
    return new QueijoMucarela();
  }
}


//israel