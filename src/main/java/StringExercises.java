public class StringExercises {

    //Problem 1
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

}