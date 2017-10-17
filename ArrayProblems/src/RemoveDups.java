/**
 * Created by tuna on 12/6/2016.
 */
public class RemoveDups {

    public int getRemovedDupLength(int[] arr){
        if(arr == null || arr.length == 0){
            return 0;
        }
        int currElement = arr[0];
        int currLength = arr.length;
        for(int i = 1; i < arr.length; i++){
            if(currElement != arr[i]){
                currElement = arr[i];
            }
            else{
                currLength--;
            }
        }
        return currLength;
    }

    public int[] removeDupsFromSortedArray(int [] arr){
        if(arr == null || arr.length == 0){
            return new int [0];
        }
        int [] arrNoDups = new int [arr.length];
        int currEle = arr[0];
        arrNoDups[0] = currEle;
        int arrIndex = 1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] != currEle){
                currEle = arr[i];
                arrNoDups[arrIndex++] = currEle;
            }
        }

        return arrNoDups;
    }

    public ListNode removeDupsFromSortedList(ListNode node){
        ListNode curr = node;
        while(curr != null && curr.next != null){
            if(curr.val == curr.next.val){
                curr.next = curr.next.next;
            }
            curr = curr.next;
        }
        return node;
    }
}
