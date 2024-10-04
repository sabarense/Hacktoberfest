import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("VERIFICAÇÃO DE MAIORIDADE");
        System.out.println("Digite sua idade:");
        int idade = sc.nextInt();
        sc.close();
        if(idade >= 18){
            System.out.println("Maior de idade!");
        }else{
            System.out.println("Menor de idade!");
        }
    }
}
