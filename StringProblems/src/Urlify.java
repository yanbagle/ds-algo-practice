/**
 * Created by tuna on 9/10/2016.
 */
public class Urlify {

    public String replaceBlanks(String s){
        char[] arr = s.toCharArray();
        int trueLength = arr.length;

        int spaceCount = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == ' '){
                spaceCount++;
            }
        }

        int index = trueLength + spaceCount * 2;

        char[] arr2 = new char[index];
        for(int i = 0; i < arr.length; i++){
            arr2[i] = arr[i];
        }

        for(int i = trueLength - 1; i >= 0; i--){
            if(arr2[i] == ' '){
                arr2[index-1] = '0';
                arr2[index-2] = '2';
                arr2[index-3] = '%';
                index = index-3;
            }
            else{
                arr2[index-1] = arr2[i];
                index--;
            }
        }

        return new String(arr2);
    }

}
