package com.mycompany.interfaces;

import java.util.Scanner;

public class Frear implements interFace {

    private double velocidade, veloxmax;

    private void setVelocidade(double vel) {
        velocidade = vel;
    }

    private double getVelocidade() {
        return velocidade;
    }

    private void setveloxmax() {
        veloxmax = getVelocidadeMaxima();
    }

    private double getveloxmax() {
        return veloxmax;
    }

    public Frear() {
    }

    public Frear(double velocidade, double velmax) {
        this.velocidade = velocidade;
        this.veloxmax = veloxmax;
    }

    public void reduzir() {
        if (VELOCIDADEMAXIMA < velocidade) {
            double n = VELOCIDADEMAXIMA - velocidade;
            System.out.println("Frear" + n + "quilometros");

        } else {
            System.out.println(velocidade + "tudo ok");
        }
    }
    public double getVelocidadeMaxima() {
return VELOCIDADEMAXIMA;
    }
public void entrada ( ){
    Scanner ent = new Scanner(System.in);
    System.out.println("velocidade  :");
    setVelocidade ( Double.parseDouble(ent.nextLine()));
 
    }
}