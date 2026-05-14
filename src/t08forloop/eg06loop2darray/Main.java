package t08forloop.eg06loop2darray;

public class Main {
  public static void main(String[] args) {
    
    int[][] matrix = {
      {1, 2, 3},
      {4, 5, 6},
    };

    for (int r = 0; r < matrix.length; r++) {
      for (int c = 0; c < matrix[r].length; c++) {
        System.out.println(matrix[r][c]);
      }
    }
  }
}
