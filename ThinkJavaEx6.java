public class ThinkJavaEx6{   
public static boolean areFactors(int n, int[] factors){
      for (int factor:factors){
         if (n % factor != 0)
            return false;
      }
      return true;
   }
}