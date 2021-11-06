package po;

public class StringUtils {

    public static String getVowels(String word) {
        return word.replaceAll("([^aeiouyAEIOUY0-9\\W]+)", "");
    }

    public static String addDash(String word) {
        return word.replaceAll(".(?=.)", "$0-");
    }

    public static String reverseWord(String word) {
        String[] words = word.split("\\s");
        String reverseWord = "";
        for (String w : words) {
            StringBuilder stringBuilder = new StringBuilder(w);
            stringBuilder.reverse();
            reverseWord += stringBuilder.toString() + "";
        }
        return reverseWord.trim();
    }

    public static String getConsonants(String word) {
        return word.replaceAll("[aeiouy]", "");
    }

    public static String removeSpecialCharacters(String word) {
        return word.replaceAll("[\\s~!@#$%^&*()_+{}\\[\\]:;,.<>/?-]", "");
    }

}
