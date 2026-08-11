package Competition;

public class Time {
    protected int codigo;
    protected String nome;
    protected String sigla;

    public Time(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
    public Time(int codigo, String nome, String sigla) {
        this.codigo = codigo;
        this.nome = nome;
        this.sigla = sigla;
    }
    public int getCodigo() {return codigo;}
    public void setCodigo(int codigo) {this.codigo = codigo;}
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public String getSigla() {return sigla;}
    public void setSigla(String sigla) {this.sigla = sigla;}
}
