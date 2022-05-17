public class Factory {
  private int typeBottle, reuso;
  public Double capacidade;
  public String name;

  // Constructors
  Factory(int typeBottle) {
    setTypeBottle(typeBottle);
  }

  Factory() {
  }

  // Getters and Setters
  public String getName() {
    return this.name;
  }
  public Double getCapacidade() {
    return this.capacidade;
  }
  public int getReuso() {
    return this.reuso;
  }
  public int getTypeBottle() {
    return typeBottle;
  }
  public void setReuso(int reuso) {
    this.reuso = reuso;
  }

  // Method to "create" the bottles
  public Garrafa setTypeBottle(int typeBottle) {

    switch (typeBottle) {
      case 1:
        return this.makePet();

      case 2:
        return this.makeGrande();

      case 3:
        return this.makeVidro();

      case 4:
        OutIn.Out("Muito obrigado por usar nossa fabrica!");
        System.exit(0);
      default:
        OutIn.Out("Erro ao criar uma garrafa!");
        break;
    }
    return null;
  }

  // Methods for the bottles
  public GarrafaPet makePet() {
    this.name = "Garrafa Pet";
    this.capacidade = 2d;
    this.setReuso(3);
    return new GarrafaPet();
  }

  public GarrafaGrande makeGrande() {
    this.name = "Garrafao";
    this.capacidade = 20d;
    this.setReuso(2);
    return new GarrafaGrande();
  }

  public GarrafaVidro makeVidro() {
    this.name = "Garrafa de vidro";
    this.capacidade = 0.5;
    this.setReuso(3);
    return new GarrafaVidro();
  }
}