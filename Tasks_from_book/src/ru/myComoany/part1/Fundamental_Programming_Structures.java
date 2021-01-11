package ru.myComoany.part1;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author AleAlRodionov
 */
public class Fundamental_Programming_Structures {

    public static void bubbleSort(int[] arr){
  
    for(int i = arr.length-1 ; i > 0 ; i--){
        for(int j = 0 ; j < i ; j++){
            if( arr[j] > arr[j+1] ){
                int tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
            }
        }
    }
}
    
    
    public static void Task1() {
         /*Write a program that reads an integer and prints it in binary, octal, and
        hexadecimal. Print the reciprocal as a hexadecimal floating-point number.*/
        Scanner in = new Scanner(System.in);
        int input = 0;
        if (in.hasNextInt()) {
            input = in.nextInt();
           }
        System.out.println(Integer.toString(input,2));
        System.out.printf("%o\n", input);
        System.out.printf("%X\n", input);
        double tmp = input;
        System.out.printf("%A\n", 1/tmp);
    }
    
    public static void Task2() {
          /*
            Write a program that reads an integer angle (which may be positive or
            negative) and normalizes it to a value between 0 and 359 degrees. Try
            it first with the % operator, then with floorMod.
        */    
        Scanner in = new Scanner(System.in);
        int input = 0;
        if (in.hasNextInt()) {
            input = in.nextInt();
        }
        if (input < 0){
            while (input < 0){
                input += 360;
            }
        }
        System.out.println(input%360);
        System.out.println(Math.floorMod(input,360));
    }
    
    public static void Task3() {
        /*
        Using only the conditional operator, write a program that reads three
        integers and prints the largest. Repeat with Math.max.
        */
        Scanner in = new Scanner(System.in);
        int counter = 0;
        int[] arr = new int[3];
        while (in.hasNextInt()) {
            arr[counter] = in.nextInt();
             counter++;
             if (counter > 2){
                 break;
             }
        }
        int max = arr[0];
        int max2 = arr[0];
        
        if (arr[1] > max){
            max = arr[1]; 
        }
        
        if (arr[2] > max){
            max = arr[2]; 
        }

        System.out.println(max);
        max2 = Math.max(arr[0], arr[1]);
        max2 = Math.max(max2, arr[2]);
        System.out.println(max2);
    }
    
    public static void Task4() {
       System.out.println(Math.nextUp(20.002695));
       System.out.println(Math.nextDown(2000));
   
    }
    
    public static void Task5() {
        int a;
        double b = 115.6698;
        a=(int) b;
        //теряется дробная часть
       System.out.println(a);  
    }
    
   public static void Task6() {
     BigInteger res = BigInteger.valueOf(1);
     BigInteger j = BigInteger.valueOf(1);
       for(int i =1;i<=100;i++){
           j = BigInteger.valueOf(i);
           res = res.multiply(j);
       }
       System.out.println(res);
    }
   
   public static void Task8() {
       /*
       Write a program that reads a string and prints all of its nonempty
        substrings.
       */
        Scanner in = new Scanner(System.in);
        String input = null;
        if (in.hasNextLine()) {
            input = in.nextLine();
        }
                
        for(String tmp : input.split(" ")){
          System.out.println(tmp); 
        }
    }
   
    public static void Task9() {
        
       /*
       Section 1.5.3, “String Comparison” (page 25) has an example of two strings
        s and t so that s.equals(t) but s != t. Come up with a different example
        that doesn’t use substring).
       */
       String greeting = "Hello, World!";
       String location = greeting.replaceAll("Hello, ","");
       System.out.println(location);
       System.out.println(location.equals("World!"));
       System.out.println(location == "World!");
    }
    
    public static void Task10() {
        
       /*
       Write a program that produces a random string of letters and digits by
        generating a random long value and printing it in base 36.
       */
       
       long  rand =(long)(Math.random()*1000000000);
       System.out.println(Long.toString(rand, Character.MAX_RADIX));
    }
    
    public static void Task13() {
        
       /*
        Write a program that prints a lottery combination, picking six distinct
        numbers between 1 and 49. To pick six distinct numbers, start with an
        array list filled with 1...49. Pick a random index and remove the element.
        Repeat six times. Print the result in sorted order..
       */
       int[] lottery = new int[49];
       int[] res = new int[6];
       for(int i = 1;i<=49;i++){
           lottery[i-1]=i;
       }
       for(int i = 1;i<=6;i++){
           int idx = (int)((Math.random()*1000000000)%(49-i));
            res[i-1] = lottery[idx];
            for(int j=idx;j<lottery.length-1;j++){
                lottery[j]=lottery[j+1];
            }
            int[] tmp = new int [lottery.length-1];
            
           System.arraycopy(lottery, 0, tmp, 0, tmp.length);
            lottery = new int[lottery.length-1];
            lottery = tmp;
        }

        bubbleSort(res);
        for(int i = 0;i<6;i++){
            System.out.print(res[i]+" ");
        }
    }
    
    public static void Task14() throws IOException {
        /*
        Write a program that reads a two-dimensional array of integers and determines
        whether it is a magic square (that is, whether the sum of all
        rows, all columns, and the diagonals is the same). Accept lines of input
        that you break up into individual integers, and stop when the user enters
        a blank line. For example, with the input
        
        16 3 2 13
        5 10 11 8
        9 6 7 12
        4 15 14 1
        Blank line)
        your program should respond affirmatively.
        */
        
        Scanner in = new Scanner(System.in);
        String input = null;
        int size = 0;
        int counter = 0;
        int counter2 = 0;
        int [] arr;
        int [][] arrAll = null;
        while (in.hasNextLine()  ) {
            input = in.nextLine();
            if (input.length() == 0){
                 break;
            }
            size = 0;
           for(String tmp : input.split(" ")){
                size++; 
            }
           arr = new int[size];
           if (counter2 == 0){
                arrAll = new int[size][size];
           }
            counter = 0;
            for(String tmp : input.split(" ")){
               arr[counter] = Integer.parseInt(tmp);
               counter++; 
            }
           arrAll[counter2] = arr; 
           counter2++;
           if (counter2 > size ){
               throw new IOException("Incorrect input");
           }
        }
       System.out.println( isMagicSquare(arrAll));
    }

    private static Boolean isMagicSquare(int[][] array){
    int side = array.length;
    int magicNum = 0;
    for(int x = 0; x < side; ++x){
        magicNum += array[0][x];
    }
    int sumD = 0;
    for(int x = 0; x < side; ++x){
        int sumX = 0;
        int sumY = 0;
        for (int y = 0; y < side; ++y){
            sumX += array[x][y];
            sumY += array[y][x];
        }
        sumD += array[x][x];
        if(sumX != magicNum  || sumY != magicNum){
            return false;
        }
    }
    return sumD == magicNum;
}
     
  
    public static void main(String[] args) throws IOException {
        Fundamental_Programming_Structures.Task14();
    }

}
