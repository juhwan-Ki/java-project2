package com.example.javaproject.week1;

import java.util.Scanner;

public class ScannerEx {
    public void readTwoNumbersAndPlus(){
        // 숫자 2개 입력 받기
        Scanner sc = new Scanner(System.in);
        System.out.println("두개의 숫자를 입력하세요. 입력하고 엔터 입력하고 엔터");
        System.out.print("첫번쨰 숫자 : " );
        System.out.println("첫번째 숫자 : " + sc.nextInt() + "입니다." );
        System.out.print("두번째 숫자 : ");
        System.out.println("두번쨰 숫자 : "+ sc.nextInt() + "입니다.");
    }
}
