package com.sovos.porhora;

import com.sovos.employee.Employee;

public class PorHora extends Employee {

    double valor;
    double horas;

    public double getValor() {        return valor;    }
    public void setValor(double valor) {        this.valor = valor;    }

    public double getHoras() {        return horas;    }
    public void setHoras(double horas) {        this.horas = horas;    }

    public PorHora(String nome, String familia, double valores, double hora){
        super.setFamilia(familia);
        super.setNome(nome);
        this.setHoras(hora);
        this.setValor(valores);
    }

    public String toString(){
        return "Por Hora: " + super.toString();
    }

    @Override
    public double ganhar() {
        return (getHoras() * getValor());
    }
}
