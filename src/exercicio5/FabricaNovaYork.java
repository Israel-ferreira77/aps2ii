package exercicio5;

import exercicio5.*;

public class FabricaNovaYork implements FabricaIngredientes {
  public Massa criarMassa() {
    return new MassaFina();
  }

  public Molho criarMolho() {
    return new MolhoMarinara();
  }

  public Queijo criarQueijo() {
    return new QueijoRalado();
  }
}


//israel//