public class ThinkJavaEx4{
    public static int indexOfMax(int[]numbers){
        int index=0;
        for(int i=1;i<numbers.length;i++){
            if (numbers[i]>numbers[index]){
                index=1;
            }
        }
        return index;
    }
    public static int indexOfMaxWrittenInEnhancedForLoop(int[]numbers){
        int index=0;
        int i =0;
        for(int number:numbers){
            if(numbers[i]>numbers[index]){
                index=1;
            }
            i++;
        }
        return index;
    }
}
