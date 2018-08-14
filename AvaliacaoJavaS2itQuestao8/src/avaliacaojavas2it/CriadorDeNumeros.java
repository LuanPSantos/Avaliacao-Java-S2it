package avaliacaojavas2it;

/**
 *
 * @author Luan
 */
public class CriadorDeNumeros {

    public int criarC(String a, String b) {

        char[] character = new char[a.length() + b.length()];
        int aIndex = 0;
        int bIndex = 0;

        for (int i = 0; i < character.length; i++) {
            if(a.length() == aIndex){
                for(int j = i; j < character.length; j++){
                    character[j] = b.charAt(bIndex);
                    bIndex++;
                }
                
                break;
            }
            
            if(b.length() == bIndex){
                for(int j = i; j < character.length; j++){
                    character[j] = a.charAt(aIndex);
                    aIndex++;
                }
                
                break;
            }
            
            
            if (i % 2 == 0) {
                character[i] = a.charAt(aIndex);
                aIndex++;
            } else {
                character[i] = b.charAt(bIndex);
                bIndex++;
            }
        }

        int valor = Integer.parseInt(String.valueOf(character));

        if (valor > 1000000) {
            return -1;
        }

        return valor;
    }
}
