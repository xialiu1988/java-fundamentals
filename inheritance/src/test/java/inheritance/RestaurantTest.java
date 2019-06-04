package inheritance;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class RestaurantTest {

    @Test
    public void setName() {
    Restaurant r1 = new Restaurant("Fei fei palace","$");
    r1.setName("Hao Yun Lai");
    assertTrue("The name of the restaurant should be Hao Yun Lai now",r1.getName()=="Hao Yun Lai");
    }


    @Test
    public void setPriceCategory() {
        Restaurant r1 = new Restaurant("Fei fei palace","$");
        r1.setPriceCategory("$$");
        assertTrue("The priceCategory of the restaurant should be $$ now",r1.getPriceCategory()== "$$");
    }


    @Test
    public void getName() {
        Restaurant r1 = new Restaurant("Mini Panda world", "$$");
        assertTrue("can get the name of the restaurant",r1.getName()== "Mini Panda world");
    }

    @Test
    public void getStars() {

        Restaurant r1 = new Restaurant("Mini Panda world", "$$");
        List<Review> list= new ArrayList<>();
        r1.reviews = list;
        Review r = new Review("This is a good one", "Mandy",3);
        r1.addReview(r);
        assertEquals("can get the stars of the restaurant",3,r1.getStars());
    }

    @Test
    public void getPriceCategory() {
        List<Review> reviews= new ArrayList<>();
        Restaurant r1 = new Restaurant("Mini Panda world", "$$");
        assertTrue("can get the priceCatefory of the restaurant",r1.getPriceCategory()== "$$");
    }



    @Test
    public void cantestMethodtoString() {
        Restaurant r1 = new Restaurant("Lucky place","$");
       String expected ="Lucky place Restaurant has 0 stars and the price Category will be $";
          assertEquals("should return same as expected string",expected,  r1.toString());
    }

//test add review to the restaurant
    @Test
    public void CanaddReview() {
        Review newReview = new Review("This is a good one", "Jimmy",5);
        List<Review> list = new ArrayList<>();
        Restaurant r1 = new Restaurant("Lucky place","$");
        r1.reviews = list;
        //should have 0 review now
        assertTrue("should have 0 review now",r1.reviews.size()==0);
        r1.addReview(newReview);
        //should have 1 reivew now
        assertTrue("should have 1 review now",r1.reviews.size()==1);
        //should update the stars of rating to 4
        assertEquals("should update the star rating from 0 to 5",5,r1.getStars());

    }
 //test updateStars method
    @Test
    public void CanupdateStars() {
        Restaurant r1 = new Restaurant("Lucky place","$");
        assertTrue("should be 0 starts now", r1.getStars()==0);
        List<Review> list = new ArrayList<>();
        r1.reviews = list;
        Review newReview = new Review("This is a good one", "Jimmy",5);
        list.add(newReview);
        r1.updateStars();
        assertTrue("now should update the star to 5",r1.getStars()==5);
    }
}