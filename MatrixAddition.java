
public class MatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix1[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int matrix2[][]= {{1,3,5},{7,9,2},{4,6,8}};
		
		if(matrix1.length != matrix2.length && matrix1[0].length != matrix2[0].length) {
			System.out.println("Both Matrices dimensions should be same");
		}
		
		int result[][]= new int[matrix1.length][matrix1[0].length];
		
		for(int i=0; i<matrix1.length; i++) {
			for(int j=0; j<matrix1[0].length; j++) {
			   result[i][j] = matrix1[i][j]+matrix2[i][j];
			}
		}
		for(int i=0; i<result.length; i++) {
			for(int j=0; j<result[0].length; j++) {
			   System.out.println(result[i][j]+"");
			}
			System.out.println();
		}
		
		

	}

}
