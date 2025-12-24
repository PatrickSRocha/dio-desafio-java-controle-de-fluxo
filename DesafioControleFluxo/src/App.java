
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int parametro1 = -1;
        int parametro2 = -1;

        while (true) { 
            
            try{

                while(parametro1 < 0){
                    System.out.print("Digite o primeiro valor: ");
                    parametro1 = sc.nextInt();
                    
                    if(parametro1 < 0){
                        System.out.println("O primeiro parâmetro precisa ser do tipo inteiro. \n");
                    }
                        
                }
                
                while(parametro2 < 0){
                    System.out.print("Digite o segundo valor: ");
                    parametro2 = sc.nextInt();
                    
                    if(parametro2 < 0){
                         System.out.println("O segundo parâmetro precisa ser do tipo inteiro. \n");
                    }
                   
                }

            Contador conte = new Contador();
            conte.contar(parametro1, parametro2);
            
            break;
            
            } 
            catch (InputMismatchException e) {
                sc.nextLine();
                System.err.println("Os parâmetros não podem ser string. \n");
            }
            catch (ParametrosInvalidosException e) {
                System.err.println(e.getMessage());
                parametro2 = -1;
            }
        } 

        sc.close();
    }
}
