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
                        
            methods:toString()
            
                    addReview()
                    
                    updateStars()
                    
                    
Tests: two files for tests including RestaurantTest file and
       ReviewTest file. 
       RestaurantTest file has tests for getters and setters and for the
       toString(),addReview(),and updateStars().
       ReviewTest includes the toString() method.