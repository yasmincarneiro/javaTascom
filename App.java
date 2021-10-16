class Carro {
    private String cor;
    private double preco;
    protected String modelo;

    public Carro(String modelo, String cor, double preco){
        this.cor = cor;
        this.modelo = modelo;
        this.preco = preco;
            }
    
}

class Fiat extends Carro{
    public String motor;

    public Fiat(String cor, String modelo, double preco, String motor){
        super(cor, modelo, preco);
        this.motor = motor;
    }
}

public class App{
    public static void main(String[] args) {
        Fiat uno = new Fiat("verde", "Fiat uno 2007",20000.00, "2.0");
        System.out.println(uno.modelo);
    }
}
