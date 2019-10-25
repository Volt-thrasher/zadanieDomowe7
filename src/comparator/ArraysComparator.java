package comparator;

public class ArraysComparator {
    public static boolean compare(int[] array1, int[] array2){
        boolean result = false;
        if(array1.length==array2.length){
            for (int i=0; i<array1.length; i++){
                if (array1[i]==array2[i]) {
                    result= true;
                }else {
                    result = false;
                    break;
                }
            }
        }else result= false;
        return result;
    }
    public static boolean compare(int[][] array1, int[][]array2){
        boolean result = false;
        if (array1.length==array2.length){
            for (int i = 0; i<array1.length; i++){
                if (array1[i]==array2[i]) {
                    if (array1[i].length==array2[i].length){
                    for (int j = 0; j<array1[i].length; j++){
                        if (array1[i][j]==array2[i][j]) {
                            result = true;
                        }else {
                            result = false;
                            break;
                        }
                        }
                    }
                }
            }
        }else result=false;
        return result;
    }
}
