public class FactoryCartaoCredito extends PagamentoFactory {

    private String numCartao;

    public FactoryCartaoCredito(String numCartao) {
        this.numCartao = numCartao;
    }

    @Override
    public Pagamento criarPagamento() {
        return new PagamentoCartaoCredito(this.numCartao);
    }
}