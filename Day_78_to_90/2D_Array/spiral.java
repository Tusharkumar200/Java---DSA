public class spiral {

  public static void printspiral(int matrix[][]){

    int startRow = 0;
    int startCol = 0;
    int endRow = matrix.length-1;
    int endCol = matrix[0].length-1;

    while(startRow <=endRow && startCol <= endCold){
      // Top
      for (int j =startCol;j <=endCol; j++) {
        System.out.println(matrix[startRow] [j]+" ");
      }

      
      // Rigth
      for (int i=startRow+1;i<=endRow; i++) {
        System.out.println(matrix[i] [endCol]+" ");
      }
    // bottom
    for(int j=endCol-1; j>=startCol;j--){
      System.out.println(matrix[endRow][j]+" ");
    }

    // left
    for (int i = endRow-1; i > startRow+1; i--) {
      System.out.println(matrix[i][startCol] +" ");
    }

    }
    }
  public static void main(String[] args) {
    int matrix[][] = {
      {1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
  }
}
