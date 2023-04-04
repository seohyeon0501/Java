/**
 * 동전교환 프로그램
 * 입력된 액수만큼500원, 100원, 50원, 10원짜리 동전으로 교환해주는 프로그램 작성
 * 조건1:동전의 총개수를 최소화
 * 조건2:고액의 동전 우선 교환
 */
package chap03;

import java.util.Scanner;

public class OpEx1 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("금액을 입력하세요 :");
		int money = Integer.parseInt(stdin.nextLine()); 
		int[] coins = {500,100,50,10};
		int[] result = new int [coins.length];
		 
		for(int i = 0; i < coins.length ; i++){
		    result[i] += money / coins[i];
		    money = money % coins[i];
		}
		 
		for(int i = 0; i < coins.length ; i++) {
		    if(i != coins.length-1) {
		        System.out.print(coins[i] + "원 : " + result[i] + "개, ");
		    }else {
		        System.out.print(coins[i] + "원 : " + result[i] + "개");
		    }
		}     
		/*
		double var1= a/500;
		double var2= a/100;
		double var3= a/50;
		double var4= a/10;
		
		System.out.println("500=" + var1);
		System.out.println("100=" + var2);
		System.out.println("50=" + var3);
		System.out.println("10=" + var4);
		*/
	}

}
