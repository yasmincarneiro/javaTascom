class Conta{
    public Double saldo; //numeros reais, int é pra numeros inteiros
    public String nome; //nome da conta

    public void setSaldo(Double valor){
        this.saldo = valor;
    }
    public String setNome(String usuario){
        this.nome = usuario;
        return this.nome;
    }
    public Double verSaldo(){
        return this.saldo;
    }
    public void depositar(Double valor){
        this.saldo = this.saldo+valor;
    //adc dinheiro ao saldo
    }

    public static void main(String[] args) {
    // instanciando a classe Conta, na variável conta
        Conta conta = new Conta();
        conta.setSaldo(0.0);
        conta.setNome("yasmincarneiro@email.com.br");
        System.out.println(conta.nome);

        //imprimindo o retorno do metodo verSaldo do objeto conta
        System.out.println(conta.verSaldo());
        
        //depositando 6000 no saldo do objeto conta 
        conta.depositar(6000.0); 
        
        //imprimindo o retorno do metodo verSaldo do objeto conta
    System.out.println(conta.verSaldo());          
    }
}