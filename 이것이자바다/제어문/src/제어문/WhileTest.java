package Á¦¾î¹®;

public class WhileTest {

	public static void main(String[] args) {
		int num1=0;
		int num2=0;
		int count =0;
		while(true) {
			int ran1 = (int)(Math.random()*6+1);
			int ran2 = (int)(Math.random()*6+1);
			num1=ran1;
			num2=ran2;
			if(count==0) {
				System.out.print("("+num1+","+num2+")");
				count++;
			}else {
				
				System.out.print(",("+num1+","+num2+")");
			}
			if(num1+num2 ==5) {
				break;
			}
		}
	}

}
