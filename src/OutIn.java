import java.util.Scanner;

public final class OutIn {
  // Metodos de Atribuição
  static Scanner ler = new Scanner(System.in);

  // Input
  public static double InDouble(String texto) {
    System.out.println(texto);
    return ler.nextDouble();
  }

  public static int InInt(String texto) {
    System.out.println(texto);
    return ler.nextInt();
  }

  public static String In(String texto) {
    System.out.println(texto);
    return ler.nextLine();
  }

  // Output
  public static void Out(String texto) {
    System.out.println(texto);
  }

  public static void Out(int texto) {
    System.out.println(texto);
  }

  public static void Out(double texto) {
    System.out.println(texto);
  }
}