class Desafio_aula3 {

    public static void main(String[] args){
        int vetor[] = new int[100];

    int cont = 0;

    while(cont < vetor.length){
        vetor[cont] = cont + 1; // armazena +1 dentro do indice
        cont++; //adiciona +1 ao numero do indice
    }
    int c = 0;
    while(c < vetor.length){
        System.out.println(vetor[c]);
        c++;
   
    }
    int c1 = 0;
    while(c1< vetor.length){
        if(vetor[c1]%2 == 0){
            System.out.println("indice: ["+c1+"] tem o valor par de: ["+vetor[c1]+"]");
        }else if(vetor[c1]%2 == 1){
            System.out.println("indice: ["+c1+"] tem o valor impar de: ["+vetor[c1]+"]");
        }
        c1++;
    }
    // int c2 = 0;
    // while(c2< vetor.length){
    //     if(vetor[c2]%2 == 1){
    //         System.out.println("indice: "+c2+" tem o valor impar de: "+vetor[c2]);
    //     }
    //     c2++;
    // }
    int soma = 0;
    int c3 = 0;

    while (c3 < vetor.length){
        soma = soma + vetor[c3];
        c3++;
    }
    System.out.println(soma);
}
}


