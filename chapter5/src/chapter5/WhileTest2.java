/**
 * 2022 04 04
 * 강동현
 * 입력받은 숫자의 팩토리얼 구하기
 * #문제분석
 *  --변수 :fac,facvalue
 * #알고리즘
 * 1. 팩토리얼 구할 수 입력(fac)
 * 2. 반복문
 * while(fac>1)
 *   {
 *    facvalue=fac을 1씩 감소하면서 곱하기
 * 3.결과출력
 */
package chapter5;

import java.util.Scanner;

public class WhileTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
        System.out.print("input number : ");
        int fac =stdin.nextInt();
        int facvalue=fac;
        
        while(fac>1)
        {
            System.out.print(fac+"*");
            facvalue *= --fac;
            
            
        }
        System.out.print("1="+ facvalue);
	}

}
