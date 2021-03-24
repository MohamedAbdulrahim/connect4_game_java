package connec4;
    
public class StartGame {
    
    public static void start(boolean isComputer){
        
      System.out.println("Start Game");      
      String [][] myArr = new String[7][5];   
      Cells.printEmptyCells(myArr);
      int aboutWinner;
      for(int count=0;count<35;count++){
                  
       if(count%2==0){
        
        aboutWinner = Cells.chooseCol(myArr,true,isComputer);
        Cells.printCells(myArr);
        if (aboutWinner==1)
                    break;      
                }
                else{
                
                aboutWinner =Cells.chooseCol(myArr,false,false);
                Cells.printCells(myArr);
                if (aboutWinner==1)
                    break;
                
               }
    }
        System.out.println("Game Over");
    }
}