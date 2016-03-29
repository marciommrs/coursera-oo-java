package tarefa;

/**
 * Classe principal.
 * @author Marcio Marques Rosa
 * @created 21/03/2016 14:52:03
 */
public class Principal {

  /**
   * Main
   * @param args
   */
  public static void main(String[] args) {
    Paciente p1 = new Paciente(94.7, 1.81);
    System.out.println(p1.calcularIMC());
    System.out.println(p1.diagnostico());
    
    Paciente p2 = new Paciente(70, 1.58);
    System.out.println(p2.calcularIMC());
    System.out.println(p2.diagnostico());
    
    Paciente p3 = new Paciente(79, 1.84);
    System.out.println(p3.calcularIMC());
    System.out.println(p3.diagnostico());
  }

}
