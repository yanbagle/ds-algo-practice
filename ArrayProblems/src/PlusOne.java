/**
 * Created by tuna on 2/11/2017.
 */
public class PlusOne {

    public int[] addOne(int [] num){
        if(num == null || num.length == 0){
            return new int [0];
        }

        int carry = 1;
        for(int i = num.length-1; i >= 0; i--){
            int sum = num[i] + carry;
            if(sum >= 10){
                carry = 1;
            }
            else{
                carry = 0;
            }
            num[i] = sum % 10;
        }

        if(carry == 1){
            int [] addOneArr = new int [num.length+1];
            System.arraycopy(num,0,addOneArr,1,num.length);
            addOneArr[0] = carry;
            return addOneArr;
        }
        else{
            return num;
        }

    }
}
