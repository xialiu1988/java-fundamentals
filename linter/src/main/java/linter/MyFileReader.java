package linter;

import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class MyFileReader {
    public void FindNoSemiColon() {
        int lineNumber = 0;
        try{
            Scanner sc = new Scanner(new File("src/main/resources/gates.js"));
            while(sc.hasNextLine()) {
                lineNumber++;
                String line = sc.nextLine();

           if(!line.isEmpty()){
               if(!line.contains("if")&&!line.contains("else")&&!line.contains("{")&&
               !line.contains("}")){
                    if(!line.contains(";")){
                        System.out.println("Line"+lineNumber+" : "+"Missing semicolon.");
                    }
               }
           }

            }

        }catch (FileNotFoundException e){
            System.out.println(e);
        }

    }
}
