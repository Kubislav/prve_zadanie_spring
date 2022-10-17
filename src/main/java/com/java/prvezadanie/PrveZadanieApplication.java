package com.java.prvezadanie;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrveZadanieApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrveZadanieApplication.class, args);
    }

    // TODO přesunout do service class, tu inicializovat jako komponentu a tuto metodu předělat ze static na instanční
    public static void prejstDni() {

        for (TYZDEN den : TYZDEN.values())
            if (den.denVTyzdni % 2 == 0)
                System.out.println("Toto je sudy den: " + den);

        for (TYZDEN den : TYZDEN.values()) {
            switch (den.denVTyzdni) {

            case 5:
                System.out.println(dnyZpravy.get(den));
                break;
            case 6:
                System.out.println(dnyZpravy.get(den));
                break;
            case 7:
                System.out.println(dnyZpravy.get(den));
                break;
            }

        }

    }

    /** Zprávy k vybraným dnům v týdnu */
    public static Map<TYZDEN, String> dnyZpravy;

    /** Inicializace mapy při classloadingu */
    static {
        dnyZpravy = new HashMap<>();
        dnyZpravy.put(TYZDEN.PIATOK, "Nezabudni vsetko pushnut");
        dnyZpravy.put(TYZDEN.SOBOTA, "Kulturne vyzitie, upratat byt");
        dnyZpravy.put(TYZDEN.NEDELA, "Oddych");
    }
}
