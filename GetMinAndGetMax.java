
public class GetMinAndGetMax {
		
		public static int getMin(int array[]) {
			int minValue=array[0];
			for(int i=1;i<array.length;i++) {
				if(array[i]<minValue)
					minValue=array[i];
			}
			return minValue;
		}
		public static int getMax(int array[]) {
			int maxValue=array[0];
			for(int i=1;i<array.length;i++) {
				if(array[i]>maxValue)
					maxValue=array[i];
			}
			return maxValue;
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {1,2,5,3,6,9,4};
		int min=getMin(num);
		int max=getMax(num);
		
		  System.out.println("min value:"+min);
		  System.out.println("max value:"+max);

	}
	

}
