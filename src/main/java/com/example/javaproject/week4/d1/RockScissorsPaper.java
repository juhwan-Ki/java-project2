package com.example.javaproject.week4.d1;

import java.util.Scanner;

public class RockScissorsPaper {

    public int getRandomNumber(){
        return (int)(Math.random() * 3);
    }

    public boolean getResult(int num){
        int result = num - getRandomNumber();
        System.out.println(getRandomNumber());
        return switch (result) {
            case -1 -> true;
            default -> false;
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RockScissorsPaper rsc = new RockScissorsPaper();

        while (true){
            System.out.print("가위(1) 바위(0) 보(2)중 하나를 입력해주세요 : ");
            int input = sc.nextInt();
            if(input < 0 || input > 2){
                System.out.println("숫자를 잘못 입력하셨습니다. 다시 입력해주세요.");
                continue;
            }
            boolean flag = rsc.getResult(input);

            if(flag){
                System.out.println("win");
                return;
            } else {
                System.out.println("이기지 못하였습니다. 다시 시도해주세요");
            }
        }
    }
}
