/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author Lauchlan
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        // TODO code application 
//        System.out.println("Mr. Lawrence has nice hair.");
//        System.out.println("asdfghjk,.");
//        System.out.println("privett rocks");System.out.println("build grid");System.out.println("sup boi");

        int sum = addTwoNumbers(17, 3);
        System.out.println("the real integer sum is " + sum);

        sum = addTwoNumbers(27, 32);
        System.out.println("the real integer sum is " + sum);

        sum = addTwoNumbers(0, Integer.MAX_VALUE);
        System.out.println("the real integer sum is " + sum);

        double aSum = addTwoDoubles(10.5, 3.3);
        System.out.println("the double result is " + aSum);
        aSum = addTwoDoubles(5.7, 5.5);
        System.out.println("the double result is " + aSum);
        aSum = addTwoDoubles(3.8, 4.4);
        System.out.println("the double result is " + aSum);

        int sum3 = addThreeIntegers(4, 4, 4);
        System.out.println("the integer sum is " + sum3);
        sum3 = addThreeIntegers(5, 5, 5);
        System.out.println("the integer sum is " + sum3);
        sum3 = addThreeIntegers(6, 6, 6);
        System.out.println("the integer sum is " + sum3);

        int sum4 = addTwoIntegers(7, 7);
        System.out.println("the actual sum is " + sum4);
        sum4 = addTwoIntegers(8, 8);
        System.out.println("the actual sum is " + sum4);
        sum4 = addTwoIntegers(9, 9);
        System.out.println("the actual sum is " + sum4);
        sum4 = addTwoIntegers(0, Integer.MAX_VALUE);
        System.out.println("the actual sum is " + sum4);
        sum4 = addTwoIntegers(1, Integer.MAX_VALUE);
        System.out.println("the actual sum is " + sum4);

        int sum5 = divideIntegers(8, 2);
        System.out.println("the product is " + sum5);
        sum5 = divideIntegers(12, 4);
        System.out.println("the product is " + sum5);
        sum5 = divideIntegers(9, 3);
        System.out.println("the product is " + sum5);
        sum5 = divideIntegers(10, 2);
        System.out.println("the product is " + sum5);
        sum5 = divideIntegers(11, 2);
        System.out.println("the product is " + sum5);

        double sum6 = divideDoubles(6.3, 3.4);
        System.out.println("the answer is " + sum6);
        sum6 = divideDoubles(8.7, 4.5);
        System.out.println("the answer is " + sum6);
        sum6 = divideDoubles(24.9, 8.4);
        System.out.println("the answer is " + sum6);
        sum6 = divideDoubles(10.0, 2.0);
        System.out.println("the answer is " + sum6);
        sum6 = divideDoubles(11.0, 2.0);
        System.out.println("the answer is " + sum6);
    
    }

    public static int addTwoNumbers(int number1, int number2) {
        int result = number1 + number2;
        return result;
    }

    public static double addTwoDoubles(double n1, double n2) {
        double result = n1 + n2;
        return result;

    }

    public static int addThreeIntegers(int number1, int number2, int number3) {
        return number1 + number2 + number3;

    }

    public static int addTwoIntegers(int number1, int number2) {
        return number1 + number2;

    }

    public static int divideIntegers(int number1, int number2) {
        return number1 / number2;

    }

    public static double divideDoubles(double number1, double number2){
        return number1 / number2;
    }
    
    
    
}
