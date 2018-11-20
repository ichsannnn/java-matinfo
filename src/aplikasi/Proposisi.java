package aplikasi;

import helpers.Data;
import helpers.TabelKebenaran;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author skadevz
 */
public class Proposisi {
    
    static TabelKebenaran tk = new TabelKebenaran();
    static Data data = new Data();
    
    public static void main(String[] args) {
       
       aplikasi();
    }
    
    static void aplikasi() {
        String choice, c;
        choice = "1. Proposisi\n"
                + "2. Proposisi Ibukota\n"
                + "3. Tabel Kebenaran\n\n"
                + "Masukan Pilihan:";
        c = JOptionPane.showInputDialog(null, choice, "Proposisi", JOptionPane.QUESTION_MESSAGE);
        
        if (c == null) {
            Matinfo.aplikasi();
        }
        
        switch (c) {
            case "1":
                JOptionPane.showMessageDialog(null, "message", "Proposisi", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "2":
                ibukota();
                break;
            case "3":
                tabelKebenaran();
                break;
            case "999":
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Pilihan tidak ada", "Proposisi", JOptionPane.ERROR_MESSAGE);
        }
        
        aplikasi();
    }
    
    static void ibukota() {
        String[] negara = {"Australia","Indonesia","Inggris","Jerman","Perancis","Singapura","Turki"};
        String[] ibukota = {"Canberra","Jakarta","London","Berlin","Paris","Singapura","Ankara"};
        
        Icon errorIcon = UIManager.getIcon("OptionPane.questionIcon");
        String n1 = (String) JOptionPane.showInputDialog(null,  
                "Pilih Negara", "Proposisi",  
                JOptionPane.PLAIN_MESSAGE, errorIcon, negara, "NEGARA");
        String i1 = (String) JOptionPane.showInputDialog(null,  
                "Pilih Ibukota", "Proposisi",  
                JOptionPane.PLAIN_MESSAGE, errorIcon, ibukota, "IBUKOTA");
        String n2 = (String) JOptionPane.showInputDialog(null,  
                "Pilih Negara", "Proposisi",  
                JOptionPane.PLAIN_MESSAGE, errorIcon, negara, "NEGARA");
        String i2 = (String) JOptionPane.showInputDialog(null,  
                "Pilih Ibukota", "Proposisi",  
                JOptionPane.PLAIN_MESSAGE, errorIcon, ibukota, "IBUKOTA");
        
        boolean p1 = false, p2 = false;
        if (data.ibukotaNegara(n1).equals(i1)) {
            p1 = true;
        }
        
        if (data.ibukotaNegara(n2).equals(i2)) {
            p2 = true;
        }
        
        String c, choice = "p: " + i1 + " adalah ibukota dari " + n1 + "\n" + 
                        "q: " + i2 + " adalah ibukota dari " + n2 + "\n\n" +
                        "1. Konjungsi\n"
                        + "2. Disjungsi Inklusif\n"
                        + "3. Disjungsi Eksklusif\n"
                        + "4. Kondisi\n"
                        + "5. Bikondisi\n"
                        + "Masukkan Proposisi: ";
        c = JOptionPane.showInputDialog(null, choice, "Proposisi", JOptionPane.INFORMATION_MESSAGE);
        
        if (c.equalsIgnoreCase("1")) {
            String result = "p: " + i1 + " adalah ibukota dari " + n1 + " => " + p1 + "\n" 
                            + "q: " + i2 + " adalah ibukota dari " + n2 + " => " + p2 + "\n"
                            + "p\u2227q = " + tk.konjungsi(p1, p2);
            JOptionPane.showMessageDialog(null, result, "Konjungsi", JOptionPane.INFORMATION_MESSAGE);
        } else if (c.equalsIgnoreCase("2")) {
            String result = "p: " + i1 + " adalah ibukota dari " + n1 + " => " + p1 + "\n" 
                            + "q: " + i2 + " adalah ibukota dari " + n2 + " => " + p2 + "\n"
                            + "p\u2228q = " + tk.inDisjungsi(p1, p2);
            JOptionPane.showMessageDialog(null, result, "Disjungsi Inklusif", JOptionPane.INFORMATION_MESSAGE);
        } else if (c.equalsIgnoreCase("3")) {
            String result = "p: " + i1 + " adalah ibukota dari " + n1 + " => " + p1 + "\n" 
                            + "q: " + i2 + " adalah ibukota dari " + n2 + " => " + p2 + "\n"
                            + "p\u2295q = " + tk.ekDisjungsi(p1, p2);
            JOptionPane.showMessageDialog(null, result, "Disjungsi Eksklusif", JOptionPane.INFORMATION_MESSAGE);
        } else if (c.equalsIgnoreCase("4")) {
            String result = "p: " + i1 + " adalah ibukota dari " + n1 + " => " + p1 + "\n" 
                            + "q: " + i2 + " adalah ibukota dari " + n2 + " => " + p2 + "\n"
                            + "p\u27F6q = " + tk.kondisi(p1, p2);
            JOptionPane.showMessageDialog(null, result, "Kondisi", JOptionPane.INFORMATION_MESSAGE);
        } else if (c.equalsIgnoreCase("5")) {
            String result = "p: " + i1 + " adalah ibukota dari " + n1 + " => " + p1 + "\n" 
                            + "q: " + i2 + " adalah ibukota dari " + n2 + " => " + p2 + "\n"
                            + "p\u27F7q = " + tk.bikondisi(p1, p2);
            JOptionPane.showMessageDialog(null, result, "Bikondisi", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    static void tabelKebenaran() {
        String choice, c;
        choice = "1. Negasi\n"
                + "2. Konjungsi\n"
                + "3. Disjungsi Inklusif\n"
                + "4. Disjungsi Eksklusif\n"
                + "5. Kondisi\n"
                + "6. Bikondisi\n\n"
                + "Masukan Pilihan:";
        c = JOptionPane.showInputDialog(null, choice, "Proposisi", JOptionPane.QUESTION_MESSAGE);
        
        if (c == null) {
            Matinfo.aplikasi();
        }
        
        if (c.equalsIgnoreCase("1")) {
            String negasi = "p      \u00ACp\n"
                          + "1         0\n"
                          + "0         1";
            JOptionPane.showMessageDialog(null, negasi, "Negasi", JOptionPane.INFORMATION_MESSAGE);
        } else if (c.equalsIgnoreCase("2")) {
            String konjungsi = "p    q    p\u2227q\n"
                             + "1    1       1\n"
                             + "1    0       0\n"
                             + "0    1       0\n"
                             + "0    0       0";
            JOptionPane.showMessageDialog(null, konjungsi, "Konjungsi", JOptionPane.INFORMATION_MESSAGE);
        } else if (c.equalsIgnoreCase("3")) {
            String inDisjungsi = "p    q    p\u2228q\n"
                               + "1    1       1\n"
                               + "1    0       1\n"
                               + "0    1       1\n"
                               + "0    0       0";
            JOptionPane.showMessageDialog(null, inDisjungsi, "Disjungsi Inklusif", JOptionPane.INFORMATION_MESSAGE);
        } else if (c.equalsIgnoreCase("4")) {
            String ekDisjungsi = "p    q    p\u2295q\n"
                               + "1    1       0\n"
                               + "1    0       1\n"
                               + "0    1       1\n"
                               + "0    0       0";
            JOptionPane.showMessageDialog(null, ekDisjungsi, "Disjungsi Eksklusif", JOptionPane.INFORMATION_MESSAGE);
        } else if (c.equalsIgnoreCase("5")) {
            String kondisi = "p    q    p\u27F6q\n"
                             + "1    1       1\n"
                             + "1    0       0\n"
                             + "0    1       1\n"
                             + "0    0       1";
            JOptionPane.showMessageDialog(null, kondisi, "Kondisi", JOptionPane.INFORMATION_MESSAGE);
        } else if (c.equalsIgnoreCase("6")) {
            String bikondisi = "p    q    p\u27F7q\n"
                             + "1    1       1\n"
                             + "1    0       0\n"
                             + "0    1       0\n"
                             + "0    0       1";
            JOptionPane.showMessageDialog(null, bikondisi, "Bikondisi", JOptionPane.INFORMATION_MESSAGE);
        }
        
        aplikasi();
    }
    
    
}
