package contas;

public class PessoaFisica {

    public static void main(String[] args) {
        Conta cc1 = new Conta();
        cc1.setCleinte("Davi Paulino");
        cc1.setSaldo(10000);
        System.out.println("Clente:" + cc1.getCliente());
        cc1.exibirSaldo();
        cc1.sacar(1000);
        cc1.exibirSaldo();
        System.out.println("---------------------------");
        Conta cc2 = new Conta();
        cc2.setCleinte("Junim");
        cc2.setSaldo(8500);
        System.out.println("Clente:" + cc2.getCliente());
        cc2.exibirSaldo();
        cc2.depositar(5000);
        cc2.exibirSaldo();
        System.out.println("---------------------------");
        System.out.println("Transferencia");
        System.out.println("Cliente:" + cc1.getCliente());
        System.out.println("Favorecido:" + cc2.getCliente());
        cc1.trasferir(cc2, 2000);
        System.out.println("");
        System.out.println("Clente:" + cc1.getCliente());
        cc1.exibirSaldo();
        System.out.println("Clente:" + cc2.getCliente());
        cc2.exibirSaldo();
        System.out.println("---------------------------");
        System.out.println("Relatorio gerencial");
        Conta gerente = new Conta();
        double relatorio = gerente.soma(cc1.getSaldo(), cc2.getSaldo());
        System.out.println("Saldo total nas contas: R$" + relatorio);
    }

}
