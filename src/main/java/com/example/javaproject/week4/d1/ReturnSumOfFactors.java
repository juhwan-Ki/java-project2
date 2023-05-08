package com.example.javaproject.week4.d1;

public class ReturnSumOfFactors {
    // 약수의 합을 리턴하는 메소드
    int sumOfFactors(int num) {
        // num % i == 0 이면 약수
        // 12 --> 1, 2, 3, 4, 6, 12
        int answer = 1;
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) answer += i;
        }
        return answer;
    }

    void printResult(int num){
        System.out.printf("%d의 약수의 합은 %d입니다.\n", num, sumOfFactors(num));
    }

    public static void main(String[] args) {
        ReturnSumOfFactors rs = new ReturnSumOfFactors();
        rs.printResult(12);
        rs.printResult(34);
        rs.printResult(20);
        rs.printResult(11);
        rs.printResult(77);
    }
}
