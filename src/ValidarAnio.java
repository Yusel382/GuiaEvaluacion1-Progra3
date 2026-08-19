import java.util.*;

public class ValidarAnio {

    Scanner sc = new Scanner(System.in);

    public void leerRangoAnios() throws Exception{

        boolean validar = true;

        while(validar){
            System.out.println("Digite el rango de años para validar\nEscriba primero el año menor");
            int anioA = sc.nextInt();
            System.out.println("Ahora escriba el año mayor");
            int anioB = sc.nextInt();
            if(anioA < anioB){
                validar = false;
                validarAnio(anioA, anioB);
            }
            else {
                System.out.println("El segundo año ingresado debe ser mayor que el primero, inténtelo nuevamente\n");
            }
        }

    }

    public void validarAnio(int anioA, int anioB){

        int contador = 0;

        for(int i = anioA; i <= anioB; i++){
            if(i % 4 == 0 && (i % 100 != 0 || i % 400 == 0)){
                if(contador == 0){
                    System.out.println("Los años bisiestos en el rango indicado son los siguientes:");
                }
                System.out.println(i);
                contador++;
            }
        }

        if(contador == 0){
            System.out.println("No hay años bisiestos en el rango ingresado");
        }
    }
}
