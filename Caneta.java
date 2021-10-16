class Caneta {

    public String corCaneta, corTampaCaneta;

    public void setCorCaneta(String cor){
        this.corCaneta = cor;
        System.out.println("Mudando cor da caneta para: "+cor);
        
    }
    public String setCorTampaCaneta(String cor){
        this.corTampaCaneta = cor;
        return "Mudando cor da tampa para: "+cor;
    }
    public void alterCorCaneta(String novaCor){
        String corAnterior = this.corCaneta;
        this.corCaneta = novaCor;
        System.out.println("Alterando a cor da caneta de: "+corAnterior+" para: "+novaCor);
    }
    public void alterCorTampaCaneta(String novaCor){
        String corAnterior = this.corTampaCaneta;
        this.corTampaCaneta = novaCor;
        System.out.println("Alterando a cor da tampa de: "+corAnterior+" para: "+novaCor);
    }
public static void main(String[] args) {
    Caneta bic = new Caneta();
    bic.setCorCaneta("azul");
    String resultado = bic.setCorTampaCaneta("azul");
    System.out.println(resultado);

    bic.alterCorCaneta("Vermelho");
    bic.alterCorTampaCaneta("Preto");
}
}


