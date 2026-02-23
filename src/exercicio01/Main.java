package exercicio01;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Conta conta =  new Conta();     //objeto

        Scanner sc = new Scanner(System.in);     //objeto

        Random rd = new Random();   //objeto

        System.out.println("Nome do correntista: ");
        conta.correntista = sc.next();
        conta.numero = rd.nextInt(1000, 9999);

        System.out.println(conta.saldo);
        conta.depositar(8500);
        System.out.println(conta.saldo);
        conta.sacar(6000);
        System.out.println(conta.saldo);

    }
}
