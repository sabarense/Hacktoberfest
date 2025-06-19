import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("VERIFICA SE A PALAVRA É PALÍNDROMO");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        //evitar problema caso a palavra esteja com maiúsculo e minúsculo
        String palavra = sc.next().toLowerCase();
        if(ehPalindromo(palavra)){
            System.out.println("A palavra é um palíndromo");
        }else{
            System.out.println("A palavra não é um palíndromo");
        }
        sc.close();
    }

    static boolean ehPalindromo(String palavra){
        int j = palavra.length() - 1;
        boolean result = true;
        for (int i = 0; i < palavra.length()/2; i++, j--){
            if(palavra.charAt(i) != palavra.charAt(j)){
                result = false;
            }
        }
        return result;
    }
}
