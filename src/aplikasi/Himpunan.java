package aplikasi;

import helpers.General;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author skadevz
 */
public class Himpunan {
    //Simbol matematika ( irisan, gabungan, elemen, dll )
    //https://www.fileformat.info/info/unicode/category/Sm/list.htm    
    
    static helpers.Himpunan himpunan = new helpers.Himpunan();
    static General helper = new General();
    
    public static void main(String[] args) {
        aplikasi();
    }
    
    public static void aplikasi() {
//        helper.ui("Kembail");
        String choice, c;
        choice = "1. Himpunan\n"
                + "2. Kesamaan Himpunan\n"
                + "3. Himpunan Bagian\n"
                + "4. Himpunan Kuasa\n"
                + "5. Saling Lepas\n"
                + "6. Operasi Himpunan\n\n"
                + "Masukan Pilihan:";
        c = JOptionPane.showInputDialog(null, choice, "Aplikasi Himpunan", JOptionPane.QUESTION_MESSAGE);

        if (c == null) {
            Matinfo.aplikasi();
        }
        
        switch(c) {
            case "1":
                himpunan();
                break;
            case "2":
                kesamaanHimpunan();
                break;
            case "3":
                himpunanBagian();
                break;
            case "4":
                himpunanKuasa();
                break;
            case "5":
                salingLepas();
                break;
            case "6":
                operasiHimpunan();
                break;
            case "999":
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Pilihan tidak ada", "Aplikasi Himpunan", JOptionPane.ERROR_MESSAGE);
        }
        
        aplikasi();
    }
    
    static void himpunan() {
        String choice, c;
        choice = "1. Himpunan Bilangan Asli\n"
                + "2. Himpunan Bilangan Cacah\n"
                + "3. Himpunan Bilangan Bulat\n"
                + "4. Himpunan Bilangan Prima\n"
                + "5. Himpunan Bilangan Ganjil\n"
                + "6. Himpunan Bilangan Genap\n"
                + "7. Input Manual\n\n"
                + "Masukan Pilihan:";
        c = JOptionPane.showInputDialog(null, choice, "Himpunan", JOptionPane.QUESTION_MESSAGE);
        
        if (c == null) {
            aplikasi();
        }
        
        switch(c) {
            case "1":
                ArrayList himAsli = new ArrayList();
                for (int i = 1; i < 10; i++) {
                    himAsli.add(String.valueOf(i));
                }
                JOptionPane.showMessageDialog(null, "Himpunan Bilangan Asli = " + himpunan.himpunanToString(himAsli), "Himpunan", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "2":
                ArrayList himCacah = new ArrayList();
                for (int i = 0; i < 10; i++) {
                    himCacah.add(String.valueOf(i));
                }
                JOptionPane.showMessageDialog(null, "Himpunan Bilangan Cacah = " + himpunan.himpunanToString(himCacah), "Himpunan", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "3":
                ArrayList himBulat = new ArrayList();
                for (int i = -5; i <= 5; i++) {
                    himBulat.add(String.valueOf(i));
                }
                JOptionPane.showMessageDialog(null, "Himpunan Bilangan Bulat = " + himpunan.himpunanToString(himBulat), "Himpunan", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "4":
                ArrayList himPrima = new ArrayList();
                int prima = 0;
                for (int i = 1; i <= 20; i++) {
                    for (int j = 1; j <= i; j++) {
                        if (i % j == 0) prima++;
                    }
                    if (prima == 2) 
                        himPrima.add(String.valueOf(i));
                    prima = 0;
                }
                JOptionPane.showMessageDialog(null, "Himpunan Bilangan Prima = " + himpunan.himpunanToString(himPrima), "Himpunan", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "5":
                ArrayList himGanjil = new ArrayList();
                int x = 1;
                for (int i = 0; i < 10; i++) {
                    himGanjil.add(String.valueOf(x));
                    x += 2;
                }
                JOptionPane.showMessageDialog(null, "Himpunan Bilangan Ganjil = " + himpunan.himpunanToString(himGanjil), "Himpunan", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "6":
                ArrayList himGenap = new ArrayList();
                int y = 2;
                for (int i = 0; i < 10; i++) {
                    himGenap.add(String.valueOf(y));
                    y += 2;
                }
                JOptionPane.showMessageDialog(null, "Himpunan Bilangan Genap = " + himpunan.himpunanToString(himGenap), "Himpunan", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "7":
                himpunanManual();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Pilihan tidak ada", "Himpunan", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    static void himpunanManual() {
        int a, b;
        
        a = Integer.valueOf(JOptionPane.showInputDialog(null, "Jumlah elemen himpunan A", "Himpunan", JOptionPane.QUESTION_MESSAGE));
        b = Integer.valueOf(JOptionPane.showInputDialog(null, "Jumlah elemen himpunan B", "Himpunan", JOptionPane.QUESTION_MESSAGE));
        
        String himA = himpunan.himpunanToString(himpunan.listingHimpunan(a, "A", "Himpunan"));
        String himB = himpunan.himpunanToString(himpunan.listingHimpunan(b, "B", "Himpunan"));
        
        JOptionPane.showMessageDialog(null, "Himpunan A = "+ himA + "\n" +
                                            "Himpunan B = "+ himB + "\n", "Himpunan", JOptionPane.INFORMATION_MESSAGE);
    }
    
    static void kesamaanHimpunan() {
        int a, b;
        String eq;
        
        a = Integer.valueOf(JOptionPane.showInputDialog(null, "Jumlah elemen himpunan A", "Kesamaan Himpunan", JOptionPane.QUESTION_MESSAGE));
        b = Integer.valueOf(JOptionPane.showInputDialog(null, "Jumlah elemen himpunan B", "Kesamaan Himpunan", JOptionPane.QUESTION_MESSAGE));
        
        ArrayList himA = himpunan.listingHimpunan(a, "A", "Kesamaan Himpunan");
        ArrayList himB = himpunan.listingHimpunan(b, "B", "Kesamaan Himpunan");
        
        ArrayList mergedA = himpunan.mergeSame(himA);
        ArrayList mergedB = himpunan.mergeSame(himB);
        
        if (mergedA.isEmpty() || mergedB.isEmpty()) {
            eq = " ";
        } else {
            if (mergedA.size() == mergedB.size()) {
                if (mergedB.equals(mergedA)) {
                    eq = " ";
                } else {
                    eq = " tidak ";
                }
            } else {
                eq = " tidak ";
            }
        }
        
        JOptionPane.showMessageDialog(null, "Himpunan A = "+ himpunan.himpunanToString(himA) + "\n" +
                                            "Himpunan B = "+ himpunan.himpunanToString(himB) + "\n\n" +
                                            "Himpunan A" + eq + "sama dengan Himpunan B"+ "\n", "Kesamaan Himpunan", JOptionPane.INFORMATION_MESSAGE);
    }
    
    static void himpunanBagian() {
        int a, b;
        String result;
        a = Integer.valueOf(JOptionPane.showInputDialog(null, "Jumlah elemen himpunan A", "Himpunan Bagian", JOptionPane.QUESTION_MESSAGE));
        b = Integer.valueOf(JOptionPane.showInputDialog(null, "Jumlah elemen himpunan B", "Himpunan Bagian", JOptionPane.QUESTION_MESSAGE));
        
        ArrayList himA = himpunan.listingHimpunan(a, "A", "Himpunan Bagian");
        ArrayList himB = himpunan.listingHimpunan(b, "B", "Himpunan Bagian");
        
        if (himA.containsAll(himB) || himB.containsAll(himA)) {
            if (himA.size() > himB.size()) {
                result = "B\u2282A (Subset)\nA\u2283B (Superset)";
            } else if (himB.size() > himA.size()) {
                result = "A\u2282B (Subset)\nB\u2283A (Superset)";
            } else {
                result = "A\u2286B (Subset atau Sama Dengan)\nB\u2287A (Superset atau Sama Dengan)";
            }
        } else {
            result = "Himpunan A Bukan Bagian Himpunan B\nA\u2284B dan B\u2284A";
        }
        
        JOptionPane.showMessageDialog(null, "Himpunan A = "+ himpunan.himpunanToString(himA) +"\n"+
                                            "Himpunan B = "+ himpunan.himpunanToString(himB) +"\n\n"+
                                            result, "Himpunan Bagian", JOptionPane.INFORMATION_MESSAGE);
    }
    
    static void himpunanKuasa() {
        int a;
        
        a = Integer.valueOf(JOptionPane.showInputDialog(null, "Jumlah elemen himpunan", "Himpunan Kuasa", JOptionPane.QUESTION_MESSAGE));
        Set<Integer> him = new HashSet();
        for (int i = 0; i < a; i++) {
            int s = Integer.valueOf(JOptionPane.showInputDialog(null, "Masukkan elemen ke-" + (i + 1) + " : ", "Himpunan Kuasa", JOptionPane.QUESTION_MESSAGE));
            him.add(s);
        }
        
        ArrayList himKuasa = new ArrayList();
        
        for (Set<Integer> s : himpunan.powerSet(him)) {
            if (s.isEmpty()) {
                himKuasa.add("\u2205");
            } else {
                himKuasa.add("\n" + s.toString().replace('[', '(').replace(']', ')'));
            }
        }
        
        Collections.sort(himKuasa, (String s1, String s2) -> s1.length() - s2.length());
        
        JOptionPane.showMessageDialog(null, "Himpunan Kuasa 2^"+ a +"\n" + himpunan.himpunanToString(himKuasa), "Himpunan Kuasa", JOptionPane.INFORMATION_MESSAGE);
    }
    
    static void salingLepas() {
        int a, b;
        String result = "Saling Lepas";
        a = Integer.valueOf(JOptionPane.showInputDialog(null, "Jumlah elemen himpunan A", "Himpunan Saling Lepas", JOptionPane.QUESTION_MESSAGE));
        b = Integer.valueOf(JOptionPane.showInputDialog(null, "Jumlah elemen himpunan B", "Himpunan Saling Lepas", JOptionPane.QUESTION_MESSAGE));
        
        ArrayList himA = himpunan.listingHimpunan(a, "A", "Gabungan Himpunan");
        ArrayList himB = himpunan.listingHimpunan(b, "B", "Gabungan Himpunan");
        
        for (int i = 0; i < himA.size(); i++) {
            for (int j = 0; j < himB.size(); j++) {
                if (himA.get(i).equals(himB.get(j))) {
                    result = "Tidak Saling Lepas";
                }
            }
        }
        
        JOptionPane.showMessageDialog(null, "Himpunan A = "+ himpunan.himpunanToString(himA) +"\n"+
                                            "Himpunan B = "+ himpunan.himpunanToString(himB) +"\n\n"+
                                            "Himpunan A dan Himpunan B "+ result, "Himpunan Saling Lepas", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
    static void operasiHimpunan() {
        String choice, c;
        choice = "1. Gabungan (Union)\n"
                + "2. Irisan (Intersection)\n"
                + "3. Selisih (Difference)\n"
                + "4. Komplemen (Complement)\n\n"
                + "Masukan Pilihan:";
        c = JOptionPane.showInputDialog(null, choice, "Aplikasi Himpunan", JOptionPane.QUESTION_MESSAGE);
        
        if (c == null) {
            aplikasi();
        }
        
        switch(c) {
            case "1": 
                gabungan();
                break;
            case "2":
                irisan();
                break;
            case "3":
                selisih();
                break;
            case "4":
                komplemen();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Pilihan tidak ada", "Operasi Himpunan", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    static void gabungan() {
        int a, b;
        a = Integer.valueOf(JOptionPane.showInputDialog(null, "Jumlah elemen himpunan A", "Gabungan Himpunan", JOptionPane.QUESTION_MESSAGE));
        b = Integer.valueOf(JOptionPane.showInputDialog(null, "Jumlah elemen himpunan B", "Gabungan Himpunan", JOptionPane.QUESTION_MESSAGE));
        
        ArrayList himA = himpunan.listingHimpunan(a, "A", "Gabungan Himpunan");
        ArrayList himB = himpunan.listingHimpunan(b, "B", "Gabungan Himpunan");

        ArrayList himC = new ArrayList();
        for (int i = 0; i < himA.size(); i++) {
            if (!himC.contains(himA.get(i))) {
                himC.add(himA.get(i));
            }
        }
        
        for (int i = 0; i < himB.size(); i++) {
            if (!himC.contains(himB.get(i))) {
                himC.add(himB.get(i));
            }
        }
        
        Collections.sort(himC);
        JOptionPane.showMessageDialog(null, "Himpunan A = "+ himpunan.himpunanToString(himA) +"\n"+
                                            "Himpunan B = "+ himpunan.himpunanToString(himB) +"\n\n"+
                                            "A\u222AB = "+ himpunan.himpunanToString(himC), "Gabungan Himpunan", JOptionPane.INFORMATION_MESSAGE);
    }
    
    static void irisan() {
        int a, b;
        a = Integer.valueOf(JOptionPane.showInputDialog(null, "Jumlah elemen himpunan A", "Irisan Himpunan", JOptionPane.QUESTION_MESSAGE));
        b = Integer.valueOf(JOptionPane.showInputDialog(null, "Jumlah elemen himpunan B", "Irisan Himpunan", JOptionPane.QUESTION_MESSAGE));
        
        ArrayList himA = himpunan.listingHimpunan(a, "A", "Irisan Himpunan");
        ArrayList himB = himpunan.listingHimpunan(b, "B", "Irisan Himpunan");
        
        ArrayList mergedA = himpunan.mergeSame(himA);
        ArrayList mergedB = himpunan.mergeSame(himB);
        
        ArrayList himC = new ArrayList();
        for (int i = 0; i < mergedA.size(); i++) {
            for (int j = 0; j < mergedB.size(); j++) {
                if (mergedA.get(i).equals(mergedB.get(j))) {
                    himC.add(himA.get(i));
                }   
            }
        }
        
        Collections.sort(himC);
        JOptionPane.showMessageDialog(null, "Himpunan A = "+ himpunan.himpunanToString(himA) +"\n"+
                                            "Himpunan B = "+ himpunan.himpunanToString(himB) +"\n\n"+
                                            "A\u2229B = "+ himpunan.himpunanToString(himC), "Irisan Himpunan", JOptionPane.INFORMATION_MESSAGE);
    }
    
    static void selisih() {
        int a, b;
        a = Integer.valueOf(JOptionPane.showInputDialog(null, "Jumlah elemen himpunan A", "Selisih Himpunan", JOptionPane.QUESTION_MESSAGE));
        b = Integer.valueOf(JOptionPane.showInputDialog(null, "Jumlah elemen himpunan B", "Selisih Himpunan", JOptionPane.QUESTION_MESSAGE));
        
        ArrayList himA = himpunan.listingHimpunan(a, "A", "Selisih Himpunan");
        ArrayList himB = himpunan.listingHimpunan(b, "B", "Selisih Himpunan");
        
        ArrayList diffA = himpunan.diff(himA, himB);
        ArrayList diffB = himpunan.diff(himB, himA);
        
        JOptionPane.showMessageDialog(null, "Himpunan A = "+ himpunan.himpunanToString(himA) +"\n"+
                                            "Himpunan B = "+ himpunan.himpunanToString(himB) +"\n\n"+
                                            "A-B = "+ himpunan.himpunanToString(diffA) + "\n" +
                                            "B-A = "+ himpunan.himpunanToString(diffB), "Selisih Himpunan", JOptionPane.INFORMATION_MESSAGE);
    }
    
    static void komplemen() {
        int u, a;
        u = Integer.valueOf(JOptionPane.showInputDialog(null, "Jumlah elemen himpunan U", "Komplemen Himpunan", JOptionPane.QUESTION_MESSAGE));
        a = Integer.valueOf(JOptionPane.showInputDialog(null, "Jumlah elemen himpunan A", "Komplemen Himpunan", JOptionPane.QUESTION_MESSAGE));
        
        ArrayList himU = himpunan.listingHimpunan(u, "U", "Komplemen Himpunan");
        ArrayList himA = himpunan.listingHimpunan(a, "A", "Komplemen Himpunan");
        
        ArrayList complement = himpunan.diff(himU, himA);
        
        JOptionPane.showMessageDialog(null, "Himpunan U = "+ himpunan.himpunanToString(himU) +"\n"+
                                            "Himpunan A = "+ himpunan.himpunanToString(himA) +"\n\n"+
                                            "Himpunan A\u2201 = "+ himpunan.himpunanToString(complement), "Komplemen Himpunan", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
