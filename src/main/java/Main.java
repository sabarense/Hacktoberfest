import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("VERIFICAÇÃO DE PARIDADE DO NÚMERO");
        System.out.println("Digite o número:");
        int idade = sc.nextInt();
        sc.close();
        if(idade % 2 == 0){
            System.out.println("Par!");
        }else{
            System.out.println("Ímpar!");
        }
    }
}
