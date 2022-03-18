package Loja;

public class Cliente{

    String nome;
    int idade;
    int telefone;


    public Cliente(String nome, int idade, int telefone){

        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;

    }

    public void Informacao(){

        System.out.println("Nome: " + nome + "\n" +
        "Idade: " + idade + "\n" +
        "Telefone: " + telefone + "\n" + "\n");
    }


    public static void main(String[] args) {

        Cliente C1 = new Cliente("Carlos Augusto", 22, 46769090);
        Cliente C2 = new Cliente("Regina Cazé", 19, 47268937);

        C1.Informacao();
        C2.Informacao();
        
    }

}