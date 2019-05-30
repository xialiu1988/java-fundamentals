/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class AppTest {
    //no error
    @Test public void testNoErrorsFile() {
        MyFileReader classUnderTest = new MyFileReader();
        String filepath = "src/test/resources/noErrors.js";
        List<String > list = classUnderTest.FindNoSemiColon(filepath);
        assertTrue("list will have none error msg",list.size()==0);
    }
    //test one error
    @Test public void testOneErrorFile() {
        MyFileReader classUnderTest = new MyFileReader();
        String filepath = "src/test/resources/oneError.js";
        List<String > list = classUnderTest.FindNoSemiColon(filepath);
        assertTrue("list will have one error msg",list.size()==1);
    }
  //test few error
    @Test public void testFewrrorFile() {
        MyFileReader classUnderTest = new MyFileReader();
        String filepath = "src/test/resources/fewErrors.js";
        List<String > list = classUnderTest.FindNoSemiColon(filepath);
        assertTrue("list will have more than one error msgs",list.size()>1);
    }

    //test many errors
    @Test public void testManyrrorFile() {
        MyFileReader classUnderTest = new MyFileReader();
        String filepath = "src/test/resources/manyErrors.js";
        List<String > list = classUnderTest.FindNoSemiColon(filepath);
        assertTrue("list will have lots of error msgs",list.size()>10);
    }

    //test empty file, will have 0 error msg since empty line will not have error msg
    @Test public void testEmptyFile() {
        MyFileReader classUnderTest = new MyFileReader();
        String filepath = "src/test/resources/empty.js";
        List<String > list = classUnderTest.FindNoSemiColon(filepath);
        assertTrue("list will have no error msgs",list.size()==0);
    }
}
