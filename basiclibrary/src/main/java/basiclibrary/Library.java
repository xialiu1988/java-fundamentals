/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;
import java.util.*;
import java.text.DecimalFormat;
public class Library {
    //Feature 1: roll the Dice and return the values of each time
    public int[] roll(int n) {
        int[] rollResult = new int[n];
        for(int i=0;i<rollResult.length;i++){
            rollResult[i] = new Random().nextInt(6)+1;
        }
       return rollResult;
    }

    //Feature 2: check if the array contains duplicate values
    public boolean containsDuplicates(int[] inputArr) {
        List<Integer> list = new ArrayList<Integer>();
        for(int n : inputArr){
            if(!list.contains(n)){
                list.add(n);
            }
            //found duplicates return true means it has duplicates
            else return true;
        }
        //if does not have duplicates, return false
    return false ;
    }

   //Feature 3: calculate averages in the array
   public String calAvg(int[] inputArr){
       double sum = 0.0;
       for(int n : inputArr ){
           sum += n;
       }
       DecimalFormat df = new DecimalFormat("#.##");
       return df.format(sum/inputArr.length);
   }

   //Feature 4: calculat average value for each array and return the lowest average array
    public int[] calLowestAvg(int[][] inputArrs){
        double[] avg = new double[inputArrs.length];
        for(int i=0;i<inputArrs.length;i++){
             int sum = 0;
            for(int j=0;j<inputArrs[i].length;j++){

                sum +=inputArrs[i][j];
            }
           avg[i] = sum/inputArrs[i].length;
        }
        double preLow = avg[0];
        int idx = 0;
        for(int k=1;k<avg.length;k++){
            if(avg[k]<preLow){
                preLow = avg[k];
                idx = k;
            }
        }
        return inputArrs[idx];
    }



    //Lab03 Method#1: Analyzing Weather Data
    public String analyzeWeatherData(int[][] octSeattleWeather){
        int min =999;
        int max =0;
        //create a string to store the final result want to return
        String res = "";
        //create a hashset to store all the numbers appears in the input weather data
        HashSet<Integer> set = new HashSet<Integer>();
        //iterate the input weather data(matrix) find the lowest temperature and highest temperture and store the unique temperature in the set

        for(int i=0;i<octSeattleWeather.length;i++){
            for(int j=0;j<octSeattleWeather[i].length;j++){
                min = min<octSeattleWeather[i][j]?min:octSeattleWeather[i][j];
                max = max>octSeattleWeather[i][j]?max:octSeattleWeather[i][j];
                set.add(octSeattleWeather[i][j]);
            }
        }
        //add "High" and "Low" to the string
        res+="High: "+max+"\n";
        res+="Low: "+min+"\n";
       //between High and Min,if set doesn't have certain number, add that to the hashmap ,the key will be ("Never Saw temperature"+K) cuz the key has to be unique that is why i added k after that string,but when print out i will take that "k" out, so you will only see "Never saw temperature"
        for(int k=0;k<(max-min);k++){
           if(!set.contains(k+min)) {
               res+="Never saw temperature: "+(k+min)+"\n";
           }
        }
     return res;
    }


    // Method#2 : Tallying Election
    public String tally(List<String > list){
     HashMap<String,Integer> hashMap = new HashMap<>();
     for(String s : list){
         if(hashMap.containsKey(s)){
             hashMap.put(s, hashMap.get(s)+1);
         }
        else hashMap.put(s,0);
     }

         int max = 0;
         String name = "";
        for(String key : hashMap.keySet()){
            if(hashMap.get(key)>max){
                max = hashMap.get(key);
                name = key;
            }
        }
        return name;

    }

}
