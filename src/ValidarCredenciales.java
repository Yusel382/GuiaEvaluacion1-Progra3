import java.util.*;

public class ValidarCredenciales {

    String user="PROGRA3";
    String password = "123";
    int intentos = 3;

    Scanner sc = new Scanner(System.in);

    public void leerCredenciales(){
        while(intentos>0){
            System.out.println("Ingrese su usuario");
            String usr = sc.nextLine();
            System.out.println("Ingrese su contraseña");
            String pass = sc.nextLine();
            if (validarCredenciales(usr,pass)){
                System.out.println("Credenciales correctos, bienvenido");
                break;
            }
            else{
                intentos--;
                System.out.println(intentos == 0 ? "Credenciales incorrectos" : "Credenciales incorrectos, intente nuevamente");
            }
        }
        if(intentos==0){
            System.out.println("Ha superado el límite de intentos, intente nuevamente más tarde");
            intentos = 3;
        }
    }

    public boolean validarCredenciales(String usr, String pass){
        return usr.equals(this.user) && pass.equals(this.password);
        }
    }

