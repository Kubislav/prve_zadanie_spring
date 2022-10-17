package com.java.prvezadanie;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PrveZadanieApplicationTests {

    @Test
    void contextLoads() {

        assertEquals(PrveZadanieApplication.dnyZpravy.get(TYZDEN.PIATOK), "Nezabudni vsetko pushnut");

        // TODO po předělání autowirovat novou service a volat její instanční metodu
        PrveZadanieApplication.prejstDni();

        System.out.println("koniec testu");
    }

}
