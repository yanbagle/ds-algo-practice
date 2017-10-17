package com.company;

/**
 * Created by tuna on 2/13/2017.
 */
public class AddTwoNumbers {

    //numbers represented in the linked lists are reversed
    public Node add(Node n1, Node n2){
        if(n1 == null || n2 == null){
            return new Node(0);
        }

        Node h1 = n1;
        Node h2 = n2;

        int carry = 0;

        Node result = new Node(-1);
        Node resultHead = result;

        while(h1 != null || h2 != null){
            int sum = carry;
            if(h1 != null){
                sum += h1.data;
                h1 = h1.next;
            }
            if(h2 != null){
                sum += h2.data;
                h2 = h2.next;
            }
            if(sum >= 10){
                carry = 1;
            }
            else {
                carry = 0;
            }
            result.next = new Node(sum%10);
            result = result.next;
        }

        if(carry == 1){
            result.next = new Node(1);
        }

        return resultHead.next;

    }

}
