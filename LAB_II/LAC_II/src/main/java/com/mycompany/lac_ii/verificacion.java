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
public class verificacion {

    /**
     *
     * @return
     */
    public String verificar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int i = sc.nextInt();
        if( i %2 == 0){
            System.out.println("El numero es par");
            
        }
        else {
            System.out.println("el numero es impar");
        }
        return null;
        
        
        
    }

}