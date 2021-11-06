package po;

import static po.MyStringUtils.*;

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

    // Problem 2
    public int countConsonants(String numberOfConsonants) {
        numberOfConsonants = numberOfConsonants.toLowerCase();
        String wordWithoutSpecialChar = removeSpecialCharacters(numberOfConsonants);
        String onlyConsonants = getConsonants(wordWithoutSpecialChar);
        return onlyConsonants.length();
    }

    // Problem 3
    public String reverseVowels(String word1, String word2) {
        String word = word1 + word2;
        word = word.toLowerCase();
        String reverseWord = reverseWord(word);
        String wordWithoutSpecialCh = removeSpecialCharacters(reverseWord);
        String getVowelsWord = getVowels(wordWithoutSpecialCh);
        return addDash(getVowelsWord);
    }

    /**
     * Concatenates two words and returns their vowels in reversed order with a special character between them.
     *
     * @param firstWord  - mandatory
     * @param secondWord - mandatory
     * @return - vowels in reverse order with a special character between them
     */
    public String reverseVowelsAlternativeSolution(String firstWord, String secondWord, String specialCharacter) {
        return addSpecialCharBetweenLetters(getVowels(reverseWord(removeSpecialCharacters(firstWord.toLowerCase()
                + secondWord.toLowerCase()))), specialCharacter);
    }

    /**
     * Concatenates two words and returns their vowels in reversed order with a special character between them.
     *
     * @param specialCharacter - mandatory
     * @param words            - a number of strings
     * @return - vowels in reverse order with a special character between them
     */

    public String reverseVowelsAlternativeSolution(String specialCharacter, String... words) {
        StringBuilder processedString = new StringBuilder();

        for (String value : words) {
            processedString.append(value.toLowerCase());
        }

        return addSpecialCharBetweenLetters(getVowels(reverseWord(removeSpecialCharactersAndDigits(
                processedString.toString()))), specialCharacter);
    }
}