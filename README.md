# java-fundamentals
Author: Xia Liu
##This is fundamentals practice for java 401.

1. [Basics](basics) :The basics directory has a Main.java file that contains methods pluralize(), flipNHeads(), clock()

2. [Basiclibrary](basiclibrary): Using gradle to initialize the files and has main folder and test folder inside src folder:

   main: includes Library.java which contains 4 features for this lab (Rolling Dice, Contains Duplicates, Calculating Averages,Arrays of Arrays)
         
         has methods: roll(),
                      containsDuplicates(),
                      calAvg(),
                      calLowestAvg(),
                      analyzeWeatherData(),
                      tally()
   test: includes LibraryTest.java which contains at least one test for each feature.

3.[Linter](linter): inside MyFileReader.java there is a method called FindNoSemiColon which
                    takes in a file path and using scanner to read the file and if it does not 
                    has semi-colon in the end it will print out "line #: Missing semicolon."
                    It will not print out the error message if the line has "{" or "}" in the end or the
                    line has "if" or "else" or the line is empty. 
          `          
                    tests: there are  5 js files for test each condition
                    which are empty.js(empty file), fewErrors.js(has few errors in the file),
                    manyErrors.js, noErrors.js(perfect file no errors), oneError.js(only one error);
                    
                    
4.[Inheritance](inheritance): main java has two classes : 

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
           
                    


