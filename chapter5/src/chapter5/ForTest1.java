/**
 * 2022 04 04
 * 강동현
 * 입력받은 숫자의 약수를 출력하는 프로그램
 * #문제분석
 *  -변수 : num, i
 * #알고리즘
 * 1. 약수를 구할 숫자 입력(num)
 * 2. 복합논리(반복문 안에 선택문 포함)
 * 	  for(i=1;i<num;i++)
 * 	  {
 * 		if(num%i==0)
 * 		{
 * 		  i를 출력
 * 		}
 */
package chapter5;

import java.util.Scanner;

public class ForTest1 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num = stdin.nextInt();
        System.out.print(num + "의 약수 : ");
        for (int i = 1; i <= num ; i++)
        {
        	if (num % i == 0)
                System.out.print(i+ " ");

        }
	}

}
