public class Contador {
   
    public void contar(int valor1, int valor2) throws ParametrosInvalidosException{
        
        if(valor1 < valor2){
            int valor = valor2 - valor1;
            contandoValores(valor);
            
        }
        else{
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro. \n");
        }
    }

    public static void contandoValores(int valor){

        System.out.println("________________");
        System.out.printf("Quantidade de interações do for: %d \n", valor);

        for (int i = valor; i > 0; i--) {
            System.out.printf("Imprimindo o número: %d \n",i);
        }

        System.out.println("________________\n");
    }


}
