
package connec4;

import java.util.Scanner;

public class Cells {
    
    public static void printEmptyCells(String [][] myArr){
   
        for(int line = 4;line>-1;line--){
            for (String[] element : myArr) {
                element[line] = " ";
                System.out.print("|" + element[line]);
            }
            System.out.println("|");
        }
    }
    
    public static void printCells(String [][] myArr){
        
           for(int line=0;line<5;line++){
            for (String[] element : myArr) {
                System.out.print("|" + element[line]);
            }
            System.out.println("|");
        }
    }
    public static int chooseCol(String [][]myArr,boolean check,boolean isComputer){
        
        String sign;
        String user;
        if(check==true){
            sign="X";
            user="P1";
        }
        else {
            sign="O";
            user="P2";
        }
        if(isComputer==true)
                user="Computer";
        int column;
        Scanner input = new Scanner(System.in);
        do{
            if(isComputer==true)
                column = (int)(Math.random() * 10-3);
            else{
        System.out.println(user+", Choose Column : ");
        column = input.nextInt();
        column--;
            }
        if(column>-1&&column<7){
           if( myArr[column][0].equals(" ")){
            for(int i=4;i>-1;i--){
                if(myArr[column][i].equals(" ")){
                    myArr [column][i]= sign;
                    break;
                }
            }
        }
           else{
            System.out.println("Full Column!, Choose another one.");
            printCells(myArr);
            if(isComputer==true)
               chooseCol(myArr,check,true);
            else
                chooseCol(myArr,check,false);
               }
              }
        else{
            System.out.println("Invalid column,Try Again.");
            printCells(myArr);
        }
        
        }while(column<0||column>7);
        
        String winner = CheckWinner.winner(myArr,sign,user);
        if(winner.equals(user)){
            System.out.println("Winner is "+user);
            return 1;
        }
       return 0; 
        
    }
        
    }
