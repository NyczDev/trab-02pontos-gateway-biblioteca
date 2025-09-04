public class PagamentoCartaoCredito implements Pagamento {

    private String numCartao;

    public PagamentoCartaoCredito(String numCartao) {
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
            return "Pagamento de R$ " + String.format("%.2f", valor) + " com cartão de crédito foi realizado";
        } else {
            return "Erro: Número de cartão inválido.";
        }
    }
}