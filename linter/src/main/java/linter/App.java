/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import java.util.List;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
    MyFileReader meRead = new MyFileReader();
    String filepath = "src/main/resources/gates.js";
    List<String> list = meRead.FindNoSemiColon(filepath);
        for(String s : list){
            System.out.println(s);
        }
    }
}
