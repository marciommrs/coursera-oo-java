package tarefa;

public class Principal {

  public static void main(String[] args) {
    Pizza p1 = new Pizza();
    p1.adicionaIngrediente("Mussarela");
    p1.adicionaIngrediente("Calabreza");
    Pizza p2 = new Pizza();
    p2.adicionaIngrediente("Ovo");
    p2.adicionaIngrediente("Mussarela");
    p2.adicionaIngrediente("Pimentão");
    Pizza p3 = new Pizza();
    p3.adicionaIngrediente("Banana");
    p3.adicionaIngrediente("Morango");
    p3.adicionaIngrediente("Amendoin");
    p3.adicionaIngrediente("Castanha de cajú");
    p3.adicionaIngrediente("Chocolate");
    p3.adicionaIngrediente("Leite condensado");
    
    CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
    carrinho.adicionarPizza(p1);
    carrinho.adicionarPizza(p2);
    carrinho.adicionarPizza(p3);
    
    carrinho.imprimirTotal();
    Pizza.imprimirIngredientes();
  }

}
