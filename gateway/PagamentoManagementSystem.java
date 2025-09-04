public class PagamentoManagementSystem {

    public static void main(String[] args) {
        PagamentoService servicoDePagamento = new PagamentoService();
        double valorDaCompra = 100;
        
        System.out.println("Iniciando simulação de pagamentos...");
        System.out.println("========================================\n");
        
        System.out.println("Cartão de Crédito");
        PagamentoFactory factoryCartao = new FactoryCartaoCredito("1111 2222 3333 4444");
        String resultadoCartao = servicoDePagamento.processarPagamento(factoryCartao, valorDaCompra);
        System.out.println(resultadoCartao);
        System.out.println();
        System.out.println("Cartão de Crédito Inválido");
        PagamentoFactory factoryCartaoInvalido = new FactoryCartaoCredito("1234");
        String resultadoCartaoInvalido = servicoDePagamento.processarPagamento(factoryCartaoInvalido, valorDaCompra);
        System.out.println(resultadoCartaoInvalido);
        System.out.println();

        System.out.println("PayPal");
        PagamentoFactory factoryPayPal = new FactoryPayPal("cliente@gmail.com");
        String resultadoPayPal = servicoDePagamento.processarPagamento(factoryPayPal, valorDaCompra);
        System.out.println(resultadoPayPal);
        System.out.println();
        
        System.out.println("PayPal Inválido");
        PagamentoFactory factoryPayPalInvalido = new FactoryPayPal("cliente");
        String resultadoPayPalInvalido = servicoDePagamento.processarPagamento(factoryPayPalInvalido, valorDaCompra);
        System.out.println(resultadoPayPalInvalido);
        System.out.println();

        System.out.println("Criptomoedas");
        double valorEmCripto = 0.05; 
        PagamentoFactory factoryCripto = new FactoryCriptomoeda(0.5);
        String resultadoCripto = servicoDePagamento.processarPagamento(factoryCripto, valorEmCripto);
        System.out.println(resultadoCripto);
        System.out.println();
        
        System.out.println("Criptomoedas (Saldo Insuficiente)");
        PagamentoFactory factoryCriptoInsuficiente = new FactoryCriptomoeda(0.01);
        String resultadoCriptoInsuficiente = servicoDePagamento.processarPagamento(factoryCriptoInsuficiente, valorEmCripto);
        System.out.println(resultadoCriptoInsuficiente);
        System.out.println();

        System.out.println("Apple Pay");
        PagamentoFactory factoryApplePay = new FactoryApplePay(true);
        String resultadoApplePay = servicoDePagamento.processarPagamento(factoryApplePay, valorDaCompra);
        System.out.println(resultadoApplePay);
        System.out.println();

        System.out.println("Apple Pay (Não Autorizado)");
        PagamentoFactory factoryApplePayNaoAutorizado = new FactoryApplePay(false);
        String resultadoApplePayNaoAutorizado = servicoDePagamento.processarPagamento(factoryApplePayNaoAutorizado, valorDaCompra);
        System.out.println(resultadoApplePayNaoAutorizado);
        System.out.println();
        
        System.out.println("========================================");
        System.out.println("Simulação de pagamentos finalizada.");
    }
}