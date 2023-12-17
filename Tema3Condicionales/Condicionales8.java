/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AprendeConJava.Tema3Condicionales;
import java.util.Scanner;

/**
 *Ejercicio 8
Amplía el programa anterior para que diga la nota del boletín (insuficiente,
suficiente, bien, notable o sobresaliente).
 * @author angelaruiz
 */
public
        class Condicionales8 {
  public static
          void main(String[] args) {
   System.out.println("Ingrese su primera nota");
    Scanner sc = new Scanner (System.in);
    double nota1=sc.nextDouble();
    System.out.println("Ingrese su segunda nota");
    Scanner sc2 = new Scanner(System.in);
    double nota2=sc2.nextDouble();
    System.out.println("Ingrese su tercera nota");
    Scanner sc3 = new Scanner (System.in);
    double nota3=sc3.nextDouble();
    
    double media= (nota1+nota2+nota3)/3; 
    
    if (media<5) {
      System.out.printf("Su media %.1f es insuficiente", media);
       }
    if (media>=5 && media<6){
       System.out.printf("Su media %.1f es suficiente", media);   
          }
    if (media>=6&&media<=7){
       System.out.printf("Su media %.1f es bien", media);
    }
    if(media>=8&& media<9){
       System.out.printf("Su media %.1f es notable", media);
    }
    if(media>=9&& media<=10){
       System.out.printf("Su media %.1f es sobresaliente", media);
    }
    
          }
  }
  

