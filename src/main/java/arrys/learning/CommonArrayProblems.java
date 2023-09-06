package arrys.learning;

public class CommonArrayProblems {
    // index
    //looping
    //initialization
    //length

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; // 5 elements, index range 0-4

        for (int i = 1; i < numbers.length; i++) {
            System.out.println(i + " - " + numbers[i]); //1 - 2 ;  2 - 3 ; 3 - 4;  4 - 5
        }

        for (int i = 1; i <= numbers.length - 1; i++) {
            System.out.println(i + " - " + numbers[i]); //-1 makes to no be IndexOutOfBoundsException
        }

//        int[20] nums;  // no compilará porque el tamaño solo se puede especificar en la inicialización [5 elements, index range 0-4]
        int[] nums = new int[20]; // size only at initialization


//        int size = numbers.length(); // does not compile length is not a **method**
        int size = numbers.length;

//        numbers.length = 10; // does not compile you cant **set** length of array, only on initialization
    }
}
