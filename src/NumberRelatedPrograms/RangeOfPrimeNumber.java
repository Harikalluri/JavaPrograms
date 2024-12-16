package NumberRelatedPrograms;


public class RangeOfPrimeNumber {

	public static void main(String[] args) {
		int count=0;
		for(int i=3;i<=100;i++) {
			int no=i;
			boolean flag=true;
			for(int j=2;j<no;j++) {
				if(no%j==0) {
					flag=false;
					break;
				}
			}
			if(flag) {
				System.out.println(no+" is prime number");
				count++;
			}
		}
		System.out.println(count);
	}
}
