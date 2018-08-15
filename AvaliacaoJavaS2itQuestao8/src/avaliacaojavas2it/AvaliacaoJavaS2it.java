package avaliacaojavas2it;

import java.util.Scanner;

/**
 *
 * @author Luan
 */
public class AvaliacaoJavaS2it {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        NumberGenerator numberGenerator = new NumberGenerator();
        
        System.out.println("Para A = 10256 e B = 512");        
        System.out.println("O valor intercalado de C é 15012256, porém ele é maior que 1000000, então deve ser -1.");
        System.out.println("Resultado: C = " + numberGenerator.generate("10256", "512"));
        System.out.println("-----------");
        System.out.println("Para A = 587 e B = 368");        
        System.out.println("O valor de C deve ser 538678");
        System.out.println("Resultado: C = " + numberGenerator.generate("587", "368"));
        System.out.println("-----------");
        System.out.println("Para A = 85 e B = 7801");        
        System.out.println("O valor de C deve ser 875801");
        System.out.println("Resultado: C = " + numberGenerator.generate("85", "7801"));
        System.out.println("-----------");
        System.out.println("Teste com outros números:");  
        String a = scan.nextLine();
        String b = scan.nextLine();
        int c = numberGenerator.generate(a, b);
        
        System.out.println("O valor de C é: " + c);
        
    }
    
}
