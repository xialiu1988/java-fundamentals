package inheritance;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ShopTest {

    @Test
    public void CansetName() {
        Shop s = new Shop("No.1 test","This shop is for test","$$$");
        s.setName("Test Shop");
        assertTrue("Now the shop's name should be Test shop",s.getName()=="Test Shop");
    }

    @Test
    public void CansetDescription() {
        Shop s = new Shop("No.1 test","This shop is for test","$$$");
        s.setDescription("Best Test Shop ever!");
        assertTrue("Now the shop's description should be Best Test Shop ever!",s.getDescription()=="Best Test Shop ever!");
    }

    @Test
    public void CansetPriceCategory() {
        Shop s = new Shop("No.1 test","This shop is for test","$$$");
        s.setPriceCategory("$$");
        assertTrue("Now the shop's priceCategory should be $$",s.getPriceCategory()=="$$");
    }

    @Test
    public void CangetName() {
        Shop s = new Shop("No.1 test","This shop is for test","$$$");
        assertTrue("Now the shop's name should be No.1 test",s.getName()=="No.1 test");
    }

    @Test
    public void CangetDescription() {
        Shop s = new Shop("No.1 test","This shop is for test","$$$");
        assertTrue("Now the shop's description should be This shop is for test",s.getDescription()=="This shop is for test");
    }

    @Test
    public void CangetPriceCategory() {
        Shop s = new Shop("No.1 test","This shop is for test","$$$");
        assertTrue("Now the shop's PriceCategory should be $$$",s.getPriceCategory()=="$$$");
    }

    @Test
    public void CangetReviews() {
        Shop s = new Shop("No.1 test","This shop is for test","$$$");
        List<Review> list = s.getReviews();
        assertTrue("no reviews",list.size()==0);
    }

    @Test
    public void CanaddReview() {
        Shop s = new Shop("No.1 test","This shop is for test","$$$");
        Review r = new Review("good shop","mini",3);
        s.addReview(r);
        assertTrue("has one review now",s.getReviews().size()==1);
    }

    @Test
    public void CantoString() {
        Shop shp = new Shop("No.1 test","This shop is for test","$$$");
       String s = "No.1 test is a shop which is This shop is for test. Average cost: $$$";
       assertEquals("s should be the same as s.toString() method",s,shp.toString());
    }
}