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
        case 'a': case 'A': case '�': case '�':
        case 'e': case 'E': case '�': case '�':
        case 'i': case 'I': case '�': case '�':
        case 'o': case 'O': case '�': case '�':
        case 'u': case 'U': case '�': case '�':
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
