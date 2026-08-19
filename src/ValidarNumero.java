import java.util.*;

public class ValidarNumero {
    int numero1, numero2;
    double raiz;

    public void leerNumero() throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el primer número (sin decimales)");
        this.numero1 = sc.nextInt();
        System.out.println("Digite el segundo número (sin decimales)");
        this.numero2 = sc.nextInt();

        validarNumero(this.numero1, this.numero2);
    }

    public void validarNumero(int numero1, int numero2) {

        if(numero1 == numero2){
            System.out.println("Ningún número es mayor, ambos tienen el mismo valor");
        }
        else if (numero1 > numero2){
            System.out.println("El número mayor es el "+numero1);
            raiz = Math.cbrt(numero1);
            System.out.println("La raíz cúbica de "+numero1+" es: "+raiz);
        }
        else {
            System.out.println("El número mayor es el "+numero2);
            raiz = Math.cbrt(numero2);
            System.out.println("La raíz cúbica de "+numero2+" es: "+raiz);
        }
    }
}
