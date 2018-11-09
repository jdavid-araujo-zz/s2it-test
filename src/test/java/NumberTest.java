import org.junit.Assert;
import org.junit.Test;

import question8.NumberManupulation;

public class NumberTest {

    @Test
    public void resultMustBeEqualsMinusOne() {

        Integer a = 10256;
        Integer b = 512;
        Integer c = -1;

        NumberManupulation number = new NumberManupulation();

        Assert.assertEquals(c, number.builder(a, b));
    }


    @Test
    public void resultMustBeEquals() {

        Integer a = 102;
        Integer b = 512;
        Integer result = 150122;

        NumberManupulation number = new NumberManupulation();

        Assert.assertEquals(result, number.builder(a, b));
    }
    
    @Test
    public void resultMustGetBiggerVector() {

        Integer a = 10;
        Integer b = 521;
        Integer result = 15021;

        NumberManupulation number = new NumberManupulation();

        Assert.assertEquals(result, number.builder(a, b));
    }
}
