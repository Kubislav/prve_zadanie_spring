package com.java.prvezadanie;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PrveZadanieApplicationTests {

    @Test
    void contextLoads() {

        PrveZadanieApplication.main(new String[] { "" });
        // PrveZadanieApplication.prejstDni();
        Map<TYZDEN, String> tmp = PrveZadanieApplication.createMap();
        assertEquals(tmp.get(TYZDEN.PIATOK), "Nezabudni vsetko pushnut");
        System.out.println("koniec testu");
    }

}
