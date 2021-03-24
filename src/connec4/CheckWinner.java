
package connec4;
import static java.lang.Math.abs;
public class CheckWinner {
    
    public static String winner(String [][] myArr,String sign,String user){
        
           for(int col=0;col<myArr.length;col++){
            for(int line=0;line<myArr[col].length;line++){
             if(myArr[col][line].equals(sign)&&myArr[abs(1-col)][line].equals(sign)&&myArr[abs(2-col)][line].equals(sign)&&myArr[abs(3-col)][line].equals(sign))
                 return user;
             
             
             else if(myArr[col][line].equals(sign)&&myArr[col][abs(line-1)].equals(sign)&&myArr[col][abs(line-2)].equals(sign)&&myArr[col][abs(line-3)].equals(sign))
                 return user;
             else if(myArr[col][line].equals(sign)&&myArr[abs(col-1)][abs(line-1)].equals(sign)&&myArr[abs(col-2)][abs(line-2)].equals(sign)&&myArr[abs(col-3)][abs(line-3)].equals(sign))
                 return user;

             
    
            }
            }
        return "";
        }
           
    }

