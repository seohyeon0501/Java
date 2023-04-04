/**
 * 2022 04 04
 * 강동현
 * 입력받은 숫자만큼 줄수를 반복하면서 직각삼각형 출력
 * #문제분석
 *  -변수 : num, i , j
 * #알고리즘
 * 1. 줄 수 입력 (num)
 * 2. 중첩반복
 * 		while(i<=num) // 줄 반복
 * 		{
 * 		 while(j<=i) // 별 찍기 반복
 * 			별 찍기
 * 		}
 * 
 */
package chapter5;

import java.util.Scanner;

public class NestedLoopTest {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("원하는 숫자를 입력하세요 : ");
        int num =stdin.nextInt();
        int i=1;
        while ( i <= num ) //줄 반복
        {
        	int j =1;
        	while (j <= i) //별 찍기 반복
        	{
        		System.out.print("*");
        		j=j+1;
        	}
        	System.out.println(); //줄 바꿈
        	i=i+1;
        }
	}

}
