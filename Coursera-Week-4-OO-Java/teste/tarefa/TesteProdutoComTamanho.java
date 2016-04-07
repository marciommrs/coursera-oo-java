package tarefa;

import org.junit.Before;

public class TesteProdutoComTamanho extends TesteProduto {

  @Before
  public void inicializaProdutos() {
    p1 = new ProdutoComTamanho(1, "Arroz Branco 5kg", 9.90, 5);
    p2 = new ProdutoComTamanho(1, "Arroz Branco 5kg cópia", 9.90, 5);
    p3 = new ProdutoComTamanho(1, "Arroz Branco 1kg", 3.90, 1);
  }

}
