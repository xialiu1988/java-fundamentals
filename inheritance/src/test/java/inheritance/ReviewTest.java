package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {

    @Test
    public void TestReivewtoString() {
        Review r = new Review("I don't like this restaurant","Cindy",1);
       String expected ="Rating: 1 star. By Cindy. I don't like this restaurant ";
         assertEquals("the expected string should be the same as toString method from Review",expected,r.toString());
    }
}