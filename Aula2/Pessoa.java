package Aula2;

public class Pessoa{
    public String nome;
    public int idade;
    public double peso;
    public String sexo;

    public Pessoa(String nome, int idade, double peso, String sexo){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.sexo = sexo;
    }

    public void apresentacao(){
        if(sexo.equals("masculino"))
            System.out.println("Olá, meu nome é " + nome + " e minha idade é " + idade + " e meu peso é " + peso);
        else if(sexo.equals("feminino"))
            System.out.println("Olá, meu nome é " + nome + " e minha idade é " + idade);

    }
}