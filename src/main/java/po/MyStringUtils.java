package po;

public class MyStringUtils {

    public static String getVowels(String word) {
        return word.replaceAll("([^aeiouyAEIOUY0-9\\W]+)", "");
    }

    // Problem with this one it's that it's just adding dashes. What if I want to add other characters?
    public static String addDash(String word) {
        return word.replaceAll(".(?=.)", "$0-");
    }

    public static String addSpecialCharBetweenLetters(String word, String specialCharacter) {
        return word.replaceAll(".(?=.)", "$0" + specialCharacter);
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

    public static String removeSpecialCharactersAndDigits(String word) {
        return word.replaceAll("[\\d\\s~!@#$%^&*()_+{}\\[\\]:;,.<>/?-]", "");
    }

}
