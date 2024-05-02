import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Cliente>listaClientes = new ArrayList<>();
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Juliana Oliveira Ramos");
        cliente1.setCpf("123.445.555.90");
        listaClientes.add(cliente1);
        Conta corrente = new ContaCorrente(cliente1);
        Conta poupanca = new ContaPoupanca(cliente1);

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Testes da silva");
        cliente2.setCpf("132.444.555.00");
        listaClientes.add(cliente2);

       corrente.depositar(1000);
       corrente.transferir(poupanca,100);

       //poupanca.imprimirExtratoContaPoupanca();


        Banco banco= new Banco(listaClientes);
        banco.exibirListaClientes();


    }
}