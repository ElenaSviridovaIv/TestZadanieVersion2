package com.mycompany.task4;
 
import java.io.IOException;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;


public class Task4 {
    
    public static void main(String[] args) throws IOException {

    File file = new File(args[0]);
      //для проверки вычислений
      //File file = new File("C:\\Users\\USER\\Documents\\NetBeansProjects\\Task4\\src\\main\\java\\com\\mycompany\\task4\\file.txt");

      BufferedReader br = new BufferedReader(new FileReader(file));

        String Line;
        String nullLine = "";

        while ((Line = br.readLine()) != null) 
        {
            nullLine = nullLine + Line + " ";
        }

        String[] nullLineSpl = nullLine.split(" ");

        int[] nums = new int[nullLineSpl.length];
        
        for (int i = 0; i < nullLineSpl.length; i++) 
        {nums[i] = Integer.parseInt(nullLineSpl[i]);}
        
        
 // сортировка в порядке возрастания
        Arrays.sort(nums);  
        
// высчитываем медиану
        int median = nums[nums.length / 2];  

// считаем количество ходов
        int moves = 0;
        for (int number : nums) {
            moves += Math.abs(number - median);}
             
System.out.println("Минимальное количество ходов: " + moves);
    
br.close();
    }
}