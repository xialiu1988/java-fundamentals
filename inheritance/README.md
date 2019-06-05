**Inheritance**

main java has two classes : 

Review: 

          properties: body(string)
                     
                      author(string)
                     
                      stars(int)
                      
           method:    toString()


Restaurant:
 
            properties: name(string)
                       
                        stars(int)        
                                       
                        priceCategory(string)  
                                             
                        reviews(List<Review>)
                        
            methods: toString()  
                      
                    getReviews() 
                                      
                    addReview()
                    
                    updateStars()
                    

Shop:  
          `  properties:   name;
                           description;
                           priceCategory;
                           List<Review> list;`

            methods:     toString()
            @override    getReviews()
            @override    addReivew()


Theater:    `properties:    name;
                           movies;  
                           theaterReviews;
                           movieReviews;`
          
                      methods:     toString()
                      @override    getReviews()
                      @override    addReivew()


Interface: Reviewinterface:
           
           List<Review> getReviews();
           void addReview(Review review);



Tests: two files for tests including RestaurantTest file and
       ReviewTest file. 
       RestaurantTest file has tests for getters and setters and for the
       toString(),addReview(),and updateStars().
       ReviewTest includes the toString() method.
       ShopTest holds all the tests for the methods in the shop class
       TheaterTest holds all the tests for the methods in the Theater class
       