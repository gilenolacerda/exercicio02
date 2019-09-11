package com.unama;

import java.util.Scanner;

public class numero_maior {
    public static void main(String[] args) {
        int numero1, numero2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        numero1 = sc.nextInt();
        System.out.println("Digite o segundo número");
        numero2 = sc.nextInt();
        if(numero1 > numero2){
            System.out.println("Número:"+numero1+" é maior que:"+numero2);
        }else{
            System.out.println("Número:"+numero2+" é maior que:"+numero1);
        }


    }
}
