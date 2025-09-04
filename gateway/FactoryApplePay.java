public class FactoryApplePay extends PagamentoFactory {

    private boolean dispositivoAutorizado;

    public FactoryApplePay(boolean dispositivoAutorizado) {
        this.dispositivoAutorizado = dispositivoAutorizado;
    }

    @Override
    public Pagamento criarPagamento() {
        return new PagamentoApplePay(this.dispositivoAutorizado);
    }
}