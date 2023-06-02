package tr.medipol.edu.yova;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;


public class Parti {
    private Map<String, Integer> partiOylari;
    
    public Parti() {
    	partiOylari = new HashMap<String, Integer>();
    }

    public void partiOyArttir(String parti) {
    	partiOylari.putIfAbsent(parti, 0);
    	partiOylari.put(parti, partiOylari.get(parti) + 1);
    }

    public void partiOyAzalt(String parti) {
        if (partiOylari.containsKey(parti)) {
        	partiOylari.put(parti, partiOylari.get(parti) - 1);
        } else {
            throw new IllegalArgumentException(parti + " partisi bulunamadı...");
        }
    }
    
    public int partiOyGetir(String parti) {
    	if (partiOylari.containsKey(parti)) {
        	return partiOylari.get(parti).intValue();
        } else {
            throw new IllegalArgumentException(parti + " partisi bulunamadı...");
        }
    }

    public ArrayList<String> partiOyListele() {
    	
    	ArrayList<String> partiOyBilgiListesi = new ArrayList<String>();
        for (Map.Entry<String, Integer> entry : partiOylari.entrySet()) {
            String partiAdi = entry.getKey();
            int oySayisi = entry.getValue();
            String partiBilgi = partiAdi + ": " + oySayisi;
            partiOyBilgiListesi.add(partiBilgi);
        }
        return partiOyBilgiListesi;
    }
}