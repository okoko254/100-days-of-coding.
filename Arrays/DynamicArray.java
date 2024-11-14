package Arrays;

public class DynamicArray {

    private int[] array;
    private int size;

    //Constructor
    public DynamicArray(){
        array = new int[2];
        size = 0;
    }

    //Add an element to the array
    public void add(int element){
        //Resize if the array is full
        if (size == array.length) {
            resize();
        }
        array[size] = element;
        size++;
    } 

    //Get an element at a specific index
    public int get(int index){
        if(index >= size || index < 0){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return array[index];
    }

    //Set an element at a specific index
    public void set(int index ,int element){
        if (index >= size || index <0) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        array[index] = element;
    }

    //Remove an element at a specific index
    public void remove(int index){
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        //Shift elements to the left
        for (int i = index; i < size - 1; i++){
            array[i] = array[i + 1];
        }
        array[size - 1] = 0;//Optional: clear the last element
        size--;
    }

    //Get the current size of the dynamic array
    public int size(){
        return size;
    }

    //Resize the array when it's full
    private void resize(){
        int[] newArray = new int[array.length*2];

        //copy the elements to the new array
        for (int i = 0; i < array.length; i++){
            newArray[i] = array[i];
        }
        array = newArray;
    }

    //Display the elements in the array (for testing)
    public void Display(){
        System.out.print("Array elements: ");
        for (int i = 0; i < size; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();

        dynamicArray.add(10);
        dynamicArray.add(20);
        dynamicArray.add(30);
        dynamicArray.Display(); //Output 10 20 30

        System.out.println("Element at index 1: " + dynamicArray.get(1));

        //Set an element
        dynamicArray.set(1, 25);
        dynamicArray.Display();
    }
}

/*
 *Dynamic arrays - like normal arrays but can grow and shrink as needed
 *  Dynamic array has it's own inner satic array with a fixed size
 * once the inner static array reaches it's full capacity, the D.A 
 * declares and instantiates a new array with increased capacity; varies depending 
 * on P.L (1.5-2)
 * 
 * Advantages
 * Random Access of elements O(1)
 * Good locality of reference and data cache utilization
 * Easy to insert/delete at the end
 * 
 * Disadvantages
 * waste more memory than LinkedLIst
 * Shifting elements is time consumingO(n)
 * Expanding or shrinking the array is time consuming
 * 
 * implemented by ArrayList class in java
 */