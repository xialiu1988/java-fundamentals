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

           if(!line.isEmpty()){
               if(!line.contains("if")&&!line.contains("else")&&!line.contains("{")&&
               !line.contains("}")){
                    if(!line.contains(";")){
                        results.add("Line"+lineNumber+" : "+"Missing semicolon.");
                    }
               }
           }

            }
//            return results;

        }
        catch (FileNotFoundException e){
            System.out.println(e);
        }
finally {
            return results;
        }
    }
}
