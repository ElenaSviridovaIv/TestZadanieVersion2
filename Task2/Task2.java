import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class Task2 {
    
public static void main(String[] args) throws IOException {
    File CentrRadius = new File(args[0]);
       // ("C:\\Users\\USER\\Documents\\NetBeansProjects\\Task2\\src\\main\\java\\CentrRadius.txt"); 
        
    File Tochka = new File(args[1]);
          //  "C:\\Users\\USER\\Documents\\NetBeansProjects\\Task2\\src\\main\\java\\Tochka.txt");
            
    
  BufferedReader br1 = new BufferedReader(new FileReader(CentrRadius));
  BufferedReader br2 = new BufferedReader(new FileReader(Tochka));
  
  String Line1;
  String nullLine = "";
  //координаты центра
  double[] CR = new double[2] ;
  double CRa;
  double CRb;  
  //радиус окружности
  double R0;
  
  while ((Line1 = br1.readLine()) != null) 
        {
            nullLine = nullLine + Line1 + " ";
        }
    String[] nullLineSpl = nullLine.split(" ");

    
    for (int i = 0; i < 2; i++) {
        CR[i] = Double.parseDouble(nullLineSpl[i]);
        //CRb[1] = Double.parseDouble(nullLineSpl[1]);
    }
        R0 = Double.parseDouble(nullLineSpl[2]);
CRa = CR[0];
CRb = CR[1];
    //--------------------------------------------------------
String Line2;

double[] TO = new double[2] ;
String[] Tochka0; 
double TOx;
double TOy;
double R2;
double R1;
while ((Line2 = br2.readLine()) != null) {
    Tochka0 = Line2.split(" ");
    for (int i = 0; i < 2; i++) 
    {  TO[i] = Double.parseDouble(Tochka0[i]);  }
    TOx = TO[0];
    TOy = TO[1];
    
   //------------------------------------------------------------
R2 = R0*R0; 
R1 = (TOx-CRa)*(TOx-CRa)+(TOy-CRb)*(TOy-CRb);
 //задаем условие           
if (R2 == R1)          {System.out.println("Находится на окружности (0)");
   } else if (R2 > R1) {System.out.println("Находится внутри окружности (1)");
   } else if (R2 < R1) {System.out.println("Находится снаружи окружности (2)");
            }
        }
        br1.close();
        br2.close();
    }
}
            



   


    
  
            
        
  

    
  



 