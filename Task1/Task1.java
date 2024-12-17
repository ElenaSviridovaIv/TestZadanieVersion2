import java.util.Scanner;

public class Task1
{
public static void main(String[] args) {
       
       if (args.length != 2)
   System.out.println("Ошибка, введите два аргумента");
  
   else
   
    //Scanner in = new Scanner (System.in);
            //System.out.println("Введите длину массива (после нажмите Enter)");
            //int n = in.nextInt();
        //System.out.println("Введите длину интервала (после нажмите Enter)");
        //int m = in.nextInt();
        
   {  
       int nn = Integer.parseInt(args [0]);
int mm = Integer.parseInt(args [1]);
 int current = 1;
System.out.print("Полученный путь: ");
//запускаем цикл
do {
    System.out.print(current);
    current = (current + mm - 2) % nn + 1; 
} while (current != 1); } 
   



} }

