package avaliacaojavas2it;

import java.util.Scanner;

/**
 *
 * @author Luan
 */
public class AvaliacaoJavaS2it {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CriadorDeNumeros criadorDeNumeros = new CriadorDeNumeros();
        
        System.out.println("Para A = 10256 e B = 512");        
        System.out.println("O valor intercalado de C é 15012256, porém ele é maior que 1000000, então deve ser -1.");
        System.out.println("Resultado: C = " + criadorDeNumeros.criarC("10256", "512"));
        
        System.out.println("Teste com outros números:");  
        String a = scan.nextLine();
        String b = scan.nextLine();
        int c = criadorDeNumeros.criarC(a, b);
        
        System.out.println("O valor de C é: " + c);
        
    }
    
}
