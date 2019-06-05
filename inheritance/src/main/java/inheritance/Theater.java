package inheritance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Theater implements ReviewInterface{
    private String name;
    private List<String> movies;
    //reviews for theater
    private  List<Review> theaterReviews;
    //one movie can have many reviews from different authors
    private HashMap<String,List<Review>> movieReviews;

    //getters
    public String getName() {
        return this.name;
    }

    public List<String> getMovies() {
        return this.movies;
    }

    public HashMap<String,List<Review>> getMovieReviews()
    {
        return this.movieReviews;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setMovies(List<String> movies) {
        this.movies = movies;
    }

    //constructor
    public Theater(String name,List<String> movies){
        this.name = name;
        this.movies = movies;
        this.theaterReviews=new ArrayList<>();
        this.movieReviews=new HashMap<>();
    }

    //add a movie
    public void addMovie(String name){
        movies.add(name);
        movieReviews.put(name,new ArrayList<>());
    }
    //remove a movie
    public void removeMovie(String name){
        if(!movies.contains(name)){
            throw new IllegalArgumentException("Movie not found!");
        }
        movies.remove(name);
        movieReviews.remove(name);
    }

    public String toString(){
        return String.format("The %s theatre is has %d good movies.",this.name,this.movies.size());
    }

    @Override
    //get all the reviews about the theaters
    public List<Review> getReviews() {
        return this.theaterReviews;
    }


    public List<Review> getOneMovieReview(String movieName){
         List<Review> rList = movieReviews.get(movieName);
         return rList;
    }

    @Override
    public void addReview(Review review) {
            theaterReviews.add(review);
            for (String m : movies) {
                if (review.body.contains(m)) {
                    List<Review> oneMovieReviews = this.movieReviews.get(m);
                    oneMovieReviews.add(review);
                    this.movieReviews.put(m, oneMovieReviews);
                }
            }

    }
}
