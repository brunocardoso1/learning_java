public class TesteReferencias {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta();

        primeiraConta.saldo = 300;

        Conta copiaConta = primeiraConta;


        copiaConta.saldo += 100;
        System.out.println("Saldo da primeira conta: " + copiaConta.saldo);
        System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);

    }
}
