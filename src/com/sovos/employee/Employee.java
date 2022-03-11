package com.sovos.employee;

public abstract class Employee {
    private String nome;
    private String familia;

    public Employee() {
        this.nome = nome;
        this.familia = familia;
    }

    public abstract double ganhar();

    public String getNome() {        return nome;    }
    public void setNome(String nome) {        this.nome = nome;    }

    public String getFamilia() {        return familia;    }
    public void setFamilia(String familia) {        this.familia = familia;    }

    public String toString(){
        return getNome() + " " + getFamilia();
    }

}
