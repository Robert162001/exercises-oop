package po;

public class StringUtils {

    public String getVowels(String word) {
        return word.replaceAll("([^aeiouyAEIOUY0-9\\W]+)", "");
    }

    public String addDash(String word) {
        return word.replaceAll(".(?=.)", "$0-");
    }

    public String reverseWord(String word) {
        String[] words = word.split("\\s");
        String reverseWord = "";
        for (String w : words) {
            StringBuilder stringBuilder = new StringBuilder(w);
            stringBuilder.reverse();
            reverseWord += stringBuilder.toString() + "";
        }
        return reverseWord.trim();
    }

    public String getConsonants(String word) {
        return word.replaceAll("[aeiouy]", "");
    }

    public String removeSpecialCharacters(String word) {
        return word.replaceAll("[\\s~!@#$%^&*()_+{}\\[\\]:;,.<>/?-]", "");
    }

}
