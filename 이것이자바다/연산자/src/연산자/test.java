package 연산자;

import java.io.IOException;

public class test {

	public static void main(String[] args) throws IOException {
		System.out.print("입력 : "); int anum = System.in.read(); System.out.println("출력 : " + anum); // 엔터키를 눌러도 엔터값이 입력되기때문에 이값을 없애줘야 합니다. 두개 써줍시다. // 엔터키를 누를때 아스키코드 13번 값이 입력이되고 개행이 될때 10번이 입력이되기때문입니다. System.in.read(); System.in.read(); // System.in.read()-48 or '0'; == 숫자 System.out.print("입력 : "); int num = System.in.read() - 48; // int num=System.in.read()-'0'; System.out.println("출력 : " + num); System.in.read(); System.in.read(); // (char)System.in.read(); == 문자 System.out.print("입력 : "); char char_ = (char) System.in.read(); // int num=System.in.read()-'0'; System.out.println("출력 : " + char_);

		

	}

}
