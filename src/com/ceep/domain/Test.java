package com.ceep.domain;



 
public class Test {
    
    public static void main(String[] args) {
         Empleado E1=new Empleado(35000, "Luis", 'M', 32, "Puerta del Ángel, 31");
         System.out.println("Empleado 1");
         System.out.println("----------");
         System.out.println(E1);
         
         System.out.println("\n\nEmpleado 2");
         System.out.println("------------");
         Empleado E2=new Empleado("Pepe", 22000);
         System.out.println(E2);

         
      }
}
