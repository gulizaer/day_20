package day20_for_Each;

import java.util.Arrays;

public class task_1 {
    public static void main(String[] args) {
        int[] numbers= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        int evenNum=0;
        int oddNum=0;

        for (int each : numbers) {
            if (each % 2 ==0){
                evenNum++;
            }else {
                oddNum++;
            }

        }
        System.out.println("has " + evenNum + " even number. and has " + oddNum + " odd number.");
    }
}
/*
 Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop
 */