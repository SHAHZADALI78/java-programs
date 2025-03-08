package com.Test.Exception;

public class indexOutOfBoundsException {
    public static void main(String[] args) {
        System.out.println("  <<<<<<< Array IndexOutOfBoundsException >>>>>>>");
        try{
            int [] array = {1, 2,3, 4};
            System.out.println("Value of index  is 2 " + array[4]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out of Bounds" + e.getMessage());
        }
        String str1 = "Saad";
        int [] array1 = {1, 2,3, 4};
        System.out.println("Value of index 2 is " + str1.charAt(2));


        System.out.println(" <<<<<< String Index out of Bounds Exception>>>>>>>");
        try {
            String str2 = "Saad";
            int[] array2 = {1, 2, 3, 4};
            System.out.println("Value of index  5 is " + str2.charAt(5));
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("String Index Out Of Bounds Exception " +e.getMessage());
        }
        int [] array3 = {1, 2,3, 4};
        System.out.println("Value of index 0 is " + array3[0]);
    }
}
