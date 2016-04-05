package tarefa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pizza {
  
  private List<String> listaIngrediente = new ArrayList<String>();
  private static Map<String, Integer> mapaIngrediente = new HashMap<String, Integer>();
  
  /**
   * Adiciona ingrediente na pizza.
   * @param ingrediente
   */
  public void adicionaIngrediente(String ingrediente) {
    getListaIngrediente().add(ingrediente);
    contabilizaIngrediente(ingrediente);
  }
  
  /**
   * Retorna o preço da pizza.
   * @return
   */
  public int getPreco() {
    int preco = 0;
    if (getListaIngrediente().size() <= 2)
      preco = 15;
    else if (getListaIngrediente().size() <= 5)
      preco = 20;
    else
      preco = 23;
    return preco;
  }
  
  /**
   * Contabiliza a quantidade de ingredientes.
   * @param ingrediente
   */
  private void contabilizaIngrediente(String ingrediente) {
    Integer total = 1;
    if (mapaIngrediente.containsKey(ingrediente)) {
      total += mapaIngrediente.get(ingrediente); 
    }
    mapaIngrediente.put(ingrediente, total);
  }
  
  /**
   * Imprime a quantidade de ingredientes.
   */
  public static void imprimirIngredientes() {
    for (Map.Entry<String, Integer> entry : mapaIngrediente.entrySet()) {
      System.out.println("Quantidade do ingrediente " + entry.getKey() + ": " + entry.getValue());
    }
  }
  
  /**
   * Verifica se a pizza contem ingredientes.
   * @return
   */
  public boolean contemIngredientes() {
    return !getListaIngrediente().isEmpty();
  }

  /**
   * Retorna o valor da propriedade listaIngrediente.
   * 
   * @return {@link #listaIngrediente}
   */
  public List<String> getListaIngrediente() {
    return listaIngrediente;
  }

  /**
   * Configura o valor da propriedade listaIngrediente.
   * 
   * @param listaIngrediente atualiza {@link #listaIngrediente}
   */
  public void setListaIngrediente(List<String> listaIngrediente) {
    this.listaIngrediente = listaIngrediente;
  }

}
