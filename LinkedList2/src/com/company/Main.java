package com.company;

public class Main {

    public static void main(String[] args) {

        /*
        LinkedList ll = new LinkedList();

        ll.add("a");
        ll.add("b");
        ll.add("c");
        ll.add("d");
        System.out.println(ll);
        ll.remove(1);
        System.out.println("removed node: " + ll);

        System.out.println("get first: " + ll.getFirst());
        System.out.println("get last: " + ll.getLast());
        */

        /*
        Stack stack = new Stack();
        System.out.println(stack.push("a"));
        System.out.println(stack.push("b"));
        System.out.println(stack.push("c"));

        System.out.println("pop: " + stack.pop());
        System.out.println("pop: " + stack.pop());
        System.out.println("pop: " + stack.pop());
        System.out.println("pop: " + stack.pop());


        Queue queue = new Queue();
        System.out.println(queue.enQueue("a"));
        System.out.println(queue.enQueue("b"));
        System.out.println(queue.enQueue("c"));
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        */

        Node n1 = new Node(5);
        n1.next = new Node(5);
        n1.next.next = new Node(5);

        Node n2 = new Node(5);
        n2.next = new Node(5);
        n2.next.next = new Node(5);

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        Node result = addTwoNumbers.add(n1,n2);

        while(result != null){
            System.out.println(result.data);
            result = result.next;
        }

    }
}
