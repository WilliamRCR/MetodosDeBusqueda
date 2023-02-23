/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.william.busquedas.busquedas;

import java.util.Scanner;

/**
 *
 * @author William
 */
public class Busquedas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion, buscar, posicion;
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println("Seleccione el metodo de busqueda");
        System.out.println("1. Busqueda lineal");
        System.out.println("2. Busqueda Binaria");
        
        opcion = sc.nextInt();
        switch(opcion){
            case 1 -> {
                System.out.println("Escriba el elemento que busca");
                buscar = sc.nextInt();
                posicion = busquedaLineal(arr, buscar);
                System.out.println(" El elemento se encuentra en la posicion: " +posicion);
            }
            
            case 2 -> {
                System.out.println("Escriba el elemento que busca");
                buscar = sc.nextInt();
                posicion = busquedaBinaria(arr, buscar);
                System.out.println(" El elemento se encuentra en la posicion: " +posicion);
            }
        }
        
        
        
    }
    
     public static int busquedaLineal(int[] arr, int x){
            int n = arr.length;
            for(int i =0; i < n; i++){
                if(arr[i] == x){
                    return i;
                }
            }
            return -1;
        }
     
     
     public static int busquedaBinaria(int [] arr, int x){
         int menor = 0;
         int mayor = arr.length - 1;
         while(menor <= mayor){
             int medio = (menor + mayor) / 2;
             if(arr[medio] == x){
                 return medio;
             }else if (arr[medio] < x){
                 menor = medio + 1;
             }else{
                 mayor = medio + 1;
             }
         }
         return -1;
     }
}
