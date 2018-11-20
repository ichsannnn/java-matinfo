package helpers;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author skadevz
 */
public class Data {
    
    public String ibukotaNegara(String negara) {        
        Map<String, String> ibukota = new HashMap<>();
        ibukota.put("Australia", "Canberra");
        ibukota.put("Belanda", "Amsterdam");
        ibukota.put("China", "Beijing");
        ibukota.put("Filipina", "Manila");
        ibukota.put("Indonesia", "Jakarta");
        ibukota.put("Inggris", "London");
        ibukota.put("Italia", "Roma");
        ibukota.put("Jepang", "Tokyo");
        ibukota.put("Jerman", "Berlin");
        ibukota.put("Indonesia", "Jakarta");
        ibukota.put("Malaysia", "Kuala Lumpur");
        ibukota.put("Perancis", "Paris");
        ibukota.put("Peru", "Lima");
        ibukota.put("Rusia", "Moskow");
        ibukota.put("Singapura", "Singapura");
        ibukota.put("Thailand", "Bangkok");
        ibukota.put("Turki", "Ankara");
        ibukota.put("Vietnam", "Hanoi");
        
        
        return ibukota.get(negara);
    }
    
}
