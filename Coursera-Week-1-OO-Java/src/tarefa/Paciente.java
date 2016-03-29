package tarefa;

/**
 * Classe Paciente.
 * @author Marcio Marques Rosa
 * @created 21/03/2016 14:52:30
 */
public class Paciente {

  private double peso; 
  private double altura;
  
  /**
   * Construtor.
   * @param peso
   * @param altura
   */
  public Paciente(double peso, double altura) {
    super();
    this.peso = peso;
    this.altura = altura;
  }
  
  /**
   * Método responsável por calcular o IMC.
   * @return
   */
  public double calcularIMC() {
    return peso / (altura * altura);
  }
  
  /**
   * Método responsável por retornar o diagnóstico.
   * @return
   */
  public String diagnostico() {
    double imc = calcularIMC();
    String diagnostico = "";
    if (imc < 16) {
      diagnostico = "Baixo peso muito grave";
    }
    else if (imc >= 16 && imc <= 16.99) {
      diagnostico = "Baixo peso grave";
    }
    else if (imc >= 17 && imc <= 18.49) {
      diagnostico = "Baixo peso";
    }
    else if (imc >= 18.50 && imc <= 24.99) {
      diagnostico = "Peso normal";
    }
    else if (imc >= 25 && imc <= 29.99) {
      diagnostico = "Sobrepeso";
    }
    else if (imc >= 30 && imc <= 34.99) {
      diagnostico = "Obesidade grau I";
    }
    else if (imc >= 35 && imc <= 39.99) {
      diagnostico = "Obesidade grau II";
    }
    else if (imc >= 40) {
      diagnostico = "Obesidade grau III";
    }
    return diagnostico;
  }
  
}
