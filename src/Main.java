import java.util.*;

public class Main {
    public static void main(String[] args) {
        boolean continuar = true;

        Scanner sc = new Scanner(System.in);
        ValidarNumero validarNumero = new ValidarNumero();
        ValidarCredenciales validarCredenciales = new ValidarCredenciales();
        ValidarAnio validarAnio = new ValidarAnio();

        while (continuar) {
            System.out.println("\nBienvenido al sistema, por favor ingrese el número del programa que desea ejecutar:");
            System.out.println("1. Validar número mayor\n2. Validar credenciales de acceso\n3. Años bisiestos\n4. Salir del sistema");
            int prog = sc.nextInt();

            try {
                switch (prog){
                    case 1:
                        try{
                            validarNumero.leerNumero();
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                            System.out.println("Asegúrese que el dato ingresado sea un número entero");
                        }
                        break;

                    case 2:
                        validarCredenciales.leerCredenciales();
                        break;

                    case 3:
                        try{
                            validarAnio.leerRangoAnios();
                        }  catch (Exception e) {
                            System.out.println(e.getMessage());
                            System.out.println("Asegúrese que el dato ingresado sea un número entero");
                        }
                        break;

                    case 4:
                    continuar = false;
                        break;

                    default:
                        break;
                }
            }

            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println("Asegúrese que el dato ingresado sea un número entero");
            }
        }

    }
}