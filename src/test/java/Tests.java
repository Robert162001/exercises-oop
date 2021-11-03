import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import po.StringExercises;

public class Tests {
    private StringExercises stringExercises;

    @BeforeMethod
    public void init() {
        stringExercises = new StringExercises();
    }

    // Problem 1 Tests
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

    // Problem 2 Tests
    @Test
    public void nrOfConsonants() {
        int actual = stringExercises.countConsonants("home");
        int expected = 2;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void justConsonants() {
        int actual = stringExercises.countConsonants("zxcvb");
        int expected = 5;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void justVowels() {
        int actual = stringExercises.countConsonants("aeiouy");
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void emptyWord() {
        int actual = stringExercises.countConsonants("");
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void uppercaseWord() {
        int actual = stringExercises.countConsonants("RobERt");
        int expected = 4;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void specialCharacters() {
        int actual = stringExercises.countConsonants("Bo$$");
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void stringWithSpaces() {
        int actual = stringExercises.countConsonants("r r");
        int expected = 2;
        Assert.assertEquals(expected, actual);
    }

    // Problem 3 Tests
    @Test
    public void reverseWordTest() {
        String actual = stringExercises.reverseWord("home");
        String expected = "emoh";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addDashTest() {
        String actual = stringExercises.addDash("water");
        String expected = "w-a-t-e-r";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getVowelsTest() {
        String actual = stringExercises.getVowels("window");
        String expected = "io";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseVowelsTest() {
        String actual = stringExercises.reverseVowels("MIlk", "sUgar");
        String expected = "a-u-i";
        Assert.assertEquals(expected, actual);
    }
}
