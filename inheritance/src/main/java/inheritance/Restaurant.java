package inheritance;

import java.util.List;

public class Restaurant {
    private String name;
    private int stars;
    private String priceCategory;
    //get bunch of reviews for the restaurant
    public List<Review> reviews;

//setters
    public void setName(String name) {
        this.name = name;
    }


    public void setPriceCategory(String priceCategory) {
        this.priceCategory = priceCategory;
    }

//getters
    public String getName(){
        return this.name;
    }
    public  int getStars(){
        return this.stars;
    }
    public String getPriceCategory(){
        return this.priceCategory;
    }

    //restaurant constructor
    public Restaurant(String name, String priceCategory){
        this.name = name;
        this.stars = 0;
        this.priceCategory = priceCategory;
    }

  //toString methods
    public String toString(){
        return String.format("%s Restaurant has %d stars and the price Category will be %s",this.getName(),this.getStars(),this.getPriceCategory());
    }

    //addReview

    public void addReview(Review review){
        reviews.add(review);
        updateStars();
    }

   //when add a review to the res
    public void updateStars(){
        int sumStar = 0;
    for(Review r : reviews){
        sumStar+=r.stars;
    }
       this.stars = sumStar/reviews.size();
    }

}
