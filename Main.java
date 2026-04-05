package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        //Q1  1.Write a Java program to test if the first and the last element of an array of
        //integers are same. The length of the array must be greater than or equal to
        //2 Test Data:
        //array = 50, -20, 0, 30, 40, 60, 10
        //
        //Sample Output: false

        int[] num = { 50, -20, 0, 30, 40, 60, 10 };

        if (num[0] == num[num.length-1]){
            System.out.println("true");
        }else System.out.println("false");


        //2.Write a Java program to find the numbers greater than the average of the
        //numbers of a given array.
        //Original Array:
        //[1, 4, 17, 7, 25, 3, 100]
        //
        //Expected Output:
        //The average of the said array is: 22.0 The numbers in the said array that are
        //greater than the average are: 25 100



        int[] num2 = { 1, 4, 17, 7, 25, 3, 100 };

        int sum = 0;
        for (int i=0;i<num2.length;i++){
            sum += num2[i];
        }int avg = sum/(num2.length);
        System.out.println( "The average of the said array is: " + avg + " The numbers in the said array that are greater than the average are: ");
        for (int i=0;i<num2.length;i++){
            if ( num2[i] > avg){
                System.out.print(" " + num2[i] + " ");
            }
        }



        //3.Write a Java program to get the larger value between first and last
        //element of an array of integers.
        //Original Array:
        //[20, 30, 40]
        //
        //Sample Output:
        //Larger value between first and last element: 40



        int num3[] = { 20 , 30 , 40 };

        if (num3[0] > num3[num3.length-1] ){
            System.out.println(num3[0] + " Is greater");
        }else System.out.println(num3[num3.length-1] + " Is greater");




        //4.Write a Java program to swap the first and last elements of an array and
        //create a new array.
        //Original Array:
        //[20, 30, 40]
        //
        //Sample Output:
        //New array after swapping the first and last elements: [40, 30, 20]


        int temp = num3[0];
        num3[0] = num3[num3.length-1];
        num3[num3.length-1] = temp;

        System.out.println("New array after swapping the first and last elements: " + java.util.Arrays.toString(num3));




        //5. Write a program that places the odd elements of an array before the
        //even elements.
        //Original Array:
        //[2,3,40,1,5,9,4,10,7]
        //
        //Sample Output:
        //[3,1,5,9,7,2,40,4,10]


        int num4[] = {2,3,40,1,5,9,4,10,7};
        int[] result = new int[num4.length];
        int index = 0;

        for (int i = 0 ; i < num4.length ; i++){
            if (num4[i] % 2 == 1){
                result[index] = num4[i];
                index++;
            }
        }
        for (int i = 0 ; i < num4.length ; i++){
            if (num4[i] % 2 == 0){
                result[index] = num4[i];
                index++;
            }
        }

        System.out.println("Output: " + java.util.Arrays.toString(result));

        //Another solution
/*        int odd=0 , even=0;
        for (int i = 0 ; i < num4.length ; i++){
            if (num4[i] %2 == 1){
                odd++;
            }else even++;
        }
        int[] odds = new int[odd];
        int[] evens = new int[even];
        odd =0;
        even =0;
        for (int i = 0 ; i < num4.length ; i++){
            if (num4[i] %2 == 1){

                odds[odd] = num4[i];
                odd++;

            }else {

                evens[even] = num4[i];
                even++;
            }
        }
        even = 0;
        for (int i = 0 ; i < num4.length ; i++){
            if (i < odds.length){
             num4[i] = odds[i];
            }else {
                num4[i] = evens[even];
                even++;
            }
        }
        System.out.println("Output: " + java.util.Arrays.toString(num4));
*/



        //6. Write a program that test the equality of two arrays.
        //[2,3,6,6,4] [2,3,6,6,4]
        //
        //Sample Output: true



        int a1[] = {2,3,6,6,4};
        int a2[] = {2,3,6,6,4};
        boolean equal = true;
        if (a1.length == a2.length){
            for (int i = 0 ; i < a1.length ; i++){

                if (a1[i] != a2[i]){
                    equal = false;
                    break;
                }
            }
        }else {
            equal = false;
            System.out.println("they are not same size.");
        }
        System.out.println(equal);

    }
}
