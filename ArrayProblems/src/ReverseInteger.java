/**
 * Created by tuna on 2/1/2017.
 */
public class ReverseInteger {

    public int reverse(int num){
        int res = 0;

        boolean neg = false;
        //neg case
        if(num < 0){
            num = num * -1;
            neg = true;
        }

        while(num > 0){
            int lastNum = num % 10;
            num = num / 10;
            res = res * 10 + lastNum;
        }

        if(neg){
            res *= -1;
        }

        return res;
    }
}
