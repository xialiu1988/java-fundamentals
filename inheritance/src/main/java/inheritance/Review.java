package inheritance;

public class Review {
     String body;
     String author;
     int stars;

    //Review constructor
    public Review(String body,String author,int stars){
        this.body = body;
        this.author = author;
        this.stars = stars;
    }


   //toString method
    public  String toString(){
        return String.format("Rating: %d star. By %s. %s ",this.stars,this.author,this.body);
    }

}
