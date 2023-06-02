package tr.medipol.edu.yova;

import static org.junit.Assert.*;
import java.util.ArrayList;

import org.junit.Test;

public class PartiTest {

	@Test
	public void testPartiOyArttir() {
		
		// GIVEN - ON KOSULLAR
		Parti parti = new Parti();
		for(int i = 0; i < 5; i++)
			 parti.partiOyArttir("A");
		for(int i = 0; i < 8; i++)
			 parti.partiOyArttir("B");
		for(int i = 0; i < 10; i++)
			 parti.partiOyArttir("C");
	
       // WHEN - ASIL TEST
       int aPartiSonuc = parti.partiOyGetir("A");
       int bPartiSonuc = parti.partiOyGetir("B");
       int cPartiSonuc = parti.partiOyGetir("C");
        
        
       // THEN - KONTROL / VALIDASYON
        assertEquals(5, aPartiSonuc);
        assertEquals(8, bPartiSonuc);
        assertEquals(10, cPartiSonuc);
	}

	@Test
	public void testPartiOyAzalt() {
		
		// GIVEN - ON KOSULLAR
		Parti parti = new Parti();
		for(int i = 0; i < 12; i++)
			 parti.partiOyArttir("A");
		for(int i = 0; i < 20; i++)
			 parti.partiOyArttir("B");
		for(int i = 0; i < 30; i++)
			 parti.partiOyArttir("C");
		
		for(int i = 0; i < 5; i++)
			 parti.partiOyAzalt("A");
		for(int i = 0; i < 12; i++)
			 parti.partiOyAzalt("B");
		for(int i = 0; i < 15; i++)
			 parti.partiOyAzalt("C");
       
		// WHEN - ASIL TEST
       int aPartiSonuc = parti.partiOyGetir("A");
       int bPartiSonuc = parti.partiOyGetir("B");
       int cPartiSonuc = parti.partiOyGetir("C");
        
       // THEN - KONTROL / VALIDASYON
        assertEquals(7, aPartiSonuc);
        assertEquals(8, bPartiSonuc);
        assertEquals(15, cPartiSonuc);
	}

	@Test
	public void testPartiOyGetir() {
		
		// GIVEN - ON KOSULLAR
		Parti parti = new Parti();
		for(int i = 0; i < 5; i++)
			 parti.partiOyArttir("A");
		for(int i = 0; i < 8; i++)
			 parti.partiOyArttir("B");
		for(int i = 0; i < 10; i++)
			 parti.partiOyArttir("C");
		
		for(int i = 0; i < 2; i++)
			 parti.partiOyAzalt("A");
		for(int i = 0; i < 4; i++)
			 parti.partiOyAzalt("B");
		for(int i = 0; i < 7; i++)
			 parti.partiOyAzalt("C");
		
		// WHEN - ASIL TEST
        int aPartiSonuc = parti.partiOyGetir("A");
        int bPartiSonuc = parti.partiOyGetir("B");
        int cPartiSonuc = parti.partiOyGetir("C");
        
     // THEN - KONTROL / VALIDASYON
        assertEquals(3, aPartiSonuc);
        assertEquals(4, bPartiSonuc);
        assertEquals(3, cPartiSonuc);
	}

	@Test
	public void testPartiOyListele() {
		
		// GIVEN - ON KOSULLAR
		Parti parti = new Parti();
		
		for(int i = 0; i < 5; i++)
			 parti.partiOyArttir("A");
		for(int i = 0; i < 8; i++)
			 parti.partiOyArttir("B");
		for(int i = 0; i < 10; i++)
			 parti.partiOyArttir("C");
		
		// WHEN - ASIL TEST
		ArrayList<String> sonucListesi = parti.partiOyListele();
		
	     // THEN - KONTROL / VALIDASYON
	    assertEquals(3, sonucListesi.size());
	    assertTrue(sonucListesi.contains("A: 5"));
	    assertTrue(sonucListesi.contains("B: 8"));
	    assertTrue(sonucListesi.contains("C: 10"));
	}

}
