public class ThinkJava8Ex1{
     public static void main(String[]args){
         double[]values={1.0,2.0,3.0};
         double power=2;
        powArray(values,power);
    }
    public static double[] powArray(double[]a,double power){
        double[] Squared=new double[a.length];
            for (int i = 0; i < a.length; i++) {
              Squared[i] = Math.pow(a[i], power);   
          System.out.println(Squared[i]);   
        }
        return Squared;
    }    
}
    