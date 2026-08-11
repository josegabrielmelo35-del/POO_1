package Competition;

public class Pessoa {
    protected int codigo;
    protected String nome;
    protected String telefone;
    protected int idade;

    public Pessoa(int codigo, String nome, int idade){
        this.codigo = codigo;
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(int codigo, String nome, String telefone, int idade){
        this.codigo = codigo;
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
    }

    public int getCodigo() {return codigo;}
    public void setCodigo(int codigo) {this.codigo = codigo;}
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public String getTelefone() {return telefone;}
    public void setTelefone(String telefone) {this.telefone = telefone;}
    public int getIdade() {return idade;}
    public void setIdade(int idade) {this.idade = idade;}
}