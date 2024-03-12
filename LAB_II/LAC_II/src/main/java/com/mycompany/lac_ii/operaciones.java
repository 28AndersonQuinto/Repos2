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
public class operaciones {
    
    int suma (){
    Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();
        return num1 + num2;
    
    }
    int resta (){
    Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();
        return num1 - num2;
    
    }
    int multiplicacion (){
    Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();
        return num1 * num2;
    
    }
    int division (){
    Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();
        return num1 / num2;
    
    }
    
    
}
