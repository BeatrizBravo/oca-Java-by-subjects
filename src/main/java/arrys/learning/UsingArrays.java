package arrys.learning;


import java.util.Arrays;


public class UsingArrays {

    public static void main(String[] args) {
        // declaring and initializing (if we don't do it'll be null). // anonymous array on right
        String[] pets = {"parrot", "cat", "dog"};

        System.out.println(pets[0]);
        System.out.println(pets[1]);
        System.out.println(pets[2]);
//        System.out.println(pets[3]); // throws ArrayIndexOutOfBounds since we only have 3 elements

        //change elements in the array
        pets[0] = "bird";

        // PRINT ELEMENTS OF THE ARRAY
        // range of index [0-2], 0 - length - 1
        for (int i = 0; i < pets.length; i++) {
            System.out.println(pets[i]);
        }

        for (int i = 0; i <= pets.length - 1; i++) {
            System.out.println(pets[i]);
        }

        System.out.println(pets); //PRINT the reference

        System.out.println(Arrays.toString(pets));        // PRINT ELEMENTS OF THE ARRAY


        int[] numbers = new int[5];
        System.out.println(Arrays.toString(numbers));// [0,0,0,0,0] **int** automaticaly initialice with 0

        String[] newPets = new String[5];
        System.out.println(Arrays.toString(newPets)); // no initializing [null, null, null, null,null]. String is a object


        //populating the array
        for (int i = 0; i < numbers.length; i++) {
            // 1. iteration i = 0
            // numbers[0] = 0 + 10 -> 10
            // 2. iteration i = 1
            // numbers[1] = 1 + 10 -> 11
            // 3. iteration i = 2
            // numbers[2] = 2 + 10 -> 12
            // 4. iteration i = 3
            // numbers[3] = 3 + 10 -> 13
            // 5. iteration i = 4
            // numbers[4] = 4 + 10 -> 14
            numbers[i] = i + 10;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "]= " + numbers[i]);
        }

        System.out.println(numbers); //[Ijava.lang.string;@code
        System.out.println(Arrays.toString(numbers));



        Integer[] nums = new Integer[4];   //[null,null,null,null,null] **Integer** no initialice with 0
        System.out.println(Arrays.toString(nums));


        //populating the array
        for (int i = 0; i < nums.length; i++) {
            // 1. iteration 0 -> 0 % 3 = 0
            // 2. iteration 1 -> 1 % 3 = 1
            // 3. iteration 2 -> 2 % 3 = 2
            // 4. iteration 3 -> 3 % 3 = 0
            nums[i] = i % 3;
        }

        System.out.println(Arrays.toString(nums)); //[0, 1, 2, 0]

    }
}

