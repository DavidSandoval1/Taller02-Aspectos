package main;
import java.util.ArrayList;
import java.util.Scanner;
public class PetStore {

    static ArrayList<User> users = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);
    
    public static void initPetStore(){
    	users.add(new User(1, "Mat", "Juan", "Diamond", true));
        users.add(new User(2, "Rayito", "Dan", "Gold", false));
        users.add(new User(3, "Val", "Andy", "Silver", true));
        users.add(new User(4, "Jor", "Lor", "Platinum", false));
    }

    public static void main(String[] args) {
        int opcion = 0;
        initPetStore();
        while(opcion != 5){
            opcion = menu();
        };

    }
    public static int menu(){
        System.out.println("PetStore - Please enter an option");
        System.out.println("1 - Create pet");
        System.out.println("2 - Make appointment");
        System.out.println("3 - Update status");
        System.out.println("4 - Exit");
        
        int option = Integer.valueOf(readConsole("Opcion"));
        switch (option) {
        case 1:
            System.out.println("Create pet:");
            createUser();
        break;
        case 2:
            System.out.println("Make appointment");
            makeAppointment(); 
        break;
        case 3:
            System.out.println("Update status");
             UpdateLevel();
        break;
        case 4:
        break;
        default:
            System.out.println("Incorrect option");
            break;
        }
        return option;
    }

    public static  String readConsole(String mensaje){
        System.out.println(mensaje);  
        String inputText;
        inputText = input.nextLine();           
        return inputText;
    }

    public static void createUser(){
        String name = readConsole("Name :");
        String owner = readConsole("Owner :");
        String assurance = readConsole("Assurance:");
        
        users.add(new User(users.size(),name,owner,assurance,true));
    }

    public static void makeAppointment(){
    	int id = Integer.valueOf(readConsole("Id:"));
    	String date = readConsole("Date: ");
        users.get(id-1).setAppointment(date);
    }
    
    public static void UpdateLevel(){
        int id = Integer.valueOf(readConsole("Key: "));
        String assurance = readConsole("Membership level: ");
        users.get(id-1).setLevelAssurance(assurance);
    }


}