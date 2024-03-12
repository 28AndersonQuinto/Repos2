/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lac_ii;

import java.util.Scanner;

/**
 *
 * @author sotoa
 */
public class par {
    public String impar(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("ingrese un numero");
        int numero = scanner.nextInt();
        if(numero % 2 == 0){
            System.out.println(numero + "es par");
        }else{
            System.out.println(numero + "es impar");
        }
        return null;//agregando cambios
    }
    
}
