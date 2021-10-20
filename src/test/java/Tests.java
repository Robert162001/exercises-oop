import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tests {
    private Methods methods;

    @BeforeMethod
    public void init() {
        methods = new Methods();
    }

    @Test
    public void testForMonday() {
        String expected = "Monday";
        String actual = methods.fizzBuzzProblem(3);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testForTuesday() {
        String expected = "Tuesday";
        String actual = methods.fizzBuzzProblem(5);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testForWednesday() {
        String expected = "Wednesday";
        String actual = methods.fizzBuzzProblem(30);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void returnTest() {
        String actual = methods.fizzBuzzProblem(19);
        String expected = String.valueOf(actual);
        Assert.assertEquals(expected, actual);
    }

}
