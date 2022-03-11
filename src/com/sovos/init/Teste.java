package com.sovos.init;

import com.sovos.chefe.Chefe;
import com.sovos.porcomissao.PorComissao;
import com.sovos.porhora.PorHora;
import com.sovos.poritem.PorItem;

import java.text.DecimalFormat;

public class Teste {
    public static void main(String[] args) {
        Chefe ch = new Chefe("Pablo","Caun",75000);
        PorComissao pc = new PorComissao("Josue", "Caun", 15000, 2000, 5);
        PorItem pi = new PorItem("Lucas", "Nogueira",4000,10);
        PorHora ph = new PorHora("Guilherme", "Takigawa", 1000, 30);
        DecimalFormat df = new DecimalFormat();

        System.out.println(ch.toString() + " ganha $" + df.format(ch.ganhar()));
        System.out.println(pc.toString() + " ganha $" + df.format(pc.ganhar()));
        System.out.println(pi.toString() + " ganha $" + df.format(pi.ganhar()));
        System.out.println(ph.toString() + " ganha $" + df.format(ph.ganhar()));
    }
}
