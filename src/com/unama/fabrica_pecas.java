package com.unama;

import java.util.Scanner;

public class fabrica_pecas {
    public static void main(String[] args) {
        int pecas_produzidas, pecas_avariadas;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Informe quantas peças foram produzidas.");
        pecas_produzidas = sc.nextInt();
        System.out.println("Informe quantas peças foram Avariadas. ");
        pecas_avariadas = sc.nextInt();
        if(pecas_avariadas > (pecas_produzidas * 0.1)){
            System.out.println("Maquina precisa de Manutenção!");
        }else{
            System.out.println("Maquina não precisa de Manutenção");
        }

    }
}
