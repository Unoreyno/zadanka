import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        

        Scanner Scanner = new Scanner(System.in);
        
        System.out.println("podaj liczbe a");
        int a = Scanner.nextInt();

        Scanner.nextLine();
        System.out.println("podaj znak +, -, /, * lub %");
        String znak = Scanner.nextLine();

        System.out.println("podaj liczbe b");
        int b = Scanner.nextInt();
        
        
        switch(znak){
            case "+":
                System.out.println(a+" + "+b+" = "+(a+b));
            break;
            case "-":
                System.out.println(a+" - "+b+" = "+(a-b));
            break;
            case "*":
                System.out.println(a+" * "+b+" = "+(a*b));
            break;
            case "/":
                System.out.println(a+" / "+b+" = "+(a/b));
            case "%":
                System.out.println("reszta z dzielenia wynosi: "+(a%b));
            break;
            default:

                System.out.println("Podałeś zły znak");
            break;
        }
        
        Scanner.close();
        
        
    } 
}
