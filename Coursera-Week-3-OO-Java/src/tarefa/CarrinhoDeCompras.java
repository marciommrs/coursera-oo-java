package tarefa;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

  private List<Pizza> pizzas = new ArrayList<Pizza>();
  
  public void adicionarPizza(Pizza pizza) {
    if (!pizza.getListaIngrediente().isEmpty()) {
      pizzas.add(pizza);
    }
  }
  
  public int getTotal() {
    int total = 0;
    for (Pizza pizza : pizzas) {
      total += pizza.getPreco();
    }
    return total;
  }
  
  public void imprimirTotal() {
    System.out.println("Valor total do carrinho de compras: " + getTotal());
  }
}
