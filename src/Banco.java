import java.util.ArrayList;
import java.util.List;

public class Banco {
    @Override
    public String toString() {
        return "Banco{" +
                "clienteContas=" + clienteContas +
                '}';
    }

    private List<Cliente>clienteContas;

    public Banco(List<Cliente> clienteContas) {
        this.clienteContas = clienteContas;
        //this.clienteContas = new ArrayList<>()
    }

    public void adicionarClientes(String nome,String cpf){
        clienteContas.add(new Cliente());

    }

    public void exibirListaClientes(){
        System.out.println("Lista de Clientes:");
            for (Cliente cliente : clienteContas){
                System.out.println(clienteContas);


            }


    }

}
