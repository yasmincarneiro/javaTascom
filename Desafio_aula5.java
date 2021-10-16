class Desafio_aula5{

    public static void main(String[] args) {
    int matriz[][] = new int[5][5];

    int contador = -20;
    for (int vetor = 0; vetor < matriz.length; vetor++){
        for (int indice = 0; indice < matriz[vetor].length; indice++){
            matriz[vetor][indice] = contador;
            contador++;

            if(matriz[vetor][indice] >= 0){
                System.out.println("Os numeros naturais sao: " + matriz[vetor][indice]);
                
            }
        }
        
    } 

    }
    
}