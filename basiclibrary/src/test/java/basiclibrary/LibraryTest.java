/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

public class  LibraryTest {
    //Feature 1
    @Test public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertEquals("The new array should have the same number of length as the input number",3, classUnderTest.roll(3).length);
        for(int n: classUnderTest.roll(3)){
            assertTrue("Each number should be greater or equal to 1",n>=1);
            assertTrue("Each number should be less or equal to 6",n<=6);
        }
    }

   //Feature 2
    @Test
    public void checkarrayhasDuplicates(){
        Library classUnderTest = new Library();
        int[] inputArr = new int[]{6,4,5,6,2,3};
        assertTrue("It has duplicates in this array should return true",classUnderTest.containsDuplicates(inputArr));
    }


    @Test
    public void checkarrayDoesNothaveDuplicates(){
        Library classUnderTest = new Library();
        int[] inputArr = new int[]{4,5,6,2,3};
        assertFalse("It Does Not have duplicates in this array should return false",classUnderTest.containsDuplicates(inputArr));
    }


    @Test
    public void checkarrayIfOnlyHasOneNumber(){
        Library classUnderTest = new Library();
        int[] inputArr = new int[]{4};
        assertFalse("It Does Not have duplicates in this array should return false",classUnderTest.containsDuplicates(inputArr));
    }
    //Feature 3
    @Test
    public void averageValueisanInteger(){
        Library classUnderTest = new Library();
        int[] inputArr = new int[]{6,3,0};
        assertEquals("This should return 3","3",classUnderTest.calAvg(inputArr));
    }
    @Test
    public void averageValueisanDoubleType(){
        Library classUnderTest = new Library();
        int[] inputArr = new int[]{6,3,1};
        assertEquals("This should return 3","3.33",classUnderTest.calAvg(inputArr));
    }

    @Test
    public void averageValueisNegtiveValue(){
        Library classUnderTest = new Library();
        int[] inputArr = new int[]{-6,3,1};
        assertEquals("This should return 3","-0.67",classUnderTest.calAvg(inputArr));
    }

    //Feature 4
    @Test
    public void returnLowestAverageArray(){
        Library classUnderTest = new Library();
        int[][] inputArr = new int[][]{{4},{3,3,3}};
        int[] expected = new int[]{3,3,3};
        assertArrayEquals("should return lowest average array {3,3,3}",expected,classUnderTest.calLowestAvg(inputArr));
    }

    @Test
    public void EqualvalueReturnFirstArray(){
        Library classUnderTest = new Library();
        int[][] inputArr = new int[][]{{4,2},{3,3,3}};
        int[] expected = new int[]{4,2};
        assertArrayEquals("Equal average return first array {4,2}",expected,classUnderTest.calLowestAvg(inputArr));
    }


    //Lab03: Analyze Weather Data
    @Test
    public void testAnalyzeWeatherData(){
        Library classUnderTest = new Library();
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        HashMap<String,Integer> b = classUnderTest.analyzeWeatherData(weeklyMonthTemperatures);
        assertTrue("High should be 72",b.get("High")==72);
        assertTrue("Low should be 51",b.get("Low")==51);

        List<Integer> list = new ArrayList<Integer>();

        for(String key : b.keySet()){
            if(key.contains("Never saw temperature")){
                list.add(b.get(key));
            }
        }

        assertTrue("list should have 4 temperature never been seen",list.size()==4);
        assertTrue("list should contain temperature 63",list.contains(63));
        assertTrue("list should contain temperature 63",list.contains(67));
        assertTrue("list should contain temperature 63",list.contains(68));
        assertTrue("list should contain temperature 63",list.contains(69));
    }

   //Lab03: tallying votes tests
    @Test
    public void testTallyingVotes(){
        Library classUnderTest = new Library();
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        String winner = classUnderTest.tally(votes);
        assertEquals("Bush has most votes here","Bush",winner);
    }

    @Test
    public void testTallyingVotesAgain(){
        Library classUnderTest = new Library();
        List<String> votes = new ArrayList<>();

        votes.add("Shrub");
        votes.add("Shrub");
        votes.add("Shrub");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        String winner = classUnderTest.tally(votes);
        assertEquals("Shrub has most votes here","Shrub",winner);
    }

}
