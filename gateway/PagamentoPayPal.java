public class PagamentoPayPal implements Pagamento {

    private String email;

    public PagamentoPayPal(String email) {
        this.email = email;
    }

    private boolean validarContaPayPal() {
        return this.email != null && this.email.contains("@") && this.email.endsWith(".com");
    }

    @Override
    public String processarPagamento(double valor) {
        if (validarContaPayPal()) {
            return "Pagamento de R$ " + String.format("%.2f", valor) + " com PayPal processado para a conta " + this.email + ".";
        } else {
            return "Erro: Conta PayPal inválida.";
        }
    }
}