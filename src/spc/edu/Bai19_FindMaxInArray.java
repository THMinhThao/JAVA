/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai19_FindMaxInArray {
    public static void main(String[] args) {
        System.out.println(" NHAP MANG SO NGUYEN 10 PHAN TU ");
                Scanner nhap = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("Nhap 10 so nguyen:");
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print("Phan tu thu " + (i + 1) + ": ");
            arr[i] = nhap.nextInt();
        }

        System.out.println("\nMang da nhap la:");
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i] + " ");
        }
        nhap.close();
    }
}
