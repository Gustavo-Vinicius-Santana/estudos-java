package models;

public class Pessoa {
    private String nome;
    private Integer idade;
    private String sexo;

    public Pessoa(String nome, Integer idade, String sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }
}
