package cal;

import java.util.Scanner;

public class calUI {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s = new Scanner(System.in);
			int count = 1;
	        System.out.println(count + "번째 입력 값 : ");

	        int op1 = s.nextInt();
	        int result = op1;
	        while(true){
	        	count ++;
	        	System.out.println("연산기호 입력 :");

		        String symbol = s.next();
		        
		        if(symbol.equals("quit")){
		        	System.out.println("최종 결과 값 : " + result);
		        	break;
		        }
		        
		        System.out.println(count +"번째 입력 값 : ");
		        
		        int op2 = s.nextInt();
		        
		        cal c1 = new cal();
		        
		        if(symbol.equals("+")){
		        	result = c1.sum(result, op2);
		        	 System.out.println("덧셈 결과 : " + result);
		        }
		        else if(symbol.equals("-")){
		        	result =  c1.sub(result, op2);
		        	 System.out.println("뻴셈 결과 : " + result);
		        }
		        else if(symbol.equals("*")){
		        	result = c1.mul(result, op2);
		        	System.out.println("곱셈 결과 : " + result);
		        }
		        else if(symbol.equals("/")){
		        	result = c1.div(result, op2);
		        	System.out.println("나눗셈 결과 : " + result);
		        }
		        else {
		        	System.out.println("사친연산 기호가 잘못되었습니다.");
		        }
	        }
	}
}
