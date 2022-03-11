package com.sovos.poritem;

import com.sovos.employee.Employee;

public class PorItem extends Employee {

    double producao;
    int quantidade;

    public double getProducao() {        return producao;    }
    public void setProducao(double producao) {        this.producao = producao;    }

    public int getQuantidade() {        return quantidade;    }
    public void setQuantidade(int quantidade) {        this.quantidade = quantidade;    }

    public PorItem(String nome, String familia, double prod, int qtd){
        super.setFamilia(familia);
        super.setNome(nome);
        this.setProducao(prod);
        this.setQuantidade(qtd);
    }

    public String toString(){
        return "Por Item: " + super.toString();
    }

    @Override
    public double ganhar() {
        return (getProducao() * getQuantidade());
    }
}
