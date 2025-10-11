package Practica3;
import java.util.InputMismatchException;
import java.util.Scanner;
public class PE03_Control_Salut {
    public static void main(String[] args) {
       Scanner j = new Scanner(System.in);
       // Variables inicialitzades perquè es puguin llegir abans o després
       String option;
       String name = " ";
       int age = 0;
       boolean sortida = false;
       float weight = 0.0f;
       String pesText = "";
       String heightText = "";
       Float height = 0.0f;
 
        while (!sortida) {
            System.out.println("\n Benvingut al programa sobre el control de la salut general fisica");
            System.out.println("Sisplau escull l'opcio que vols utilitzar: ");
            System.out.println("a) Introduir les dades");
            System.out.println("b) Modificar les dades");
            System.out.println("c) Visualitzar les dades");
            System.out.println("x) Sortir del programa");
            System.out.println("");                  
            option = j.next();
            
            switch (option) {
             case "a": // Introduir dades
                j.nextLine(); // Neteja el buffer del next()

                    // Introduir dades (llegim tot amb nextLine per evitar problemes de buffer)
                    System.out.println("Sisplau introdueix el teu nom complert:");
                    name = j.nextLine();

                    if (name.trim().equals("")) {
                        System.out.println("Error: El nom no pot quedar buit!");
                    } else {
                        System.out.println("Sisplau introdueix la teva edat: ");
                        age = j.nextInt();
                        if (age >= 120)
                        {
                            System.out.println("Error: L'edat ha de ser un enter positiu <=120");
                        } else {
                            System.out.println("Sisplau introdueix el teu pes: ");
                            pesText = j.next().replace(",", ".");
                            weight = Float.parseFloat(pesText);
                            j.nextLine(); // neteja buffer
                            if (weight <= 0 || weight > 400) {
                                System.out.println("Error: El pes ha de ser un decimal positiu raonable.");
                            } else {
                                System.out.println("Sisplau introdueix la teva alçada: ");
                                try {
                                heightText = j.next().replace(",", ".");
                                height = Float.parseFloat(heightText);
                                j.nextLine(); // neteja buffer
                                    if (height < 0.5 || height > 2.5) {
                            System.out.println("Error: L'alçada ha de ser un decimal positiu entre 0.5 i 2.5 metres.");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Error: Format numèric invàlid.");
                        j.nextLine(); // neteja buffer
                    }
                        System.out.println("Dades introduides correctament!");
                
                                    }        
                            }
                        }
                        break;
                case "b": //Modificar dades
                    
                    j.nextLine(); //neteja de buffer

                    System.out.println("Escull quina dada vols modificar:");
                    System.out.println("1. Nom");
                    System.out.println("2. Edat");
                    System.out.println("3. Pes (kg)");
                    System.out.println("4. Alçada (m)");
                    int opcioMod = j.nextInt();
                    j.nextLine();

                    switch (opcioMod) {
                        case 1:
                            System.out.println("Nou nom: ");
                            name = j.nextLine();
                       break;
                        case 2: 
                            System.out.println("Nova edat");
                            age = j.nextInt();
                        break;
                        case 3:
                            System.out.println("Nou pes (kg):");
                            pesText = j.next().replace(",", ".");
                            weight = Float.parseFloat(pesText);
                            j.nextLine();
                        break;
                        case 4:
                            System.out.println(" Nova alçada (m)");
                            heightText = j.next().replace(",", ".");
                            height = Float.parseFloat(heightText);
                            j.nextLine();
                        break;
                    }
                    

                case "c": //Visualitzar dades
                    {   
                        System.out.println("---Dades Introduides---");
                        System.out.println("Nom: " + name);
                        System.out.println("Edat: " + age);
                        System.out.println("Pes: " + weight + " kg");
                        System.out.println("Alçada: " + height + " m");
                    }
                    break;
                case "x": //sortida del bucle
                sortida = true;
                System.out.println("Sortint del programa...");
                default:
                    break;}
        }
    } 
}
        

