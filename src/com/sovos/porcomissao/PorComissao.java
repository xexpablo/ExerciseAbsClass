package com.sovos.porcomissao;

import com.sovos.employee.Employee;

public class PorComissao extends Employee {

    double salario;
    double comissao;
    int vendas;

    public double getSalario() {        return salario;    }
    public void setSalario(double salario) {        this.salario = salario;    }

    public double getComissao() {        return comissao;    }
    public void setComissao(double comissao) {        this.comissao = comissao;    }

    public int getVendas() {        return vendas;    }
    public void setVendas(int vendas) {        this.vendas = vendas;    }

    public PorComissao(String nome, String familia, double money, double comis, int venda){
        super.setFamilia(familia);
        super.setNome(nome);
        this.setSalario(money);
        this.setComissao(comis);
        this.setVendas(venda);
    }

    public String toString(){
        return "Por Comissão: " + super.toString();
    }

    @Override
    public double ganhar() {
        return (getSalario() + (getComissao() * getVendas()));
    }
}
