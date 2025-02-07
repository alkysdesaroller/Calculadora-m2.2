
package calculadora.cal;

public class CalculadoraCal {

//metodos con 2 parametros    
    public int suma(int num1, int num2 ){
    
        return num1 + num2;
    }
    
    public int resta(int num1, int num2){
    
        return num1 - num2;
    }
    
    public int multi(int num1, int num2){
    
        return  num1 * num2; 
    }
    
    public int division(int num1, int num2){
    
        if (num2 == 0)//valida que el segundo valor no sea 0 
        {
            throw new ArithmeticException("No se puede hacer una division entre 0");
        }
        return num1 / num2;
    }
    
      // Métodos sobrecargados con tres parámetros
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    public int restar(int a, int b, int c) {
        return a - b - c;
    }

    public int multiplicar(int a, int b, int c) {
        return a * b * c;
    }
    
    // Métodos sobrecargados con cuatro parámetros
    public int sumar(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public int restar(int a, int b, int c, int d) {
        return a - b - c - d;
    }

    public int multiplicar(int a, int b, int c, int d) {
        return a * b * c * d;
    }
}
