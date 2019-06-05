package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Shop implements ReviewInterface{
    private String name;
    private String description;
    private String priceCategory;
    //reviews for shop
    private List<Review> list;

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPriceCategory(String priceCategory) {
        this.priceCategory = priceCategory;
    }

    //getters
    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public String getPriceCategory() {
        return this.priceCategory;
    }

    //shop constructor
    public Shop(String name,String description,String priceCategory)
    {
        this.name = name;
        this.description = description;
        this.priceCategory = priceCategory;
        this.list = new ArrayList<>();
    }

    @Override
    public List<Review> getReviews() {
        return this.list;
    }

    @Override
    public void addReview(Review review) {
        list.add(review);
    }

    public String toString(){
        return String.format("%s is a shop which is %s. Average cost: %s",this.name,this.description,this.priceCategory);
    }

}
