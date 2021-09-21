package edu.northeastern.rahul;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	int [] arr = {2,7,5,11,15};
    int trag = 9;
    sumTotal(arr,trag);
    }
    public static void sumTotal(int [] arr, int trag){
        for(int i = 1; i <= arr.length-1; i++){
           if((arr[0] + arr[i])/ trag == 1 ){
               System.out.println("num "+ arr[0] + " & " +arr[i] + " is " + trag );
               return;
           }
           else
               if(i >= arr.length-1)
                   System.out.println("sum no. not present");
        }
    }
}
