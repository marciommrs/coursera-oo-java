package tarefa.extra;

public class CompraParcelada extends Compra {

  private int parcelas;
  private double juros;
  
  public CompraParcelada(double valor, int parcelas, double juros) {
    super(valor);
    this.parcelas = parcelas;
    this.juros = juros;
  }
  
  @Override
  public double total() {
    return super.total() * Math.pow((1 + juros/100), parcelas);
  }
  
}
