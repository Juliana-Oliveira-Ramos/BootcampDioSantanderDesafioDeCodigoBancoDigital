public class Conta implements IConta{

    private static final int AGENCIA_PADRAO = 1;
    private static final int SEQUENCIAL = 1;

    private  int  agencia;
    private int   numero;
    private double saldo;
    protected Cliente cliente;


    public void sacar(double valor){
            saldo -= valor;
    }
    public void depositar(double valor){
        saldo +=  valor;
    }
    public void transferir(IConta contaDestino, double valor){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public  Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL;
        this.cliente = cliente;
    }
    public void imprimirExtratoContaCorrente(){
        //System.out.println("Extrato Conta Corrente");
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("CPF: %s", this.cliente.getCpf()));
        System.out.println(String.format("Agencia: %d", this.getAgencia()));
        System.out.println(String.format("Numero: %d", this.getNumero()));
        System.out.println(String.format("Saldo: %.2f", this.getSaldo()));
    }

    public void imprimirExtratoContaPoupanca(){
        //System.out.println("Extrato Conta Poupanca");
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("CPF: %s", this.cliente.getCpf()));
        System.out.println(String.format("Agencia: %d", this.getAgencia()));
        System.out.println(String.format("Numero: %d", this.getNumero()));
        System.out.println(String.format("Saldo: %.2f", this.getSaldo()));
    }

}
