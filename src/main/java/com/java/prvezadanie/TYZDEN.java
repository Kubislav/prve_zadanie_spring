package com.java.prvezadanie;

public enum TYZDEN {

    PONDELOK(1), UTOROK(2), STREDA(3), STVRTOK(4), PIATOK(5), SOBOTA(6), NEDELA(7);

    final int denVTyzdni;

    TYZDEN(int denVTyzdni) {
        this.denVTyzdni = denVTyzdni;
    }
}
