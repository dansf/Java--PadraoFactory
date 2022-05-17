public class GarrafaVidro implements Garrafa{

    @Override
    public void encher() {
      OutIn.Out("A garrafa de vidro foi enchida!");
    }

    public void reciclar() {
      OutIn.Out("Garrafa de vidro reciclada!");
    }

}