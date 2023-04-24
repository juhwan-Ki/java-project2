package com.example.javaproject.week1.day5;

public class SpaceInvader {
    private void moveLeft(){
        int localtion = 0;
        //localtion = -1;
        localtion = localtion - 1; // 위 코드와 똑같이 -1 로만 나옴
        System.out.println("moveLeft = " + localtion);
    }

    private void moveRight() {
        int localtion = 0;
        localtion = 1;
        System.out.println("moveRight = " + localtion);
    }

    public static void main(String[] args) {
        SpaceInvader si = new SpaceInvader();
        si.moveLeft(); // 키보드 왼쪽 키 누르면 실행되는 메소드
        si.moveRight(); // 키보드 오른쪽 키 누르면 실행되는 메소드
    }

}
