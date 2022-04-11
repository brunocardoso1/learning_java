public class TestaMetodo {

    public static void main(String[] args) {
        Conta contaBruno = new Conta();
        Conta contaPenha = new Conta();

        contaBruno.deposita(100);
        contaPenha.deposita(100);

        contaBruno.transfere(10, contaPenha);
        contaBruno.getSaldo();
        contaPenha.getSaldo();

    }
}
