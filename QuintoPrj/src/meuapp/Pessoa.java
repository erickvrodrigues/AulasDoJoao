package meuapp;

public class Pessoa {
    private String Nome;
    private String Endereco;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String tel) {
        Tel = tel;
    }

    private String Tel;
    public Pessoa(String nome, String endereco, String tel) {
        Nome = nome;
        Endereco = endereco;
        Tel = tel;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "Nome='" + Nome + '\'' +
                ", Endereco='" + Endereco + '\'' +
                ", Tel='" + Tel + '\'' +
                '}';
    }
}
