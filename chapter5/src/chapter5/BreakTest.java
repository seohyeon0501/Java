/**
 * 2022 04 04
 * 강동현
 * 숫자를 반복적으로 입력 받아서 정수의 합이 1000이상이 되면 1000을 넘은 수와 평균을 출력
 * #문제분석
 *  -변수 : num
 * #알고리즘
 * 1. 
 * 2.
 */
package chapter5;

import java.util.Scanner;

public class BreakTest {

	public static void main(String[] args) {
		while (true)
		Scanner stdin = new Scanner(System.in);
        System.out.print("정수 입력 (1000이상이 될때까지 입력) : ");
        int num = stdin.nextInt();
        int i;
        
        for (i=1;1000 < num ; i++)
        {
        	if (num>1000)
                System.out.print(i+ "1000을 넘은 수 ");

        }
	}

}
