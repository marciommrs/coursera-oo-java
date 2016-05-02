package tarefa.embaralhador;

import java.util.Arrays;

/**
 * Embaralhador que converte as letras da palavra em uma lista de números, 
 * ordena a lista dos números de forma reversa e converte esses valores 
 * novamente em letras.
 * 
 * Exemplo: "janela"
 * 
 * Valor das letras      Ordem inversa 
 *     j - 106               a - 110
 *     a - 97                a - 108
 *     n - 110               e - 106
 *     e - 101               j - 101
 *     l - 108               l - 97
 *     a - 97                n - 97
 * 
 * Resultado: "aaejln"
 * 
 * @author Marcio Marques Rosa
 * @created 20/04/2016 14:03:29
 */
public class EmbaralhadorOrdemReversaValorNumeroLetra
  implements Embaralhador {

  @Override
  public String embaralhar(String palavra) {
    char a[] = palavra.toCharArray();
    int b[] = new int[a.length];
    
    //Copia o array de char para o array de int
    for (int i = 0; i < a.length; i++) {
      b[i] = a[i];
    }
    
    //Ordena os valores numéricos
    Arrays.sort(b);
    
    //Copia o array de int para o array de char na ordem reversa 
    for (int i = 0; i < b.length; i++) {
      a[i] = (char)b[(b.length-1) - i];
    }
    return new StringBuilder(String.copyValueOf(a)).reverse().toString();
  }
  
  
}
