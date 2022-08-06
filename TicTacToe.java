import java.util.Scanner;

public class TicTacToe {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        
            System.out.println("\nLet's play tic tac toe");

            char [][] board = {{'_','_','_'},{'_','_','_'},{'_','_','_'}};
            
              printBoard(board);
        

            for (int i = 0; i<9;i++){
                if(i%2 ==0 ){
                System.out.println(" turn :  X");
                int [] spot = askUser(board);
                board[spot[0]] [spot [1]] = 'X';
            }
            else  {
                System.out.println(" turn :  Y");
                 int [] spot = askUser(board);
                 board[spot[0]] [spot [1]] = 'O';

            }
            printBoard(board);
            int count = checkWin(board);
            if (count == 3){
                System.out.println( " X wins");
                break;
            }
            else if (count == -3)
                 {
                    System.out.println( " O  wins");
                    break;
                 }
            
            } 

            scan.close();
        }

          public static void printBoard( char board [] []){
              System.out.println("");

              for (int i = 0; i<board.length; i++){
               for (int j =0;j<board[i].length;j++){
                System.out.print("  " + board[i][j] );

                 }
             System.out.println("");
             System.out.println("");

            }
          }
     
          public static int[] askUser (char[][] board){
             System.out.print( "pick a row and column number : " );
             int row = scan.nextInt ();
             int column = scan.nextInt();
         
           while ( board[row][column] == 'X' || board[row][column] == 'O'){
              System.out.println(" this position is chosen please try another position.");
              row = scan.nextInt ();
              column = scan.nextInt();
             }
            return new int [] {row ,column};
         }
      
          public static int checkWin(char [] [] board ){
             int count = 0;
             for (int i = 0;i< board.length;i++){
             for (int j = 0;j< board[i].length;j++){
               if (board [i][j] == 'X'){
                 count++;
               }
               else if  (board [i][j] == 'O'){
                   count--;
               }
             }
              if (count==3 || count == -3){
                 return count;
               }
              else {
                  count = 0;
              }
            
           }
              for (int i = 0;i<3;i++){
               for (int j = 0; j<board.length;j++){
                 if ( board [j][i] == 'X'){
                   count++;
                 }
                 else if ( board [j][i] == 'O'){
                   count--;
                 }
              }

                if (count==3 || count == -3){
                    return count;
                 }
                 else {
                 count = 0;
                 }
            
            }

            for (int i = 0;i<3;i++){
              if (board[i][i] == 'X'){
                count++;
              }
            else if (board[i][i] == 'O'){
                count--;
            }
           }
            if (count==3 || count == -3){
                   return count;
                }
                else {
                count = 0;
                }
            for( int i =0;i<3 ; i++){
             int rowindex = 2 - i;
            if (board[rowindex] [i] == 'X'){
                count++;
            }
            else if ( board[rowindex] [i] == 'O'){
                count--;
            }

          }
          if (count==3 || count == -3){
                   return count;
                }
                else {
                count = 0;
                }
         
        
         
         return count;
      }

    


}
