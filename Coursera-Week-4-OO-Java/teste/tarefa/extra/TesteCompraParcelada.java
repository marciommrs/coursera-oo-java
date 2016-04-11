package tarefa.extra;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteCompraParcelada {

  @Test
  public void test1Parcelas() {
    CompraParcelada compra = new CompraParcelada(640, 1, 2);
    assertEquals(652.8, compra.total(), 2);
  }
  
  @Test
  public void test2Parcelas() {
    CompraParcelada compra = new CompraParcelada(640, 2, 2);
    assertEquals(665.856, compra.total(), 2);
  }
  
  @Test
  public void test5Parcelas() {
    CompraParcelada compra = new CompraParcelada(640, 5, 2);
    assertEquals(706.61, compra.total(), 2);
  }
  
  @Test
  public void test10Parcelas() {
    CompraParcelada compra = new CompraParcelada(640, 10, 2);
    assertEquals(780.15, compra.total(), 2);
  }
  

}
