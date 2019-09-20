import java.util.Arrays;
public class ThinkjavaEx5{
    public static void main(String[]args){
       int[]values={2,3,4,5,6,7,8,9,10};
       int number = 2;
       System.out.println(Arrays.toString(values));
    }
    public static boolean[]sieve(int n){
        boolean[]result=new boolean[n];
        for(int i=2;i<n;i++)
        result[i]=true;
        for(int number =2;number<=(int)Math.sqrt(n);number++){
            if (result[number]==true){
                for(int indexInSeries=number*number;indexInSeries<n;indexInSeries+=number){
                    result[indexInSeries]=false;
                }
               }
        }
        return result;
    }
}
        