package br.com.thiago;

import lombok.Getter;
import lombok.Setter;


public class Calculadora {
    @Getter @Setter
    private Double a, b;

    public Double soma(){
        return this.a + this.b;
    }

}
