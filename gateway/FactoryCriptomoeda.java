public class FactoryCriptomoeda extends PagamentoFactory {

    private double saldoCarteira;

    public FactoryCriptomoeda(double saldoCarteira) {
        this.saldoCarteira = saldoCarteira;
    }

    @Override
    public Pagamento criarPagamento() {
        return new PagamentoCriptomoeda(this.saldoCarteira);
    }
}