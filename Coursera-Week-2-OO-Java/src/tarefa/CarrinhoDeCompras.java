package tarefa;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

  private List<Pizza> pizzas = new ArrayList<Pizza>();
  
  public void adicionarPizza(Pizza pizza) {
    pizzas.add(pizza);
  }
  
  public void imprimirTotal() {
    int total = 0;
    for (Pizza pizza : pizzas) {
      total += pizza.getPreco();
    }
    System.out.println("Valor total do carrinho de compras: " + total);
  }
}
