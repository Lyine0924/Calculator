package cal;

import java.util.Scanner;

public class cal {
	private int op1;
	private int op2;
	private String symbol="";
	private int result = 0;
	
	public int getFirstValue(Scanner scanner){
		//this.op1 = scanner.nextInt();
		return scanner.nextInt();
	}
	
	public int getSecondValue(Scanner scanner){
		//this.op2 = scanner.nextInt();
		return scanner.nextInt();
	}
	
	public String getSymbol(Scanner scanner){
		//this.symbol=scanner.next();
		return scanner.next();
	}
	
	public int Calculate(String symbol,int first,int second){
		switch(symbol){
			case "+" :{
				this.result = first + second;
				break;
			}
			case "-" : {
				this.result = first - second;
				break;
			}
			case "*" : {
				this.result = first * second;
				break;
			}
			case "/" : {
				if(second==0)
				{
					System.out.println("0으로 나눌 수 없습니다.");
				}
				else
					this.result = first / second;
					break;
			}
		}
		return result;
	}
	
	public void print(int result){
		System.out.println("연산결과 : " + result);
	}
/*	public int sum(int op1, int op2){
		result = op1 + op2;
		return result;
	}
	public int sub(int op1,int op2){
		result = op1 - op2;
		return result;
	}
	public int mul(int op1,int op2){
		result = op1 * op2;
		return result;
	}
	public int div(int op1, int op2){
		if(op2==0){
			System.out.println("계산오류");
			return 0;
		}
		else{
			result = op1/op2;
			return result;
		}
	}*/
}
