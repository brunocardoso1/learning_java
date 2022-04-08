public class TestaMetodo {

    public static void main(String[] args) {
        Conta contaBruno = new Conta();
        Conta contaPenha = new Conta();

        contaBruno.deposita(100);
        contaPenha.deposita(100);
        contaBruno.titular.nome = "Bruno Cardoso";
        contaPenha.titular.nome = "Maria da Penha";

        contaBruno.transfere(10, contaPenha);
        contaBruno.consultaSaldo();
        contaPenha.consultaSaldo();

    }
}
