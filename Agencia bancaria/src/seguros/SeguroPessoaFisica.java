package seguros;

import contas.Conta;

public class SeguroPessoaFisica extends Conta {

    public static void main(String[] args) {
        SeguroPessoaFisica cc3 = new SeguroPessoaFisica();
        cc3.setCleinte("Carlos");
        cc3.setSaldo(9000);
        System.out.println("Clente:" + cc3.getCliente());
        cc3.exibirSaldo();
    }

    

}
