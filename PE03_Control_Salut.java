package Practica3;
import java.util.InputMismatchException;
import java.util.Scanner;
public class PE03_Control_Salut {
    public static void main(String[] args) {
       Scanner j = new Scanner(System.in);
       String option;
       String name;
       int age;
       boolean sortida = false;
       float weight;
       String pesText = "";
       String heightText = "";
       Float height;
 
        while (!sortida) {
            System.out.println("\n Benvingut al programa sobre el control de la salut general fisica");
            System.out.println("Sisplau escull l'opcio que vols utilitzar: ");
            System.out.println("a) Introduir les dades");
            System.out.println("b) Modificar les dades");
            System.out.println("c) Visualitzar les dades");
            System.out.println("");                  
            option = j.next();
            
            switch (option) {
             case "a": // Introduir dades
             if (sortida = false)
                j.nextLine(); // Neteja el buffer del next()
                j.nextLine(); // Neteja el buffer del next()
                
                    System.out.println("Sisplau introdueix el teu nom:");
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
                
                                    }        
                            }
                        }
                        break;
                case "b": //Modificar dades
                if (sortida = false)
                    
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

                case "x": //sortida del bucle
                sortida = true;
                System.out.println("Sortint del programa...");
                default:
                    break;}
        }
    } 
}
        

