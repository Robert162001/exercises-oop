import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tests {
    private StringExercises stringExercises;

    @BeforeMethod
    public void init() {
        stringExercises = new StringExercises();
    }

    //Problem 1 Tests
    @Test
    public void testForMonday() {
        String expected = "Monday";
        String actual = stringExercises.fizzBuzzProblem(3);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testForTuesday() {
        String expected = "Tuesday";
        String actual = stringExercises.fizzBuzzProblem(5);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testForWednesday() {
        String expected = "Wednesday";
        String actual = stringExercises.fizzBuzzProblem(30);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void returnTest() {
        String actual = stringExercises.fizzBuzzProblem(19);
        String expected = String.valueOf(actual);
        Assert.assertEquals(expected, actual);
    }

    //Problem 2 Tests
    @Test
    public void nrOfConsonants() {
        int actual = stringExercises.consonantsProblem("home");
        int expected = 2;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void justConsonants() {
        int actual = stringExercises.consonantsProblem("zxcvb");
        int expected = 5;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void justVowels() {
        int actual = stringExercises.consonantsProblem("aeiou");
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void emptyWord() {
        int actual = stringExercises.consonantsProblem("");
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void uppercaseWord() {
        int actual = stringExercises.consonantsProblem("RobERt");
        int expected = 4;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void specialCharacters() {
        int actual = stringExercises.consonantsProblem("Bo$$");
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void stringWithSpaces() {
        int actual = stringExercises.consonantsProblem("r r");
        int expected = 2;
        Assert.assertEquals(expected, actual);
    }

}
