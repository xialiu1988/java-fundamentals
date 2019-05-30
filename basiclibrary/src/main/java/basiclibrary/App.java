package basiclibrary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class App {


    public static void main(String[] args){
        //Example for the analyze weather data for lab03
        int[][] res = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
     Library lOne = new Library();
        String b = lOne.analyzeWeatherData(res);
        System.out.println(b);
        System.out.println("======================");
        System.out.println("======================");

        //Example for tallying
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

        String winner = lOne.tally(votes);
        System.out.println(winner + " received the most votes!");


    }

}
