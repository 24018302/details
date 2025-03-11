/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.details;

/**
 *
 * @author almight
 */
import java.util.Scanner;
public class Details {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String name,surname;
        int age;
                
        System.out.print("Enter  your name : ");
         name=input.nextLine();
        
        System.out.print("Enter  your surname : ");
       surname=input.nextLine();
        
        System.out.print("Enter  your age : ");
        age=input.nextInt();
    }
}
