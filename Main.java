import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//      Q1:
//        int[] array = {50, -20, 0, 30, 40, 60, 10};
//
//        if (array.length >= 2) {
//
//            boolean areSame = array[0] == array[array.length - 1];
//            System.out.println(areSame);
//        } else {
//            System.out.println("The length of the array is less than 2");
//        }

//       Q2:
//        int[] array = {1, 4, 17, 7, 25, 3, 100};
//
//        double sum = 0;
//        for (int num : array) {
//            sum += num;
//        }
//        double average = sum / array.length;
//
//        System.out.println("The average of the said array is: : " + average);
//        System.out.print("The numbers in the said array that are\n" +
//                "greater than the average are: " );
//        for (int num : array) {
//            if (num > average) {
//                System.out.print(num + " ");
//            }
//        }

//        Q3:
//        int[] array = {20, 30, 40};
//
//        int firstElement = array[0];
//        int lastElement = array[array.length - 1];
//        int largerValue = Math.max(firstElement, lastElement);
//        System.out.println("Larger value between first and last element: " + largerValue);

//     Q4:

//        int[] originalArray = {20, 30, 40};
//
//        int[] newArray = new int[originalArray.length];
//
//        newArray[0] = originalArray[originalArray.length - 1];
//        for (int i = 1; i < originalArray.length - 1; i++) {
//            newArray[i] = originalArray[i];
//        }
//        newArray[newArray.length - 1] = originalArray[0];
//
//        System.out.println("Original Array: " + Arrays.toString(originalArray));
//        System.out.println("New array after swapping the first and last elements: " + Arrays.toString(newArray));

//     Q5:
//        int[] originalArray = {2, 3, 40, 1, 5, 9, 4, 10, 7};
//
//        int[] newArray = new int[originalArray.length];
//
//        int oddIndex = 0;
//
//        for (int num : originalArray) {
//            if (num % 2 != 0) {
//                newArray[oddIndex++] = num;
//            }
//        }
//        for (int num : originalArray) {
//            if(num % 2 == 0){
//                newArray[oddIndex++] = num;
//            }
//        }
//        System.out.println("Original Array: " + Arrays.toString(originalArray));
//        System.out.println("New array with odd elements before even elements: " + Arrays.toString(newArray));

//      Q6:
//        int[] array1 = {2, 3, 6, 6, 4};
//        int[] array2 = {2, 3, 6, 6, 4};
//
//        boolean isEqual = Arrays.equals(array1, array2);
//
//        System.out.println("Array1: " + Arrays.toString(array1));
//        System.out.println("Array2: " + Arrays.toString(array2));
//        System.out.println("Are the arrays equal? " + isEqual);
    }
    }