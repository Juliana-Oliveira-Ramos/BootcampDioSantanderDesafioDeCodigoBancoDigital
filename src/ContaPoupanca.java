public class ContaPoupanca extends Conta {



    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtratoContaPoupanca(){
        System.out.println("*** Extrato Conta Poupanca ***");
        super.imprimirExtratoContaPoupanca();
    }
}
