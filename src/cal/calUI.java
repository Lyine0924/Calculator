package cal;

import java.util.Scanner;

public class calUI {
	
	int inop1;
	int inop2;
	String symbol;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

        System.out.println("화면에 숫자를 입력하세요.");

        int inop1 = s.nextInt();
        
        int inop2 = s.nextInt();
        
        cal c1 = new cal();
        
        System.out.println("덧셈 결과 : " + c1.sum(inop1, inop2));
        System.out.println("뻴셈 결과 : " + c1.sub(inop1, inop2));
        System.out.println("곱셈 결과 : " + c1.mul(inop1, inop2));
        System.out.println("나눗셈 결과 : " + c1.div(inop1, inop2));
	}

}
