package avaliacaojavas2it;

/**
 *
 * @author Luan
 */
public class NumberGenerator {

    public int generate(String a, String b) {

        StringBuilder value = new StringBuilder();

        int maxLength = Math.max(a.length(), b.length());
        for (int i = 0; i < maxLength; i++) {
            if (i < a.length()) {
                value.append(a.charAt(i));
            }

            if (i < b.length()) {
                value.append(b.charAt(i));
            }
        }

        return parse(value.toString());
    }

    public int parse(String value) {
        Integer c = 0;

        try {
            c = Integer.parseInt(value);
        } catch (NumberFormatException e) {
            System.err.println("Erro de conversão do número: " + value);
        }

        if (c > 1000000) {
            return -1;
        }

        return c;
    }
}
