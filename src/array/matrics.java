
package array;

public class matrics {
    public static void matrixRow(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <= matrix[i].length - 1; j++) {
//
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void SumMatrix(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <= matrix[i].length - 1; j++) {
                sum += matrix[i][j];

            }

        }
        System.out.println(sum);
    }
 public static void RowSum(int[][] matrix){

        for (int i=0;i<matrix.length;i++){
            int sum=0;
            for (int j=0;j<=matrix[i].length-1;j++){
                sum+=matrix[i][j];
            }

            System.out.println("row : "+sum);
        }
 }
 public static void Symmetric(int[][] matrix){
        boolean found=true;
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                if (matrix[i][j]!=matrix[j][j]){
                   found=false;
                   break;
                }
            }
        }
        if (found){
            System.out.println("symmetric");
        }else{
            System.out.println("asymmetric");
        }
 }
 public  static void ColSum(int[][] matrix){
        for (int j=0;j<matrix.length;j++){
            int colsum=0;
            for (int i=0;i<=matrix.length-1;i++){
                colsum+=matrix[i][j];

            }
            System.out.println("Col : "+colsum);
        }
 }
    public static void Largest(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <= matrix[i].length - 1; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        System.out.println(max);

    }

    public static void main(String[] args) {
        int[][] matrix = {
                {3, 7, 1},
                {9, 2, 6},
                {4, 8, 5}
        };
        matrixRow(matrix);
        SumMatrix(matrix);
        Largest(matrix);
        RowSum(matrix);
        ColSum(matrix);
        Symmetric(matrix);
    }
}
