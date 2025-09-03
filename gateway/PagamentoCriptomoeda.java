public class PagamentoCriptomoeda implements Pagamento {

    private double saldoCarteira;

    public PagamentoCriptomoeda(double saldoCarteira) {
        this.saldoCarteira = saldoCarteira;
    }

    private boolean verificarSaldoSuficiente(double valor) {
        return this.saldoCarteira >= valor;
    }

    @Override
    public String processarPagamento(double valor) {
        if (verificarSaldoSuficiente(valor)) {
            this.saldoCarteira -= valor;
            return "Pagamento de " + valor + " em criptomoedas realizado";
        }
    }
}