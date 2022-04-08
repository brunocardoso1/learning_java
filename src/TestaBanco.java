public class TestaBanco {

    public static void main(String[] args) {
        Cliente paulo = new Cliente();
        paulo.nome = "Paulo Silveira";
        paulo.cpf = "131.131.231-43";
        paulo.profissao = "Programador";

        Conta contaPaulo = new Conta();
        contaPaulo.deposita(100);

        contaPaulo.titular = paulo;

        System.out.println(contaPaulo.titular.nome);

    }
}
