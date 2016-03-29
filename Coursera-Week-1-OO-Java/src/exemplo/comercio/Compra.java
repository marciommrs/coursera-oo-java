package exemplo.comercio;

public class Compra {

    int valorTotal;
    int numeroParcelas;

    // a vista
    public Compra(int valor) {
	valorTotal = valor;
	numeroParcelas = 1;
    }
    
    //parcelado
    public Compra(int qtdParcela, int valorParcela) {
	numeroParcelas = qtdParcela;
	valorTotal = valorParcela * qtdParcela;
    }

    /**
     * Retorna o valor da propriedade valorTotal.
     * 
     * @return {@link #valorTotal}
     */
    public int getValorTotal() {
        return valorTotal;
    }

    /**
     * Retorna o valor da propriedade numeroParcelas.
     * 
     * @return {@link #numeroParcelas}
     */
    public int getNumeroParcelas() {
        return numeroParcelas;
    }
    
    public int getValorParcela() {
	return valorTotal/numeroParcelas;
    }

}
