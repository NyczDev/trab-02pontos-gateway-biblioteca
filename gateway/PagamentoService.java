public class PagamentoService {

    public String processar(PagamentoFactory factory, double valor) {
        Pagamento metodoPagamento = factory.criarPagamento();
        return metodoPagamento.processarPagamento(valor);
    }
}