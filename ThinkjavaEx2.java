//*calculates the result of multiplying all element in 'a'
*reduce(1){$0*$1}
public static int banana(int[] a) {
    //storing result of calculation
    int kiwi = 1;
    int i = 0;
    while (i < a.length) {
        kiwi = kiwi * a[i];
        i++;
    }
    return kiwi;
}
*Finds the index of frist grape in a index of grape 
public static int grapefruit(int[] a, int grape) {
    for (int i = 0; i < a.length; i++) {
        if (a[i] == grape) {
            return i;
        }
    }
    return -1;
    //@return index of grape;
    //-1 if not found
}
*counts the total appearance of apple in a 
*(a.filter{$0==apple}).count
public static int pineapple(int[] a, int apple) {
    //storing total number of apple 
    int pear = 0;
    for (int pine: a) {
        if (pine == apple) {
            pear++;
        }
    }
    return pear;
}//