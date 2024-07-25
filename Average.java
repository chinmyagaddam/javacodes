
public class Average {
	
	public static int calculateAverage(int array[]) {
		int sum=0;
		for(int i=0;i<array.length;i++) {
			sum += array[i];
		}
		int  avg=sum/array.length;
		return avg;
	}
	public static void main(String[] args) {
		int num[]= {2,3,4};
		int avg=calculateAverage(num);
		System.out.println(avg);
	}

}
