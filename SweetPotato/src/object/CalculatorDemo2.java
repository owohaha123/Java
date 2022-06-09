package object;

public class CalculatorDemo2 {

	// Demo1 에서 중복을 제거한 같은 내용의 코드 (refactoring)
    public static void sum(int left, int right) {
    	System.out.println(left + right);
    }
    
    public static void main(String[] args) {
    	sum(10, 20);
    	sum(20, 40);
    }
}

