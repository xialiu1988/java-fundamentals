package inheritance;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

public class TheaterTest {

    @Test
    public void CangetName() {
        List<String> list = new ArrayList<>();
        list.add("Puppy love");
        list.add("Let's test this");
        Theater t = new Theater("Test theater",list);
        assertTrue("can get the name of the theater", t.getName()=="Test theater");
    }

    @Test
    public void CangetMovies() {
        List<String> list = new ArrayList<>();
        list.add("Puppy love");
        list.add("Let's test this");
        Theater t = new Theater("Test theater",list);
        assertTrue("can get the name of the theater", t.getMovies()==list);
    }

    @Test
    public void CangetMovieReviews() {
        List<String> list = new ArrayList<>();
        list.add("Puppy love");
        list.add("Let's test this");
        Theater test = new Theater("Test theater",list);
        HashMap<String,List<Review>> hp = test.getMovieReviews();
        //hp will have the keys:"puppy love, let's test this"
        for( String key : hp.keySet() ){
            assertTrue("should have the keys:Puppy love and let's test this",list.contains(key));
        }
    }

    @Test
    public void CansetName() {
        List<String> list = new ArrayList<>();
        list.add("Puppy love");
        list.add("Let's test this");
        Theater t = new Theater("Test theater",list);
        t.setName("Lazers");
        assertTrue("can get the name of the theater", t.getName()=="Lazers");
    }

    @Test
    public void CansetMovies() {
        List<String> list = new ArrayList<>();
        list.add("Puppy love");
        list.add("Let's test this");
        Theater t = new Theater("Test theater",list);
        assertTrue("can get the number of the movies in theater", t.getMovies().size()==2);
        list.add("one more thing");
        t.setMovies(list);
        assertTrue("can get the number of the movies in theater", t.getMovies().size()==3);
    }
  //test add movie to the theater
    @Test
    public void CanaddMovie() {
        List<String> list = new ArrayList<>();
        list.add("Puppy love");
        list.add("Let's test this");
        Theater t = new Theater("Test theater",list);
        assertTrue("shoud have 2 movies now",t.getMovies().size()==2);
        t.addMovie("I am adding this movie");
        assertTrue("shoud have 3 movies now",t.getMovies().size()==3);

        for(String n : list){
         assertTrue("theater's movie list should have all the movies",t.getMovies().contains(n));
        }
    }
   //test remove movie from the theatre
    @Test
    public void CanremoveMovie() {
        List<String> list = new ArrayList<>();
        list.add("Puppy love");
        list.add("Let's test this");
        Theater t = new Theater("Test theater",list);
        assertTrue("shoud have 2 movies now",t.getMovies().size()==2);
        t.removeMovie("Puppy love");
        assertTrue("shoud have 1 movie now",t.getMovies().size()==1);
        assertFalse("should not contains puppy love any more",t.getMovies().contains("Puppy love"));
    }

    @Test
    public void CantoString() {
        List<String> list = new ArrayList<>();
        list.add("Puppy love");
        list.add("Let's test this");
        Theater t = new Theater("Test buddy",list);
        String expected = "The Test buddy theatre is has 2 good movies.";
        assertEquals("should match the expected string",expected,t.toString());
    }


    @Test
    public void CangetReviews() {
        List<String> list = new ArrayList<>();
        list.add("Puppy love");
        list.add("Let's test this");
        Theater t = new Theater("Test buddy",list);
        assertEquals("new theater does'nt have any reviews yet",0,t.getReviews().size());

    }
    //add reviews
    @Test
    public void CanaddReview() {
        List<String> list = new ArrayList<>();
        list.add("Puppy love");
        list.add("Let's test this");
        Theater t = new Theater("Test buddy",list);
        assertEquals("new theater does'nt have any reviews yet",0,t.getReviews().size());
        Review r = new Review("This theater has a good popcorn!","Mei mei",2);
        t.addReview(r);
        assertEquals("new theater should have one review now",1,t.getReviews().size());
        Review r2 = new Review("I don't like this theater, so crowd","Mei mei",1);
        t.addReview(r2);
        assertEquals("new theater should have two reviews now",2,t.getReviews().size());
    }
    //for adding movie reviews for one specific movie
    @Test
    public void CangetOneMovieReview() {
        List<String> list = new ArrayList<>();
        list.add("Puppy love");
        list.add("Let's test this");
        Theater t = new Theater("Test buddy",list);
        assertEquals("The Puppy love has 0 review now",0,t.getMovieReviews().get("Puppy love").size());
        Review r = new Review("The Puppy love movie is awesome, make me cry!","Alicec",4);
        t.addReview(r);
        assertEquals("The Puppy love has 1 review now",1,t.getMovieReviews().get("Puppy love").size());
    }


}