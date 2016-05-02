package exemplo.pilha2;

public class Principal {

  public static void main(String[] args) {
    Pilha p = new Pilha(10);
    p.empilhar("Eduardo");
    p.empilhar("Maria");
    p.empilhar("Jos�");
    System.out.println(p.topo());
    System.out.println(p.tamanho());
    
    Object[] arrayElementos = p.getElementos();
    arrayElementos[1] = "OUTRO";
    
    //Desempilhando
    System.out.println("-------------");
    System.out.println(p.desempilhar());
    System.out.println(p.topo());
    System.out.println(p.tamanho());
  }

}
