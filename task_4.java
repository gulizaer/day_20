package day20_for_Each;

import java.util.Arrays;

public class task_4 {
    public static void main(String[] args) {

        int[] numbers = { 100,300,200,100,300,400,500,100,200,600};


        for (int each : numbers) {
            int uniqueNum = 0;

            for (int each2 : numbers) {

                if (each==each2){
                  uniqueNum++;

                }
            }

              if (uniqueNum==1){
                  System.out.println(each);
              }
        }

    }

}
/*
 Write a program that can display the unique elements of an array

			MUST use for each loops

 */