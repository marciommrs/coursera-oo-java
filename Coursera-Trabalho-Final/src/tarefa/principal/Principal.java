package tarefa.principal;

import java.util.Scanner;

import tarefa.mecanica.FabricaMecanicaDoJogo;
import tarefa.mecanica.MecanicaDoJogo;

public class Principal {
  
  public static void main(String[] args) {
    
    MecanicaDoJogo jogo = null;
    boolean acertou = false;
    String palavra = null;
    
    
    
    try (Scanner in = new Scanner(System.in)){
      jogo = FabricaMecanicaDoJogo.getMecanicaDoJogo();
      jogo.iniciar();
      
      //APRESENTA A DESCRI��O DO JOGO
      System.out.println("#####################################");
      System.out.println(jogo.getDescricaoJogo());
      System.out.println("#####################################\n");
      
      
      while(!jogo.terminou()) {
        
        //APRESENTA A PR�XIMA PALAVRA
        System.out.println("\n------------------------------------");
        System.out.println("Palavra: \"" + jogo.proximaPalavra() + "\"");
        System.out.println("------------------------------------");
        
        //RECEBE A PALABRA E VERIFICAR SE ACERTOU
        while(jogo.tentar()) {
          System.out.println("Dicifre a palavra acima: ");
          palavra = in.nextLine();
          acertou = jogo.validarTentativa(palavra);
          
          if (acertou) {
            System.out.println("Acertou!");
            break;
          } else {
            System.out.println("Errou!");
          }
        }
        
      }
      
      System.out.println("Pontua��o: " + jogo.pontuacao() + " respostas certas!");
    } catch (Exception e) {
      System.out.println("N�o foi poss�vel executar o jogo! Erro: " + e.getMessage());
    }
    
  }
  
  

}
