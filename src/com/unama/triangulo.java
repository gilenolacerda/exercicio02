package com.unama;

import java.util.Scanner;

public class triangulo {


    public static void main(String[] args) {
        int x, y, z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe tamanho de X");
        x = sc.nextInt();
        System.out.println("Informe tamanho de Y");
        y = sc.nextInt();
        System.out.println("Informe tamanho de Z");
        z = sc.nextInt();

        if ((x < y + z) && (y < x + z) && (z < x + y)) {
            if (x == y && x == z) {
                System.out.println("Triangulo Equilatero");
            } else if ((x == y) || (x == z)) {
                System.out.println("Triangulo Isosceles");
            } else
                System.out.println("Triângulo Escaleno");
        } else {
            System.out.println("Não é um triangulo!");


        }

    }
}
