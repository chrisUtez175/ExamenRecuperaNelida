import java.util.Scanner;

public class validarContraseña {
 
    public static void main(String[] args) {
    
       Scanner leer = new Scanner(System.in);
        String contraseña ="";
        System.out.println("Ingresa tu contraseña");
        contraseña = leer.nextLine();
        String mayusculas[] = {"A","B","C","D","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","V","W","X","Y","Z"};
        String minusculas[] ={"a","b","c","d","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","v","w","x","y","z"};
        String caracteres[] ={"@","|","*",",",".","#","$","%","&","/","(",")","?"};
        int i = 0;
        int j2 = 0;

        if(contraseña.length()>7){
           for (char caracter : contraseña.toCharArray()) {
            if (caracter > 65 || caracter<90 || caracter > 33 || caracter<64 || caracter >97 || caracter<122)  {
                System.out.println(" contraseña Valida");
                break;
            }else{
                System.out.println("contraseña Invalidad");

            }

        } 
        }
        /* 
        for (i = 0; i < contraseña.length(); i++) {

            if(contraseña.length()>7){
                char contraseñaDesmenusada = contraseña.charAt(i);
                for (int j = 0; j < mayusculas.length; j++) {
                        if(mayusculas[i].equals(contraseñaDesmenusada)){
                            for (j2 = 0; j2 < minusculas.length; j2++) {
                                if(minusculas[i].equals(contraseñaDesmenusada)){
                                    if(contraseñaDesmenusada>0 || contraseñaDesmenusada <10){
                                        for (int j3 = 0; j3 < caracteres.length; j3++) {
                                            if(caracteres[j3].equals(contraseñaDesmenusada)){
                                                System.out.println("Contraseña valida");
                                                break;
                                            }
                                        }
                                    }else{
                                        System.out.println("no contiene un numero");
                                        break;
                                    }
                                }else{
                                    System.out.println("no contiene una minuscula");
                                    break;
                                }
                            }
                        }else{
                            System.out.println("no contiene una mayuscula");
                            break;
                        }
                }
            }else{
                        System.out.println("no cumple con la longitud");
                        break;
            }
            
        }
        */
    }
}