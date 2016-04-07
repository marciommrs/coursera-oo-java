package tarefa;

import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {

  private Map<Produto, Integer> produtos = new HashMap<>();
  
  public void adicionaProduto(Produto produto, Integer quantidade) {
    if (produtos.containsKey(produto)) {
      Integer total = produtos.get(produto);
      produtos.put(produto, total + quantidade);
    } else {
      produtos.put(produto, quantidade);
    }
  }
  
  public void removeProduto(Produto produto, Integer quantidade) {
    if (produtos.containsKey(produto)) {
      Integer total = produtos.get(produto);
      if (quantidade > total) {
        total = 0;
      } else {
        total -= quantidade;
      }
      produtos.put(produto, total);
    }
  }
  
  public int getQuantidadeProdutos() {
    Integer total = 0;
    for (Integer quantidade: produtos.values()) {
      total += quantidade;
    }
    return total;
  }

}
