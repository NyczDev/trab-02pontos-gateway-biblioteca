public class PagamentoCredito implements Pagamento {

    private String numCartao;

    public PagamentoCredito(String numCartao) {
        this.numCartao = numCartao;
    }

    private boolean validarCartao() {
        if (numCartao == null) {
            return false;
        }
        String numeroLimpo = numCartao.replaceAll("\\s+", "");
        return numeroLimpo.length() == 16;
    }

    @Override
    public String processarPagamento(double valor) {
        if (validarCartao()) {
            return "Pagamento de R$ " + String.format("%.2f", valor) + " com cartão de crédito foi realizzado";
        }
    }
}