package cal;

public class cal {
	private int op1;
	private int op2;
	private int result = 0;
	
	public int sum(int op1, int op2){
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
	}
}
