public class PagamentoService {

    public String processarPagamento(PagamentoFactory factory, double valor) {
        Pagamento metodoPagamento = factory.criarPagamento();
        return metodoPagamento.processarPagamento(valor);
    }
}