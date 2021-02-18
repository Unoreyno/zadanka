import java.util.Scanner;

 // import javax.swing.text.Style;

public class App {
    public static void main(String[] args) throws Exception {
        

      Scanner Scanner = new Scanner(System.in);
       
      

          System.out.println("Podaj nazwę województwa");
          
          System.out.println(szukanie(Scanner.nextLine()));


          
          
        
        
          Scanner.close();
    
    }
  


    static String szukanie( String woj ){

    
    boolean istnieje = false;
    String[][] miasta = {
      {"Slask","Katowice"},
      {"Wielkopolska","Poznań"},
      {"Malopolska","Kraków"},
      {"Mazowieckie","Warszawa"},
      {"Lodzkie","Łódź"}
    };

    int i = 0;
        
    while(i < miasta.length){
     // System.out.println(miasta[i][0]);
    
      if(woj.equals(miasta[i][0])){
         // System.out.println(miasta[i][0]);
        istnieje = true;
        break;
      }
      i++;
    
    
    }
    
          
    if(istnieje){
      return "Stolica tego Województwa to: "+miasta[i][1];
    }else return "Podanego Województwa nie ma na liście";
    }
}
