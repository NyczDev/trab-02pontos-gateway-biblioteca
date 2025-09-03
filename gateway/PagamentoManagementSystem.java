public class PagamentoManagementSystem {

    public static void main(String[] args) {
        PagamentoService servicoDePagamento = new PagamentoService();
        double valorDaCompra = 250.50;

        System.out.println("Iniciando simulação de pagamentos...");
        System.out.println("========================================\n");

        System.out.println("Processando pagamento com Cartão de Crédito...");
        PagamentoFactory factoryCartao = new FactoryCartaoCredito("1111 2222 3333 4444");
        String resultadoCartao = servicoDePagamento.processar(factoryCartao, valorDaCompra);
        System.out.println("Status: " + resultadoCartao);
        System.out.println();
        System.out.println("Processando pagamento com Cartão de Crédito Inválido...");
        PagamentoFactory factoryCartaoInvalido = new FactoryCartaoCredito("1234");
        String resultadoCartaoInvalido = servicoDePagamento.processar(factoryCartaoInvalido, valorDaCompra);
        System.out.println("Status: " + resultadoCartaoInvalido);
        System.out.println();

        System.out.println("Processando pagamento com PayPal...");
        PagamentoFactory factoryPayPal = new FactoryPayPal("cliente@gmail.com");
        String resultadoPayPal = servicoDePagamento.processar(factoryPayPal, valorDaCompra);
        System.out.println("Status: " + resultadoPayPal);
        System.out.println();

        System.out.println("Processando pagamento com Criptomoedas...");
        PagamentoFactory factoryCripto = new FactoryCriptomoeda(0.5);
        double valorEmCripto = 0.05;
        String resultadoCripto = servicoDePagamento.processar(factoryCripto, valorEmCripto);
        System.out.println("Status: " + resultadoCripto);
        System.out.println();
        
        System.out.println("Processando pagamento com Criptomoedas (Saldo Insuficiente)...");
        PagamentoFactory factoryCriptoInsuficiente = new FactoryCriptomoeda(0.01);
        String resultadoCriptoInsuficiente = servicoDePagamento.processar(factoryCriptoInsuficiente, valorEmCripto);
        System.out.println("Status: " + resultadoCriptoInsuficiente);
        System.out.println();
        
        System.out.println("========================================");
        System.out.println("Simulação de pagamentos finalizada.");
    }
}