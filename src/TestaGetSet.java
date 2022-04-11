public class TestaGetSet {

    public static void main(String[] args) {
        Conta contaBruno = new Conta();

        contaBruno.setNumero(100);

        Cliente bruno = new Cliente();

        contaBruno.setTitular(bruno);


    }

}
