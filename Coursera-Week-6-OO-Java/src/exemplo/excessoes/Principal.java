package exemplo.excessoes;

public class Principal {

  public static void main(String[] args) throws Exception {
    a(100);
    System.out.println("Terminando a execução de main()");
  }
  
  public static void a(int i) throws Exception {
    System.out.println("Executando a com " + i);
    b(i);
    /*try {
      b(i);
    }
    catch (Exception e) {
      System.out.println("Tratando a exceção " + e.getMessage());
    }
    System.out.println("Terminando a execução de a()");*/
  }
  
  public static void b(int i) throws Exception {
    System.out.println("Executando b com " + i);
    throw new Exception("Mensagem");
  }

}
