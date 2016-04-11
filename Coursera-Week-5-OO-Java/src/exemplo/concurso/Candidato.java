package exemplo.concurso;

public class Candidato
  implements Comparable<Candidato> {
  
  private int nota;
  private boolean deficiente;
  private int idade;
  
  /**
   * Construtor.
   * @param nota
   * @param deficiente
   * @param idade
   */
  public Candidato(int nota, boolean deficiente, int idade) {
    super();
    this.nota = nota;
    this.deficiente = deficiente;
    this.idade = idade;
  }

  /**
   * Retorna o valor da propriedade nota.
   * 
   * @return {@link #nota}
   */
  public int getNota() {
    return nota;
  }

  /**
   * Retorna o valor da propriedade deficiente.
   * 
   * @return {@link #deficiente}
   */
  public boolean isDeficiente() {
    return deficiente;
  }

  /**
   * Retorna o valor da propriedade idade.
   * 
   * @return {@link #idade}
   */
  public int getIdade() {
    return idade;
  }

  @Override
  public int compareTo(Candidato outro) {
    if (nota == outro.getNota()) {
      if (deficiente == outro.isDeficiente()) {
        return idade - outro.getIdade();
      } else {
        if (deficiente) {
          return 1;
        } else {
          return -1;
        }
      }
    } else {
      return nota - outro.getNota();
    }
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "Candidato [nota=" + nota + ", deficiente=" + deficiente +
      ", idade=" + idade + "]";
  }
  
  

}
