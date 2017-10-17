import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/**
 * Created by tuna on 10/14/2016.
 */
public class ArrayProblemMain {
    public static void main(String [] args){

        int [] array1 = {19,22,15,35,40,10,20};
        int [] array2 = {1,1,1,5,5,3,6,6,8,9,9,9,9};


        IntToEnglish intToEnglish = new IntToEnglish();
        System.out.println(intToEnglish.intToEng(21105));

        /*
        BuySellStocks buySellStocks = new BuySellStocks();
        int p = buySellStocks.bestProfit(array1);
        System.out.println(p);



        SumPairs sp = new SumPairs();
        int[]array = {2,9,3,2,1,1,2,1,3,2};
        int sum = 4;
        ArrayList<Pairs> al = sp.getSumPairs2(array,sum);
        for(Pairs p : al){
            System.out.println(p.a + " " + p.b);
        }

        AbsoluteValueRunningSum abs = new AbsoluteValueRunningSum();
        abs.maxNumAbs(array);

        SubSetSum s = new SubSetSum();
        ArrayList<SubSet> list = s.getSubSets(array,10);
        for(int i = 0; i < list.size(); i++){
            for(int j = 0; j < list.get(i).size(); j++){
                System.out.print(list.get(i).list.get(j) + " , ");
            }
            System.out.println();
        }


        SumInString sumInString = new SumInString();
        System.out.println(sumInString.getSumInString("11aa22bb33dd44S"));


        BinarySearch bs = new BinarySearch();
        System.out.println(bs.binarySearch(array2, 7));


        FormatStringDash format = new FormatStringDash();
        System.out.println(format.formatString("abcefgm",2));


        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        FlattenArray fa = new FlattenArray();
        int[] flattenArray = fa.flattenArray(arr);
        for(int a: flattenArray){
            System.out.println(a);
        }



        HashMap<String, String> dict = new HashMap<String, String>();
        dict.put("cat","something");
        dict.put("yo","something");
        dict.put("what","something");
        ValidPermutation validPermutation = new ValidPermutation();
        HashSet<String> set = validPermutation.permutation("","abc",new HashSet());
        for(String s: set){
            if(dict.containsKey(s)){
                System.out.println(s);
            }
        }


        FindExtraElement findExtraElement = new FindExtraElement();
        System.out.println(findExtraElement.getExtraElement(array1,array2));


        int[][] matrix = {{1,  2,  3,  4,  5,  6},
                        {7,  8,  9,  10, 11, 12},
                        {13, 14, 15, 16, 17, 18}};
        PrintSpiralMatrix spiralMatrix = new PrintSpiralMatrix();
        spiralMatrix.printSprial(matrix);



        GetPairs pairs = new GetPairs();
        ArrayList<Pairs> list = pairs.get(array1,array2,5);
        for(Pairs p : list){
            System.out.println(p.a + " " + p.b);
        }



        CountFreq countFreq = new CountFreq();
        countFreq.countChar("0");


        int[][] matrix = {{1,  2,  3,  4,  5},
                         {7,  8,  9,  10, 11},
                         {13, 14, 15, 16, 17},
                         {18,19, 20, 21, 22}};
        PrintSpiralMatrix spiralMatrix = new PrintSpiralMatrix();
        spiralMatrix.printSpiralMiddle(matrix);


        MergeTwoSorted merge = new MergeTwoSorted();
        int [] arr = merge.mergeArrays(array1,array2);
        for(int i : arr){
            System.out.println(i);
        }



        ListNode node = new ListNode(1);
        node.next = new ListNode(1);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(3);
        node.next.next.next.next = new ListNode(5);
        RemoveDups dups = new RemoveDups();
        ListNode newList = dups.removeDupsFromSortedList(node);
        while(newList != null){
            System.out.println(newList.val);
            newList = newList.next;
        }



        TwoSumTarget obj = new TwoSumTarget();
        TwoSumTarget.Pair p = obj.getPairSum(array2,7);
        System.out.println(p.a + " " + p.b);


        SubStringCount ssc = new SubStringCount();
        System.out.println(ssc.countSubString("abcdcdc","cdc"));



        TwoSum ts = new TwoSum();
        int [] arr = ts.getTwoSum(7, array1);
        for(int i : arr){
            System.out.println(i);
        }



        ReverseInteger ri = new ReverseInteger();
        System.out.println(ri.reverse(-321));


        String [] arr = {"apple","ap","appr","apppprrr","pop"};
        LongestPrefix longestPrefix = new LongestPrefix();
        System.out.println(longestPrefix.getLongestPrefix("app",arr));



        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        System.out.println(searchInsertPosition.getIndex(array1,0));



        int num = 1234;
        ReverseInteger reverseInteger = new ReverseInteger();
        System.out.println(reverseInteger.reverse(num));



        MergeTwoSorted mergeTwoSorted = new MergeTwoSorted();
        int [] arr = mergeTwoSorted.mergeArrays2(array1,array2);

        for(int i : arr){
            System.out.println(i);
        }



        NeedleHaystack needleHaystack = new NeedleHaystack();
        System.out.println(needleHaystack.getIndexNeedleInHaystack("abcdefghi",""));



        PlusOne plusOne = new PlusOne();
        int [] arr = plusOne.addOne(array2);
        for(int i : arr){
            System.out.println(i);
        }



        RemoveDups removeDups = new RemoveDups();
        int [] arr = removeDups.removeDupsFromSortedArray(array2);

        for(int i : arr){
            System.out.println(i);
        }

        */


    }
}
