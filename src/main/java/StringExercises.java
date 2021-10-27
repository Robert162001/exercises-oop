public class StringExercises {

    // Problem 1
    public String fizzBuzzProblem(int parameter) {
        String returnValue = null;
        if (parameter % 3 == 0 && parameter % 5 == 0) {
            returnValue = "Wednesday";
        } else if (parameter % 3 == 0) {
            returnValue = "Monday";
        } else if (parameter % 5 == 0) {
            returnValue = "Tuesday";
        }
        return String.valueOf(returnValue);
    }

    // Problem 2 - solution 1
    public String getConsonants(String word) {
        return word.replaceAll("[aeiouy]", "");
    }

    public String removeSpecialCharacters(String word) {
        return word.replaceAll("[\\s~!@#$%^&*()_+{}\\[\\]:;,.<>/?-]", "");
    }

    public int countConsonants(String numberOfConsonants) {
        numberOfConsonants = numberOfConsonants.toLowerCase();
        String wordWithoutSpecialChar = removeSpecialCharacters(numberOfConsonants);
        String onlyConsonants = getConsonants(wordWithoutSpecialChar);
        return onlyConsonants.length();
    }

    // Problem 2 - solution 2
    public int consonantsProblem(String word) {
        int consonants = 0;
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            char character = word.charAt(i);
            if (word.contains(" ")) {
                i++;
            }
            if (!(character >= 'a' && character <= 'z')) {
                i++;
            } else if (character != 'a' && character != 'e' && character != 'i' && character != 'o' && character != 'u') {
                consonants++;
            }
        }
        return consonants;
    }

    // Problem 3
    public String getVowels(String word) {
        return word.replaceAll("([^aeiouyAEIOUY0-9\\W]+)", "");
    }

    public String addDash(String word) {
        return word.replaceAll(".(?=.)", "$0-");
    }

    public String reverseWord(String word) {
        String newWord = "";
        char ch;
        for (int i = 0; i < word.length(); i++) {
            ch = word.charAt(i);
            newWord = ch + newWord;
        }
        return newWord;
    }

    public String reverseVowels(String word1, String word2) {
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        String reverseWord1 = reverseWord(word1);
        String reverseWord2 = reverseWord(word2);
        String getVowelsWord1 = getVowels(reverseWord1);
        String getVowelsWord2 = getVowels(reverseWord2);
        String addDashWord1 = addDash(getVowelsWord1);
        String addDashWord2 = addDash(getVowelsWord2);
        String finalWord = addDashWord2 + "-" + addDashWord1;
        return finalWord;
    }

}