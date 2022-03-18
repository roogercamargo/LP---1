package Loja;

public class Funcionario{

    String nome;
    int idade;
    String funcao;

    public Funcionario(String nome, String funcao, int idade){

        this.nome = nome;
        this.idade = idade;
        this.funcao = funcao;
    }
    

    public void Informacao(){

        System.out.println("Nome: " + nome + "\n" +
        "Função: " + funcao + "\n" +
        "Idade: " + idade + "\n");
    }


    public static void main(String[] args) {

        Funcionario C1 = new Funcionario("Carla perez", "Advogado", 56);
        Funcionario C2 = new Funcionario("Lucia lucinda", "Feirante", 44);

        C1.Informacao();
        C2.Informacao();
        
    }

}