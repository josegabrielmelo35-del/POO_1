package Competition;

public class Partida {
    protected String jogador_A;
    protected String jogador_B;
    protected double num_pagantes;
    protected double val_ingresso;
    protected String est_partida;

    public double validarValorIngresso(int valor){
        if (valor < 10){
            valor = 10;
        }
        else if (valor > 500){
            valor = 500;
        }
        else{valor+=valor;}
        return valor;
    }
    public double validarNumeroPagantes(int valor){
        if (valor <500){
            valor = 500;
        }
        else if(valor > 5000){
            valor = 5000;
        }
        else{valor+=valor;}
        return valor;
    }

    public boolean partidaPermitida(){
        return jogador_A.equals(jogador_B);
    }

    public Partida(String jogador_A, String jogador_B){
        this.jogador_A = jogador_A;
        this.jogador_B = jogador_B;
        this.num_pagantes = 2000;
        this.val_ingresso = 35;
    }
    public Partida(String jogador_A, String jogador_B,  double num_pagantes) {
        this.jogador_A = jogador_A;
        this.jogador_B = jogador_B;
        this.num_pagantes = num_pagantes;
        this.num_pagantes= validarNumeroPagantes(35);
        this.val_ingresso = 35;
    }
    public Partida(String jogador_A, String jogador_B, double num_pagantes, double val_ingresso){
        this.jogador_A = jogador_A;
        this.jogador_B = jogador_B;
        this.num_pagantes = num_pagantes;
        this.val_ingresso = val_ingresso;
        this.num_pagantes= validarNumeroPagantes(35);
        this.val_ingresso = validarValorIngresso(567);
    }

    public double calcularArrecadacao() {
        return num_pagantes * val_ingresso;
    }

    public double calcularDespesas() {
        if(est_partida.equals("Empate")){
            return 1000;
        }
        else{
            return 500;
        }
    }

    public double calcularLucro (){
        return calcularArrecadacao() - calcularDespesas();
    }


    public double getNum_pagantes() {return num_pagantes;}
    public void setNum_pagantes(double num_pagantes){this.num_pagantes=num_pagantes;}
    public double getVal_ingresso() {return val_ingresso;}
    public void setVal_ingresso(double val_ingresso) {this.val_ingresso=val_ingresso;}
    public String getJogador_A() {return jogador_A;}
    public void setJogador_A(String jogador_A) {this.jogador_A=jogador_A;}
    public String getJogador_B() {return jogador_B;}
    public void setJogador_B(String jogador_B) {this.jogador_B=jogador_B;}
    public String getEst_partida() {return est_partida;}
    public void setEst_partida(String est_partida) {this.est_partida = est_partida;}

}
