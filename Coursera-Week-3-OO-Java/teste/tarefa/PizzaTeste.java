package tarefa;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class PizzaTeste {
  
  

  @Test
  public void testValorPizzaAteDoisIngredientes() {
    Pizza pizza = new Pizza();
    pizza.adicionaIngrediente("Mussarela");
    pizza.adicionaIngrediente("Calabreza");
    
    assertEquals(15, pizza.getPreco());
  }
  
  @Test
  public void testValorPizzaEntreTresECincoIngredientes() {
    Pizza pizza = new Pizza();
    pizza.adicionaIngrediente("Ovo");
    pizza.adicionaIngrediente("Mussarela");
    pizza.adicionaIngrediente("Pimentão");
    
    assertEquals(20, pizza.getPreco());
  }
  
  @Test
  public void testValorPizzaAcimaDeCincoIngredientes() {
    Pizza pizza = new Pizza();
    pizza.adicionaIngrediente("Banana");
    pizza.adicionaIngrediente("Morango");
    pizza.adicionaIngrediente("Amendoin");
    pizza.adicionaIngrediente("Castanha de cajú");
    pizza.adicionaIngrediente("Chocolate");
    pizza.adicionaIngrediente("Leite condensado");
    
    assertEquals(23, pizza.getPreco());
  }
  
  @Test
  public void testRegistroIngredientes() {
    Pizza pizza = new Pizza();
    pizza.adicionaIngrediente("Banana");
    pizza.adicionaIngrediente("Morango");
    pizza.adicionaIngrediente("Chocolate");
    
    assertEquals(3, pizza.getListaIngrediente().size());
  }
  
  @BeforeClass
  public static void zerarRegistroIngredientes() {
    Pizza.zerarRegistroIngredientes();
  }

}
