package io.github.hanchaa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, cnt = 0;

        while(true){
            System.out.print("점수? ");
            int num = sc.nextInt();

            if(num < 0) break;

            cnt++;
            sum += num;
        }

        System.out.println("평균 = " + (double)sum / cnt);
    }
}
