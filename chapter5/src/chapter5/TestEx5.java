/**
 * 2023 04 04
 * 강동현
 *  두 숫자를 입력 받아서 두 수 사이의 합계 출력하기
 *  #문제분석
 *  -변수:first, second, total
 *  #알고리즘
 *  1.정수 입력(first,second)
 *  2.선택문(if(first<second))
 *  3.반복문(for (first; second; first++)
 *  			total=total+first
 */
package chapter5;

import java.util.Scanner;

public class TestEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
        System.out.print("first second : ");
        int first =stdin.nextInt();
        int second =stdin.nextInt();
        int temp=0, total=0;
        
        //first는 second 보다 항상 작은 값을 가진다.
        if (first>second)
        {
        	temp=first;
        	first=second;
        	second=temp;
        }
        //반복(first~second까지의 합계)
        while (first<=second)
        {
        	total=total+first;
        	first=first+1;
        }
        System.out.print("first~second total : "+total);

	}

}
