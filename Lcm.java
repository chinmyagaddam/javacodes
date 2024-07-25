
public class Lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=2;
		int num2=5;
		int max=Math.max(num1, num2);
		int lcm=max;
		while(true) {
		if(lcm%num1 == 0 && lcm%num2 == 0) {
			break;
		}
		lcm++;

	}
		System.out.println(lcm);
  }

}
