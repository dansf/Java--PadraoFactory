public class Main {
  public static void main(String[] args) {
    Factory factory = new Factory();

    OutIn.Out("");
    OutIn.Out("Bem vindo a fabrica de Garrafas!");
    OutIn.Out("[1] Garrafa Pet");
    OutIn.Out("[2] Garrafao");
    OutIn.Out("[3] Garrafa de vidro");
    OutIn.Out("[4] Exit");
    Garrafa garrafa = factory.setTypeBottle(OutIn.InInt("Selecione qual garrafa deseja fazer: "));

    OutIn.Out(factory.getName() + " criada(o) com " + factory.getCapacidade() + " litros!");

    OutIn.Out("");
    OutIn.Out(factory.getName() + " so pode ser reusada " + factory.getReuso() + " vezes.");
    OutIn.Out("Enchendo "+ factory.getName() + ": ");
    for (int i = 0; i < factory.getReuso(); i++) {
      garrafa.encher();

      if (i == factory.getReuso() - 1) {
        garrafa.reciclar();
        factory.setReuso(0);
      }
    }

  }
}
