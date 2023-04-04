/**
 * 3항 연산
 */
package chap03;
import java.util.Scanner;
public class Ternary0p {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.print("Enter number:");
		int a=stdin.nextInt();//첫번째 정수 저장
		
		boolean flag;
		flag=(a%2==0)?true:false;
		System.out.print(a+"이 짝수인가?:");
		System.out.print(flag);
	}

}
