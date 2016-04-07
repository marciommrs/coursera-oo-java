package tarefa;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TesteCarrinhoDeCompras {

  Produto p1;
  Produto p2;
  Produto p3;
  Produto p4;
  
  @Before
  public void inicializarProdutos() {
    p1 = new Produto(1, "Arroz Branco", 9.90);
    p2 = new Produto(2, "Feijão Carioca", 4.90);
    p3 = new ProdutoComTamanho(1, "Macarrão", 3.90, 1);
    p4 = new ProdutoComTamanho(2, "Macarrão combo", 5.90, 2);
  }
  
  @Test
  public void testAdicionarProduto() {
    CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
    carrinho.adicionaProduto(p1, 2);
    carrinho.adicionaProduto(p2, 3);
    carrinho.adicionaProduto(p3, 1);
    carrinho.adicionaProduto(p4, 2);
    
    assertEquals(8, carrinho.getQuantidadeProdutos());
  }

}
