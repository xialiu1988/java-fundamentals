package linter;

import java.io.FileNotFoundException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyFileReader {
    public List<String> FindNoSemiColon(String filepath) {
        List<String> results = new ArrayList<>();
        int lineNumber = 0;
        try{
            Scanner sc = new Scanner(new File(filepath));
            while(sc.hasNextLine()) {
                lineNumber++;
                String line = sc.nextLine();
//    getting the last character of string :string.substring(string.length() - 1)=>reference: https://stackoverflow.com/questions/5163785/how-do-i-get-the-last-character-of-a-string
           if(!line.isEmpty()){
               if(!line.contains("if")&&!line.contains("else")&&!line.substring(line.length() - 1).equals("{")&&
                       !line.substring(line.length() - 1).equals("}")){
                    if(!line.contains(";")){
                        results.add("Line"+lineNumber+" : "+"Missing semicolon.");
                    }
               }
           }

            }

        }
        catch (FileNotFoundException e){
            System.out.println(e);
        }
finally {
            return results;
        }
    }
}
