/**
 * Created by tuna on 9/21/2016.
 */
public class MaxHeapPractice {

    private int[] heap;
    private int size;
    private int maxSize;

    private static final int FRONT = 1;

    public MaxHeapPractice(int maxSize){
        this.maxSize = maxSize;
        size = 0;
        heap = new int[maxSize+1];
        heap[0] = Integer.MAX_VALUE;
    }

    public int parent(int index){
        return (index/2);
    }

    public int leftChild(int index){
        return (index * 2);
    }

    public int rightChild(int index){
        return (index*2) + 1;
    }

    public void insert(int element){
        size++;
        heap[size] = element;
        int current = size;
        while(heap[current] > heap[parent(current)]){
            swap(current, parent(current));
            current = parent(current);
        }
    }

    public void swap(int i, int j){
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public boolean isLeafNode(int index){
        if(index > (size/2) && index < size){
            return true;
        }
        return false;
    }

    public void maxHeapify(int index){
        if(!isLeafNode(index)){
            if(heap[index] < heap[leftChild(index)] || heap[index] < heap[rightChild(index)]){
                if(heap[leftChild(index)] > heap[rightChild(index)]){
                    swap(index, leftChild(index));
                    maxHeapify(leftChild(index));
                }
                else{
                    swap(index, rightChild(index));
                    maxHeapify(rightChild(index));
                }
            }
        }
    }

    public int remove(){
        int popped = heap[FRONT];
        heap[FRONT] = heap[size];
        size--;
        maxHeapify(FRONT);
        return popped;
    }

    public void print()
    {
        for (int i = 1; i <= size / 2; i++ )
        {
            System.out.print(" PARENT : " + heap[i] + " LEFT CHILD : " + heap[2*i]
                    + " RIGHT CHILD :" + heap[2 * i  + 1]);
            System.out.println();
        }
    }

    public static void main(String[] args){
        MaxHeapPractice maxHeap = new MaxHeapPractice(50);
        maxHeap.insert(88);
        maxHeap.insert(60);
        maxHeap.insert(50);
        maxHeap.insert(100);
        maxHeap.insert(344);
        maxHeap.insert(65);
        maxHeap.insert(40);
        maxHeap.insert(15);
        maxHeap.insert(1550);
        System.out.println("The max val is " + maxHeap.remove());
        System.out.println("The max val is " + maxHeap.remove());
        System.out.println("The max val is " + maxHeap.remove());
        System.out.println("The max val is " + maxHeap.remove());
        System.out.println("The max val is " + maxHeap.remove());
    }
}
