package tarefa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

public class TesteProduto {

  Produto p1;
  Produto p2;
  Produto p3;
  
  @Before
  public void inicializaProdutos() {
    p1 = new Produto(1, "Arroz Branco", 9.90);
    p2 = new Produto(1, "Arroz Branco cópia", 9.90);
    p3 = new Produto(2, "Arroz Integral", 5.90);
    
  }
  
  @Test
  public void testProdutosIguais() {
    assertEquals(p1, p2);
  }
  
  @Test
  public void testProdutosDiferentes() {
    assertNotEquals(p1, p3);
  }

}
