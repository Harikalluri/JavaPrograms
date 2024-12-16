package NumberRelatedPrograms;



public class FactorialOfEven {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			
//			it is for even
//			if(i%2==0) {
//				fact(i);
//			}
			
			
//			it is for odd
			if(i%2!=0) {
				fact(i);
			}
		}
	}

	 static void fact(int no) {
		int mul=1;
		for(int i=no;i>=1;i--) {
			mul=mul*i;
		}
		System.out.println(mul);
	}
}
