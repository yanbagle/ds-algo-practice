/**
 * Created by tuna on 11/19/2016.
 */
public class PrintSpiralMatrix {

    public void printSprial(int[][] array){
        int startRow = 0;
        int endRow = array.length;
        int startCol = 0;
        int endCol = array[0].length;
        int i;

        while(startRow < endRow && startCol < endCol){
            for(i = startCol; i < endCol; i++){
                System.out.println(array[startRow][i]);
            }
            startRow++;
            for(i = startRow; i < endRow; i++){
                System.out.println(array[i][endCol-1]);
            }
            endCol--;
            if(startRow < endRow){
                for(i = endCol-1; i >= startCol; i--){
                    System.out.println(array[endRow-1][i]);
                }
                endRow--;
            }
            if(startCol < endCol){
                for(i = endRow-1; i >= startRow; i--){
                    System.out.println(array[i][startCol]);
                }
                startCol++;
            }

        }


    }

    public void printSpiralMiddle(int[][] array){
        int rowBegin = array.length/2;
        int rowEnd = array.length;
        int colBegin = array.length/2;
        int colEnd = array[0].length-1;
        int i;
        while(rowBegin > -1 && colBegin > -1){
            for(i = colBegin; i < colEnd; i++){
                System.out.println(array[rowBegin][i]);
            }
            for(i = rowBegin; i < rowEnd; i++){
                System.out.println(array[i][colEnd]);
            }
            colEnd--;
            colBegin--;
            if(colBegin > -1){
                for(i = colEnd; i > colBegin; i--){
                    System.out.println(array[rowEnd-1][i]);
                }
            }
            rowBegin--;
            if(rowBegin>-1){
                for(i = rowEnd-1; i > rowBegin; i--){
                    System.out.println(array[i][colBegin]);
                }
                rowEnd--;
            }

        }
    }


}
