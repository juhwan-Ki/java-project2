package com.example.javaproject.week1.day5;

public class SpaceInvadersMemberVariable {
    int localtion; // 멤버변수
    public void moveLeft(){
        localtion = localtion - 1;
    }

    public void moveRight(){
        localtion = localtion + 1;
        //System.out.println("moveRight : " + localtion);
    }

    public static void main(String[] args) {
        SpaceInvadersMemberVariable si = new SpaceInvadersMemberVariable();
        si.moveLeft();
        si.moveRight();
        si.moveRight();
        si.moveRight();
        si.moveRight();

        System.out.printf("최종 위치 : %d\n", si.localtion);
        si.moveLeft();
        System.out.printf("최종 위치 : %d\n", si.localtion);
    }
}
