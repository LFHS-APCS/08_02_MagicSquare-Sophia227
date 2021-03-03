
/**
 * @author 
 * @version 
 */

public class MagicSquare
{
    /** The magic square array data */
    private int[][] array;

    /**
     * Constructs a MagicSquare object.
     * @param input the magic square array data.
     */
    public MagicSquare(int[][] input)
    {
        array = input;
    }

    /**
     * Tests to see if array is indeed a magic square
     * @return true if array is a magic square
     * @return false if the array is not a magic square
     */
   public boolean isMagicSquare()
    {
       constant = 0;
       for (int row =0; row <array.length;row++){
        if (array[row].length != array.length){
          return false;
        }
      }
      for (int i =0; i < array.length; i++){
         constant += array[i][0];
      }
      if (!checkRow()){
        return false;
      } 
      if (!checkCol()){
        return false;
      }
      if (!checkDiagonal()){
        return false;
      }
    
      
      return true;
    
    }
           // complete this method

      public boolean checkRow() {
        for (int row = 0; row<array.length; row++){
          int sum = 0;
          for (int m =0; m< array[row].length;m++){
              sum += array[row][m];
          }
          if (sum != constant)
             return false;
          }
          return true;
      }
       public boolean checkCol() {
        for (int i = 0; i<array[0].length; i++){
          int sum = 0;
          for (int row =0; row< array.length;row++){
              sum += array[row][i];
          }
          if (sum != constant)
             return false;
          }
          return true;
      }
      public boolean checkDiagonal(){
        int sum = 0;
        for(int a=0; a< array.length; a++){
           sum += array[a][a];
          } 
      if (sum != constant){
        return false;
      }
      int col = array.length-1;
      int sum2 = 0;
     for(int b=0; b< array.length; b++){
         sum2 += array[b][col];
         col--;
       }
       if (sum2 != constant){
        return false;
      }
      return true;
    }
    /**
     * Returns a String which represents the array.
     */
    public String toString()
    {
        String result = "";
        for(int r = 0; r < array.length; r++)
        {
            for(int c = 0; c <array[r].length; c++)
            {
                result += array[r][c];
                result += "\t";
            }
            result += "\n";
        }
        return result;
    }
}
