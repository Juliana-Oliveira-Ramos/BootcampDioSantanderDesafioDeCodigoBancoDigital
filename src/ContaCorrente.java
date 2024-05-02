public class ContaCorrente  extends Conta {

    public ContaCorrente(Cliente cliente){
        super(cliente);
    }
        public void imprimirExtratoContaCorrente(){
            System.out.println("****Extrato Conta Corrente ****");
            super.imprimirExtratoContaCorrente();
        }
}
