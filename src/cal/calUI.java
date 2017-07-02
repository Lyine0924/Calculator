package cal;

import java.util.Scanner;

public class calUI {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

        System.out.println("첫번째 입력 값 : ");

        int op1 = s.nextInt();
        
        System.out.println("사칙연산 입력 값 :");

        String symbol = s.next();
        
        System.out.println("두번째 입력 값 : ");
        
        int op2 = s.nextInt();
        
        cal c1 = new cal();
        
        if(symbol.equals("+")){
        	 System.out.println("덧셈 결과 : " + c1.sum(op1, op2));
        }
        else if(symbol.equals("-")){
        	 System.out.println("뻴셈 결과 : " + c1.sub(op1, op2));
        }
        else if(symbol.equals("*")){
        	System.out.println("곱셈 결과 : " + c1.mul(op1, op2));
        }
        else if(symbol.equals("/")){
        	System.out.println("나눗셈 결과 : " + c1.div(op1, op2));
        }
        else {
        	System.out.println("사친연산이 잘못되었습니다.");
        }
	}

}
