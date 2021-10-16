import java.util.Scanner;

class Pessoa {
    protected String nome;
    protected double idade;
   
    public Pessoa(String nome, double idade){
        this.nome = nome;
        this.idade = idade;
    }
    
}

class Aluno extends Pessoa{
    public String curso, profissaoAtual;
    public int matricula, catetoA, catetoB, hipotenusa;

    public Aluno(String nome, int idade, int matricula, String curso, String profissaoAtual){
        super(nome, idade);
        this.matricula = matricula;
        this.curso = curso;
        this.profissaoAtual = profissaoAtual;
    }
    public void mostrar(){
        System.out.println("Nome: "+this.nome+"\nIdade: "+this.idade);
    }
   // public Problema(int catetoA, int catetoB, int hipotenusa){
   //     this.catetoA = catetoA*catetoA;
   //     this.catetoB = catetoB*catetoB;
   //     this.hipotenusa = catetoA+catetoB;

       
   //     }

}
public class Executor{
  public static void main(String[] args) {
      Aluno aluno =  new Aluno("Lucas", 28, 12345, "ads", "estudante");
    
      System.out.println(aluno);
      

    }    
}
