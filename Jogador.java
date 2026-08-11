package Competition;

public class Jogador extends Pessoa{
    protected String time;
    protected int num_vitoria;
    protected int num_derrote;
    protected int num_empate;
    protected int acum_premio;

    public Jogador(int codigo, String nome, int idade, String time) {
        super(codigo,nome,idade);
        this.num_vitoria = 0;
        this.num_derrote = 0;
        this.num_empate = 0;
        this.acum_premio = 0;
        this.time = time;
    }

    //código, nome, telefone, idade e time.
    //Os números de vitória, de derrota e de empate devem ser iniciados com zero. O prêmio
    //acumulado deve ser iniciado com 0.
    public Jogador(int codigo, String nome, String telefone, int idade, String time) {
        super(codigo,nome,telefone, idade);
        this.num_vitoria = 0;
        this.num_derrote = 0;
        this.num_empate = 0;
        this.acum_premio = 0;
        this.time = time;
    }
    public int  getNum_vitoria() {return num_vitoria;}
    public void setNum_vitoria(int num_vitoria) {this.num_vitoria = num_vitoria;}
    public int getNum_derrote() {return num_derrote;}
    public void setNum_derrote(int num_derrote) {this.num_derrote = num_derrote;}
    public int getNum_empate() {return num_empate;}
    public void setNum_empate(int num_empate) {this.num_empate = num_empate;}
    public int getAcum_premio() {return acum_premio;}
    public void setAcum_premio(int acum_premio){this.acum_premio = acum_premio;}
    public String getTime() {return time;}
    public void setTime(String time) {this.time = time;}

    public int vitoria(){
        int vit = 0;
        vit += this.num_vitoria;
        return vit;
    }
    public int perder(){
        int per = 0;
        per += this.num_derrote;
        return per;
    }
    public int empate(){
        int emp = 0;
        emp += this.num_empate;
        return emp;
    }

    public int adicionarPremio(int valor){
        if(this.acum_premio > 0){
            valor += this.acum_premio;
        }
        return valor;
    }

    public String obterCategoria(){
        String categoria = "";
        if (idade >= 20 && idade <= 24 ){
            categoria = "Junior";
        }
        else if (idade >= 25 && idade <= 29 ){
        categoria = "Pleno";
        }
        else if (idade >= 30 && idade <= 35 ){
            categoria = "Senior";
        }
        return categoria;
    }
    public void exibir () {
        System.out.println(String.format("Nome: %s\n Idade: %d\n Categoria: %s\n Número de vitória: %s\n Número de empate: %s\n Número de derrota: %s\n Valor das premiações: %s",
                                        nome,idade,obterCategoria(),num_vitoria,num_vitoria,num_empate,num_derrote,acum_premio));
    }

    /*static void main() {
        Jogador davi = new Jogador(99, "josé", "999231313", 18, "palmeiras");
    }
     */
}