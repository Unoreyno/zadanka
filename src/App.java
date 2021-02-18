import java.util.Scanner;

 // import javax.swing.text.Style;

public class App {
    public static void main(String[] args) throws Exception {
        

      Scanner Scanner = new Scanner(System.in);
       
      /*
       //zadanko ze zgadywankiem
      
      boolean s =(false);

      int liczba = (int)(Math.random() * 100);

      System.out.println("Masz 5 prób na zgadnięcie wylosowanej liczby");

      // System.out.println(liczba); 

        int proba = 1;


        while(proba < 6){
          
          System.out.println("To twoja "+proba+" próba, podaj liczbę");
          int zgad = Scanner.nextInt();
          if(zgad < liczba){
            System.out.println("Niestety podałeś za małą liczbę");
          }else if(zgad > liczba){
            System.out.println("Niestety podałeś za dużą liczbę");
          }else if(zgad == liczba){
            s =true; 
            break;
          }
          proba++;
        }

        if(s){
          System.out.println("Brawo, zgadłeś");
        }else{
          System.out.println("Niestety nie zgadłeś, liczba to "+liczba);
        }

      */

    

        
    
        
        
        
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
