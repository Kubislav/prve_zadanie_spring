package com.java.prvezadanie;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PrveZadanieApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrveZadanieApplication.class, args);
    }

    @GetMapping
    public static void prejstDni() {

        final Map<TYZDEN, String> moja_mapa = createMap();

        for (TYZDEN den : TYZDEN.values())
            if (den.denVTyzdni % 2 == 0)
                System.out.println("Toto je sudy den: " + den);

        for (TYZDEN den : TYZDEN.values()) {
            switch (den.denVTyzdni) {

            case 5:
                System.out.println(moja_mapa.get(den));
                break;
            case 6:
                System.out.println(moja_mapa.get(den));
                break;
            case 7:
                System.out.println(moja_mapa.get(den));
                break;
            }

        }

    }

    public static Map<TYZDEN, String> createMap() {
        Map<TYZDEN, String> result = new HashMap<>();
        result.put(TYZDEN.PIATOK, "Nezabudni vsetko pushnut");
        result.put(TYZDEN.SOBOTA, "Kulturne vyzitie, upratat byt");
        result.put(TYZDEN.NEDELA, "Oddych");
        return Collections.unmodifiableMap(result);
    }
}
