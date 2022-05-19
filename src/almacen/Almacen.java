/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package almacen;

import java.util.Scanner;


public class Almacen {

    
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int[] num = new int[5];
        int[] prom = new int [5];
        int[] sup = new int [5];
        int[] a = new int [5];
        int cont=0;
        int promedio;
        int sum=0;
        int p =0;
        int mes = 28;
        for(int i=0;i<=4;i++){
            cont++;
            System.out.println("Digite las ventas mensuales del almacen"+cont);
            num[i] = leer.nextInt();
            }
         int suma = num[0]+num[1]+num[2]+num[3]+num[4];
        //promedio individual
        prom [0]= (num[0]*6/mes);
        prom [1]= (num[1]*6/mes);
        prom [2]= (num[2]*6/mes);
        prom [3]= (num[3]*6/mes);
        prom [4]= (num[4]*6/mes);
        promedio = suma/6;
        //x6
        for(int u =0;u<=4;u++){
            sup[u]=num[u]*6;
            if(sup[u]>promedio){
                a[u]=sup[u];
            }
        }
        System.out.println("------RESULTADO------");
        System.out.println(" ");
        System.out.println("El promedio de ventas de todos los almacenes es: "+promedio);
        System.out.println(" ");
        for(int u=0; u<=4;u++){
            sum++;
            System.out.println("El promedio de ventas del alamcen "+sum+" es: "+prom[u]);
        }
        System.out.println(" ");
        System.out.println("Promedio de los almacenes que superan al promedio global de venta");
        for(int u = 0; u<=4;u++){
            p++;
            if(a[u]>promedio){
                System.out.println("Almacen "+p+" : "+a[u]);
            }
        }
        
        
        
                
                
                
    }
    
}