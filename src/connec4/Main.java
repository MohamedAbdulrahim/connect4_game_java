
package connec4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
 
        System.out.println("Welcome to connect4");
        Scanner input = new Scanner(System.in);
        boolean isComputer=false ;
        int number;
        do{
                System.out.println("Select game type :\n"
                + "\tPress 1 for \"Player vs. Computer\"\n"
                + "\tPress 2 for \"Player vs. Player\""
                + "\nPress 0 for \"Exit\"");
                
                number = input.nextInt();
                
                if(number==0){
                    System.out.println("Thanks.............");
                    break;
                }
                
        switch (number) {
            case 1:
                    System.out.println("Start game \"Player vs. Computer\"");
                    isComputer = true;
                                     
                break;
            case 2:
                    System.out.println("Start game \"Player vs. Player\"");
                    isComputer =false;
                    
                break;
            default:
                System.out.println("Invalid Choise,\nTry Again.\n...........");
                break;
        }
        StartGame.start(isComputer);
        }while(number!=1&&number!=2);
        
    }
    
}
