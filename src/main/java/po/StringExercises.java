package po;

public class StringExercises extends StringUtils {

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

    // Problem 2
    public int countConsonants(String numberOfConsonants) {
        numberOfConsonants = numberOfConsonants.toLowerCase();
        String wordWithoutSpecialChar = removeSpecialCharacters(numberOfConsonants);
        String onlyConsonants = getConsonants(wordWithoutSpecialChar);
        return onlyConsonants.length();
    }

    // Problem 3
    public String reverseVowels(String word1, String word2) {
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        String reverseWord1 = reverseWord(word1);
        String reverseWord2 = reverseWord(word2);
        String getVowelsWord1 = getVowels(reverseWord1);
        String getVowelsWord2 = getVowels(reverseWord2);
        String addDashWord1 = addDash(getVowelsWord1);
        String addDashWord2 = addDash(getVowelsWord2);
        return addDashWord2 + "-" + addDashWord1;
    }

}