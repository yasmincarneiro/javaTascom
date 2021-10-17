public class Desafio_aula4{
    public static void main(String[] args) {
        int matriz[][] = new int [10][10];


        //1# atribuindo valores. Vetor = linhas & Indice = colunas!!!!
        int contador = 1;
        for (int vetor = 0; vetor < matriz.length; vetor++) {
            for (int indice = 0; indice < matriz[vetor].length; indice++) {    
                matriz[vetor][indice] = contador;
                contador ++;       
            }
        } 


        //2# primos.
        for (int vetor = 0; vetor < matriz.length; vetor++){ // linha
            for (int indice = 0; indice < matriz[vetor].length; indice++){ // coluna
               int counter = 0;
            for (int primos = 1; primos <= matriz[vetor][indice]; primos++) {
                if (matriz[vetor][indice] % primos == 0) ++counter;
            }
                if (counter == 2){
                    System.out.println(matriz[vetor][indice] + " eh primo.");
                }

            }
        }


        //3# pares.
        for (int vetor = 0; vetor < matriz.length; vetor++){
            for (int indice = 0; indice < matriz[vetor].length; indice++){
                if (matriz[vetor][indice]%2 == 0){
                    System.out.println(matriz[vetor][indice] + " eh par");
                }
            }

        }
        //4# impares.
        for (int vetor = 0; vetor < matriz.length; vetor++){
            for (int indice = 0; indice < matriz[vetor].length; indice++){
                if (matriz[vetor][indice]%2 != 0){ // != : diferente
                    System.out.println(matriz[vetor][indice] + " eh impar");
                }
            }
        }

    }
}  

