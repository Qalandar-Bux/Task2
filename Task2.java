package Lab9;
import java.util.Arrays;

class Task2{
    private int[] arr;
    private int size;
    int capacity;
    // Constructor
    public Task2(int capacity) {
        arr = new int[capacity];
        size = 0;
    }

   
    public void insert(int data) {
        if (size == capacity) {
            System.out.println("Array is full, cannot insert.");
            return;
        }

        int insertIndex = size - 1;
        while (insertIndex >= 0 && arr[insertIndex] > data) {
            arr[insertIndex + 1] = arr[insertIndex];
            insertIndex--;
        }
        arr[insertIndex + 1] = data;
        size++;
    }
    public int extractMax() {
        if (size == 0) {
        	System.out.print("Priority queue is empty");
        }
        return arr[size];
    }
    public int getMax() {
        if (size == 0) {
       System.out.print("Priority queue is empty");
        }   
        return arr[size];
    }
    public boolean searchdata(int data) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == data) {
                return true;
            }
        }
        return false;
    }

      public boolean empty() {
    	  return size==0;
      }
    
    
    public static void main(String[] args) {
        PriorityQueue ob = new PriorityQueue(10);

        ob.insert(5);
        ob.insert(3);
        ob.insert(8);
        ob.insert(2);
         
        System.out.println("Max Element: " + ob.getMax());
        System.out.println("Extracted Max Element: " + ob.extractMax());
        System.out.println("Extracted Max Element: " + ob.extractMax());
        System.out.println("Extracted Max Element: " + ob.extractMax());
        System.out.println("Priority Queue after extraction: " + ob);

        System.out.println("Search for 3: " + ob.searchData(3));
        System.out.println("Search for 10: " + ob.searchData(10));
    }
}