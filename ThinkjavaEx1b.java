import java.util.Random;
import java.util.Arrays;
public class ThinkjavaEx1b{ 
         public static void main(String[]args){
        int numbers=100;
        int[]scores=randomArrays(numbers);
         System.out.println(Arrays.toString(scores));
    }
    public static int[]randomArrays(int size){
        Random random =new Random();
     int[]scores=new int[size];
     for(int i=0;i<scores.length;i++){ 
           scores[i]=random.nextInt(100);
        }
            return scores;
        }
        public static int inRange(int[]a, int low, int high){
          int count = 0;
            for(int i=0;i<a.length;i++){ 
         if(a[i]>=low && a[i]<high){
             count ++;
            }
    }
    return count;
   }
    public static void printHist(){
       int[] scores= randomArrays(100);
       int[]counts = new int[100];
       for(int i=0;i<counts.length;i++){
           counts[i]=inRange(scores,i,i+1);
       System.out.print(counts);
    }
     }
}

    