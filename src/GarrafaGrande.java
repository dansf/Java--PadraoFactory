public class GarrafaGrande implements Garrafa {

  @Override
  public void encher() {
    OutIn.Out("O garrafao foi enchida!");
  }

  public void reciclar() {
    OutIn.Out("O garrafao foi reciclado!");
  }

}