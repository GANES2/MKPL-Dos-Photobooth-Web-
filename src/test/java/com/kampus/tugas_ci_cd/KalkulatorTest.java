package com.kampus.tugas_ci_cd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class KalkulatorTest {

    @Test
    public void testTambah() {
        Kalkulator kalkulator = new Kalkulator();
        
        // Robot menguji: Apakah 1 + 1 hasilnya 2?
        int hasil = kalkulator.tambah(1, 1);
        
        // Jika hasilnya benar 2, maka test sukses!
        assertEquals(2, hasil);
    }
}
