import doodlepad.*;

public class project02 {
  public static void main(String[] args){
    int[][] array = new int[301][601];
    array[0][300] = 1;
    for (int row = 0; row<array.length-1; row++){
      for (int col = 1; col<array[row].length-1; col++){
        int a = array[row][col];
        int b = array[row][col+1];
        int c = array[row][col-1];
        if (c==0 && a==0 && b==1){
          array[row+1][col]=1;
        }
        if (c==0 && a==1 && b==0){
          array[row+1][col]=1;
        }
        if (c==0 && a==1 && b==1){
          array[row+1][col]=1;
        }
        if (c==1 && a==0 && b==0){
          array[row+1][col]=1;
        }

      }
    }
    Image triangle = new Image(0, 0, 601, 301);
      for(int row = 0; row<array.length; row++){
        for(int col= 0; col<array[row].length; col++){
          if(array[row][col] == 1){
            triangle.setPixel (col, row, 0, 0, 0);
          }
      }
    }
  }
}
