package tarefa.embaralhador;

import java.util.ArrayList;
import java.util.List;

public class EmbaralhadorVogalConsoante
  implements Embaralhador {

  @Override
  public String embaralhar(String palavra) {
    StringBuilder palavraEmbaralhada = new StringBuilder();
    List<Character> vogais = new ArrayList<>();
    List<Character> consoantes = new ArrayList<>();
    for (char c : palavra.toCharArray()) {
      switch (c)
      {
        case 'a': case 'A': case 'á': case 'Á':
        case 'e': case 'E': case 'é': case 'É':
        case 'i': case 'I': case 'í': case 'Í':
        case 'o': case 'O': case 'ó': case 'Ó':
        case 'u': case 'U': case 'ú': case 'Ú':
          vogais.add(c);
          break;
        default:
          consoantes.add(c);
      }
    }
    
    boolean terminou = false;
    while (!terminou) {
      if (!vogais.isEmpty()) {
        palavraEmbaralhada.append(vogais.remove(0));
      }
      if (!consoantes.isEmpty()) {
        palavraEmbaralhada.append(consoantes.remove(0));
      }
      if (consoantes.isEmpty() && vogais.isEmpty()) {
        terminou = true;
      }
    }
    return palavraEmbaralhada.toString();
  }

}
