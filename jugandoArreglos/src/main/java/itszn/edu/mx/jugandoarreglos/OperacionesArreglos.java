
package itszn.edu.mx.jugandoarreglos;

public class OperacionesArreglos {
    public float calcularSuma(float[] num){
        if(num==null)
            return 0f;
        
        float suma=0f;
        //recorrer
        for(int i=0; i<num.length; i++){
            suma = suma + num[i];
        }
        return suma;
    }
    // Método para calcular el promedio
    public float calcularPromedio(float[] num) {
        if (num.length == 0) {
            return 0; // Evita división entre cero
        }
        float suma = calcularSuma(num); // Reutiliza el método de suma
        return suma / num.length;
    }
    // Nueva función para contar los que superan el límite
    public int contarMayoresQue(float[] num, float limite) {
        int contador = 0;
        for (float n : num) {
            if (n > limite) {
                contador++;
            }
        }
        return contador;
    }
    // ✅ Nuevo método: invertir un arreglo
    public float[] invertirArreglo(float[] num) {
        float[] invertido = new float[num.length];
        for (int i = 0; i < num.length; i++) {
            invertido[i] = num[num.length - 1 - i];
        }
        return invertido;
    }
    // ✅ Nuevo método: obtener valores absolutos
    public float[] obtenerAbsolutos(float[] num) {
        float[] absolutos = new float[num.length];
        for (int i = 0; i < num.length; i++) {
            absolutos[i] = Math.abs(num[i]); // Usa Math.abs() para el valor absoluto
        }
        return absolutos;
    }
    
}
