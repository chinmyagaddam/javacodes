
public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix1[][]={{1,2,3},{4,5,6}};
		int matrix2[][]= {{7,8},{9,10},{11,12}};
		
		if(matrix1[0].length != matrix2.length) {
			System.out.println("matrices cannot be multiplied due to incompatible dimensions");;
		}
		
		int result[][] = new int[matrix1.length][matrix2[0].length];
		
		for(int i=0; i<matrix1.length; i++) {
			for(int j=0; j<matrix2[0].length; j++) {
				for(int k=0; k<matrix1[0].length; k++) {
					result[i][j]=matrix1[i][j]*matrix2[i][j];
				}
				
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
