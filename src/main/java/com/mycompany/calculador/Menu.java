/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.calculador;

/**
 *
 * @author james Honeyman
 */
import java.util.Scanner;

public class Menu
{
    int salida = 0;
    int op;
    Operaciones n = new Operaciones(0, 0);
    Scanner leer = new Scanner(System.in);

    public void Menu() {
        while (salida == 0) {
            System.out.println("1- Sumar");
            System.out.println("2- Restar");
            System.out.println("3- Multiplicar");
            System.out.println("4- Dividir");
            System.out.println("5- Palindrome");
            System.out.println("6- Finalizar");
            int bandera = 0;
            while (bandera == 0) {
                op = n.Excepcion();
                if (op > 0 && op < 7) {
                    bandera = 1;
                } else {
                    System.out.println("Ingrese nuevamente una opcion valida");
                }
            }
            if (op == 6) {
                System.out.println("Cerrando....Hasta Pronto!!!");
                salida = 1;
                
            } else if (op == 1) {
                System.out.println("======  Suma  ======");
                n.setnum1(n.Excepcion());
                n.setnum2(n.Excepcion());
                if (n.Validar() == 1) {
                    System.out.println("El resultado es: " + n.Suma());
                } else {
                    System.out.println("No se puede realizar la suma de los numeros ingresados");
                }
                
            } else if (op == 2) {
                System.out.println("======  Resta  ======");
                n.setnum1(n.Excepcion());
                n.setnum2(n.Excepcion());
                if (n.Validar() == 1) {
                    System.out.println("El resultado es: " + n.Resta());
                } else {
                    System.out.println("No se puede realizar la resta de los numeros ingresados");
                }
                
            } else if (op == 3) {
                System.out.println("======  Multiplicacion  ======");
                n.setnum1(n.Excepcion());
                n.setnum2(n.Excepcion());
                if (n.Validar() == 1) {
                    System.out.println("El resultado es: " + n.Multi());
                } else {
                    System.out.println("No se puede realizar la multiplicacion de los numeros ingresados");
                }
                
            } else if (op == 4) {
                System.out.println("======  Division  ======");
                n.setnum1(n.Excepcion());
                n.setnum2(n.Excepcion());
                if (n.Validar() == 0) {
                    System.out.println("No se puede realizar la division de los numeros ingresados");
                } else {
                    n.Division();
                }
                
            } else if (op == 5) {
                System.out.println("======  Palindrome  ======");
                System.out.print("Ingrese la palabra y sin tildes: ");
                String s = leer.nextLine();
                s = s.toLowerCase();
                s = s.replaceAll(" ", "");
                int inicio = 0;
                int fin = s.length() - 1;
                n.Palindrome(s, inicio, fin);

            }
        }
    }
}
