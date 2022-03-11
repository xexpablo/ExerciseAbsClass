package com.sovos.chefe;

import com.sovos.employee.Employee;

public class Chefe extends Employee {

    double salario;

    public double getSalario() {        return salario;    }
    public void setSalario(double salario) {        this.salario = salario;    }

    public Chefe(String nome, String familia, double money){
        super.setNome(nome);
        super.setFamilia(familia);
        this.setSalario(money);
    }

    public String toString(){
        return "Chefe: " + super.toString();
    }

    @Override
    public double ganhar() {
        return getSalario();
    }
}
