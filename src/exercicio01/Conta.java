package exercicio01;

public class Conta {
    //Atributos ou propriedades ou variáveis de instância
    String correntista;
    int numero;
    double saldo;

    // método para depositar um valor na conta
    public void depositar(double valor) {
        saldo += valor;

    }
    //metodo vai ficar dentro do objeto e por isso não utilizamos static



    //método para sacar um valor da conta
    public void sacar(double valor){
        saldo -= valor;
    }

}
