package Practica3;
import java.util.InputMismatchException;
import java.util.Scanner;
public class PE03_Control_Salut {
    public static void main(String[] args) {
       Scanner j = new Scanner(System.in);
       String option;
       String name;
       int age;
       Float weight;
       Float height;
    
       System.out.println("\n Benvingut al programa sobre el control de la salut general fisica");
       System.out.println("Sisplau escull l'opcio que vols utilitzar: ");
       System.out.println("a) Introduir les dades");
       System.out.println("b) Modificar les dades");
       System.out.println("c) Visualitzar les dades");
       System.out.println("");
        option = j.next();
        
        switch (option) {
            case "a": // Introduir dades

            case "b": //Modificar dades
            case "c": //Visualitzar dades
            default:
                break;
            
       } 
    }
}
    

