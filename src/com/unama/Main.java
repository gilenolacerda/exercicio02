package com.unama;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int copias;
        double total_pago;
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas cópias você deseja?");
         copias = sc.nextInt();
        if( copias <= 100){
            total_pago = copias * 0.25;
        }else{
            total_pago = copias * 0.20;

        }
        System.out.println(" O Valor pago pelas cópias são: " +total_pago+ " Volte Sempre!");

    }
}
