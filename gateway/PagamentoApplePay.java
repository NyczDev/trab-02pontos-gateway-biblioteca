public class PagamentoApplePay implements Pagamento {

    private boolean dispositivoAutorizado;

    public PagamentoApplePay(boolean dispositivoAutorizado) {
        this.dispositivoAutorizado = dispositivoAutorizado;
    }

    @Override
    public String processarPagamento(double valor) {
        if (this.dispositivoAutorizado) {
            return "Pagamento de R$ " + String.format("%.2f", valor) + " com Apple Pay processado com sucesso.";
        } else {
            return "Erro: Pagamento com Apple Pay falhou. Dispositivo não autorizado.";
        }
    }
}