package com.unama;

import java.util.Scanner;

public class categoria_nadador {
    public static void main(String[] args) {
        int idade;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a Idade do Nadador(a):");
        idade = sc.nextInt();
        if (idade <= 10) {
            System.out.println("Infantil");
        } else if (idade >10 && idade <= 17){
            System.out.println("Juvenil");
        } else {
            System.out.println("Senior");


        }
    }
}
