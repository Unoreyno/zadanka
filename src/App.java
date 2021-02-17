import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        

        Scanner Scanner = new Scanner(System.in);
        
        int wynik = 0;
         // Zadeklaruj wartości
      String[][] dane = {
        {"Więcej niż jedno zwierzę","stado","klucz","dwa","owca","lama"},
        {"Sporty na s","sztafeta","skok o tyczce", "skoki narciarskie", "sumo", "szachy"}
      };

      // zadeklaruj wynik
      
      // Pętla wykonująca się tyle razy, ile jest pytań
      for(int i = 0; i < dane.length; i++){
        
        // Wyświetl pytanie (pierwszy element każdej tablicy)
        System.out.println(dane[i][0]); 
        
        // pobierz odpowiedź
        String odp = Scanner.nextLine(); 
        boolean correct = false;
        // Pętla sprawdzająca odpowiedzi 
        for(int it = 1; it < dane[i].length; it++){

            
        
          
          // System.out.println("ODP: "+dane[i][it]); // Wyświetl każdą odpowiedź

          // Sprawdź, czy odpowiedź użytkownika znajduje się w tablicy
          // dodaj punkty do wyniku
            if(odp.equals(dane[i][it])){

                System.out.println("BRZDĘK");
                correct = true;
                wynik += it*10;
              
            }


          }

          
        if(!correct){
            System.out.println("X");
        }else{

        }
        
    }
    System.out.println("Wynik to: "+wynik); // wyświetl wynik
      
        
    Scanner.close();
        
        
    } 
}
