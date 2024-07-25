
public class SumOfDigits {
	public static int sumOfDigits(int num) {
		int sum=0;
		while(num!=0) {
		int digit=num%10;
		sum += digit;
		num = num/10;
	}
		return sum;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123;
		int sum=sumOfDigits(num);
		System.out.println(sum);

	}

}
