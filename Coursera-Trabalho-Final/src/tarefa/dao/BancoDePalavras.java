package tarefa.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BancoDePalavras {
  
  private List<String> palavras = new ArrayList<>();
  private List<String> listaPalavrasOriginal = new ArrayList<>();
  
  public BancoDePalavras() throws Exception {
    try {
      carregarArquivoPalavras();
      listaPalavrasOriginal.addAll(palavras);
    }
    catch (IOException e) {
      throw new Exception("Não foi possível carregar as palavras do arquivo.", e);
    }
  }

  public String getPalavra() {
    if (!palavras.isEmpty()) {
      Collections.shuffle(palavras);
      return palavras.remove(0);
    }
    return null;
  }
  
  public boolean isPalavrasVazio() {
    return palavras.isEmpty();
  }
  
  public int getQuantidadePalavras() {
    return listaPalavrasOriginal.size();
  }
  
  private void carregarArquivoPalavras() throws FileNotFoundException, IOException {
    try(BufferedReader in = new BufferedReader(new FileReader("./resource/palavras.txt"))) {
      String linha;
      palavras = new ArrayList<>();
      while ((linha = in.readLine()) != null) {
        palavras.add(linha);
      }
    }
  }
  
}
