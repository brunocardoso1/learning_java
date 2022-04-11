public class Conta
{
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente();

    void deposita(double valor ){
        this.saldo += valor;
    }

    public boolean saca(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            System.out.println("Saque efetuado com sucesso, novo saldo: " + this.saldo);
            return true;
        } else {
            System.out.println("Saldo insuficiente, saldo atual: " + this.saldo + " valor de saque desejado: " + valor);
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino){
        if(this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);
            System.out.println("Transferencia de " +valor+ " para " + destino.titular.getNome() + " concluida!");
            return true;
        } else {
            System.out.println("Seu saldo atual é menor que valor desejado da transferencia.");
            return false;
        }
    }

    public void getSaldo(){
        System.out.println("Seu saldo atual eh de: " + this.saldo);
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }
}
