package 연산자;

public class InfinityNaN {

	public static void main(String[] args) {
		
		int x =5;
		double y =0.0;
		
		double z = x/y;
//		double z = x%y;
		
		System.out.println(Double.isInfinite(z));
		System.out.println(Double.isNaN(z));
		
		
//		실수값을 입력받을시 NaN검사를 해야된다 그렇지 않으면 연산시 문제 가능성있다
		if(Double.isInfinite(z)||Double.isNaN(z)) {
			System.out.println("값 산출 불가");
		}else {
			
			System.out.println(z+2);
		}
		
	}

}
