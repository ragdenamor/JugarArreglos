/*probando webook*/
package itszn.edu.mx.jugandoarreglos;

public class JugandoArreglos {

    public static void main(String[] args) {
        OperacionesArreglos op=new OperacionesArreglos();
        
        float[] pesos={12f, 45f, -3.5f};
        
        float sum=op.calcularSuma(pesos);
        System.out.println("La suma es "+sum);
        
        float prom = op.calcularPromedio(pesos);
        System.out.println("El promedio es: " + prom);
        
        float limite = 40f;
        int mayores = op.contarMayoresQue(pesos, limite);
        System.out.println("Cantidad de elementos mayores que " + limite + ": " + mayores);
        
         float[] invertido = op.invertirArreglo(pesos);
        System.out.print("Arreglo invertido: ");
        for (float n : invertido) {
            System.out.print(n + " ");
        }
        float[] absolutos = op.obtenerAbsolutos(pesos);
        System.out.print("Arreglo con valores absolutos: ");
        for (float n : absolutos) {
            System.out.print(n + " ");
        }
    }
}
