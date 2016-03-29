package exemplo.estaticavsinstancia;


public class Somador {
  
  String nome;
  int valorInstancia = 0;
  static int valorEstatica = 0;
  
  void soma() {
    valorInstancia++;
    valorEstatica++;
  }
  
  void imprimir() {
    System.out.println("O somador "+nome+": instancia="+valorInstancia+" e estatica="+valorEstatica);
  }

}
