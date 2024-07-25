
public class TransposeOfaMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix[][]={{1,2,3},{3,4,5},{7,8,6}};
		
		int rows=matrix.length;
		int cols=matrix[0].length;
		
		int transpose[][]=new int[rows][cols];
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				transpose[j][i]=matrix[i][j];
				
			}
		}
		
		System.out.println("original matrix");
		displayMatrix(matrix);
		
		System.out.println("transpose matrix");
		displayMatrix(transpose);
		
	}
		
		public static void displayMatrix(int matrix[][]) {
			for(int i=0; i<matrix.length; i++) {
				for(int j=0; j<matrix[0].length; j++) {
					System.out.println(matrix[i][j]+"");
					
				}
			System.out.println();
		}
		

	}

}

