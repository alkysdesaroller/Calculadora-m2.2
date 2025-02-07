/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora.cal;


public class calculador {
     public static void main(String[] args) {
       CalculadoraCal Test = new CalculadoraCal();

        // Pruebas de operaciones con dos parametros
        System.out.println("Suma (2 + 3): " + Test.suma(2, 3));
        System.out.println("Resta (10 - 4): " + Test.resta(10, 4));
        System.out.println("Multiplicacion (5 * 6): " + Test.multi(5, 6));
        
        //metodos sobrecargados con mas de 2 parametros.
        System.out.println("Suma (2 + 2 + 7 + 8): "+ Test.sumar(2, 2,7, 8));
        System.out.println("Resta (8 - 90 - 70 - 32): "+ Test.restar(8, 90,70, 32));
        System.out.println("Multiplicacion (9 * 70 * 57 * 57): "+ Test.multiplicar(9, 70, 57, 57));


        try {
            System.out.println("División (10 / 2): " + Test.division(10, 2));
            System.out.println("División (10 / 0): " + Test.division(10, 0)); // Error esperado.
        } catch (ArithmeticException e) {
            System.out.println("Error al dividir: " + e.getMessage());//Imprime el error que esta ocurriendo.
        }
    }
}
