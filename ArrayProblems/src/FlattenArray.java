/**
 * Created by tuna on 11/10/2016.
 */
public class FlattenArray {

    public int[] flattenArray(int[][] array){
        int [] flattenArr = new int[array.length * array[0].length];
        int flattenArrCount = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                flattenArr[flattenArrCount++] = array[i][j];
            }
        }
        return flattenArr;
    }
}
