package com.unama;

import java.util.Scanner;

public class media_universidade {
    public static void main(String[] args) {
        int faltas;
        double nota;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o Número de faltas");
        faltas = sc.nextInt();
        System.out.println("Informe o sua nota:");
        nota = sc.nextDouble();
        if (nota > 6.0) {
            System.out.println("Você está Aprovado por Media");
        } else {
            System.out.println("Você está em recuperação por Média:");
        }
        if (faltas > 40) {
            System.out.println("Porém você foi Reprovado em faltas");
        }
     }
    }
