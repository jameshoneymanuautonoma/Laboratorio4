/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculador;


//@author James Honeyman

import java.util.*;        
public class Operaciones {

    Scanner leer = new Scanner(System.in);
    private int num1;
    private int num2;

    public Operaciones(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getnum1() {
        return num1;
    }

    public void setnum1(int num1) {
        this.num1 = num1;
    }

    public int getnum2() {
        return num2;
    }

    public void setnum2(int num2) {
        this.num2 = num2;
    }

    public int Excepcion() {
        int n = 0;
        int bandera;
        do {
            try {
                System.out.print("Ingrese un numero: ");
                n = leer.nextInt();
                if (n >= 0) {
                    bandera = 1;
                } else {
                    System.out.println("El numero debe ser positivo,intentelo nuevamente");
                    bandera = 0;
                }
            } catch (Exception e) {
                leer.next();
                System.out.println("Error,Ingrese correctamente los datos ");
                bandera = 0;
            }

        } while (bandera == 0);
        return n;
    }

    public int Validar() {
        if (num1 != num2) {
            return 1;
        } else {
            return 0;
        }
    }

    public int Suma() {
        int suma = num1 + num2;
        return suma;
    }

    public int Resta() {
        int resta = num1 - num2;
        return resta;
    }

    public int Multi() {
        int multi = num1 * num2;
        return multi;
    }

    public void Division() {
        int division;
        try {
            division = num1 / num2;
            System.out.println("El resultado es: " + division);
        } catch (Exception e) {
            System.out.println("Error,No se puede dividir por 0");
        }
    }

    public void Palindrome(String s, int inicio, int fin) {
        if (inicio >= fin) { //si terminan siendo las misma palabras,quiere decir que corresponde a un palindrome,por ejemplo "Ana"
            System.out.println("Es un palindrome");
        } else if (s.charAt(inicio) == s.charAt(fin)) { //charAt,devuelve un número indicando el valor Unicode del carácter en el índice proporcionado
            Palindrome(s, inicio + 1, fin - 1);
        } else {
            System.out.println("No es Palindrome");
        }
    }

}
