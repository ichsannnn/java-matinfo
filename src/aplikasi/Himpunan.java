package aplikasi;

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
    public static void main(String[] args) {
        aplikasi();
    }
    
    static void aplikasi() {
        int c;
        String choice;
        choice = "1. Himpunan\n"
                + "2. Kesamaan Himpunan\n"
                + "3. Himpunan Bagian\n"
                + "4. Himpunan Kuasa\n"
                + "5. Saling Lepas\n"
                + "6. Operasi Himpunan\n\n"
                + "Masukan Pilihan:";
        c = Integer.valueOf(JOptionPane.showInputDialog(null, choice, "Aplikasi Himpunan", JOptionPane.QUESTION_MESSAGE));
        
        switch(c) {
            case 1:
                himpunan();
                break;
            case 2:
                kesamaanHimpunan();
                break;
            case 3:
                himpunanBagian();
                break;
            case 4:
                himpunanKuasa();
                break;
            case 5:
                salingLepas();
                break;
            case 6:
                operasiHimpunan();
                break;
            case 999:
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Pilihan tidak ada", "Aplikasi Himpunan", JOptionPane.ERROR_MESSAGE);
        }
        
        aplikasi();
    }
    
    static void himpunan() {
        int c;
        String choice;
        choice = "1. Himpunan Bilangan Asli\n"
                + "2. Himpunan Bilangan Cacah\n"
                + "3. Himpunan Bilangan Bulat\n"
                + "4. Himpunan Bilangan Prima\n"
                + "5. Himpunan Bilangan Ganjil\n"
                + "6. Himpunan Bilangan Genap\n"
                + "7. Input Manual\n\n"
                + "Masukan Pilihan:";
        c = Integer.valueOf(JOptionPane.showInputDialog(null, choice, "Himpunan", JOptionPane.QUESTION_MESSAGE));
        
        switch(c) {
            case 1:
                ArrayList himAsli = new ArrayList();
                for (int i = 1; i < 10; i++) {
                    himAsli.add(String.valueOf(i));
                }
                JOptionPane.showMessageDialog(null, "Himpunan Bilangan Asli = " + helper.himpunanToString(himAsli), "Himpunan", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                ArrayList himCacah = new ArrayList();
                for (int i = 0; i < 10; i++) {
                    himCacah.add(String.valueOf(i));
                }
                JOptionPane.showMessageDialog(null, "Himpunan Bilangan Cacah = " + helper.himpunanToString(himCacah), "Himpunan", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 3:
                ArrayList himBulat = new ArrayList();
                for (int i = -5; i <= 5; i++) {
                    himBulat.add(String.valueOf(i));
                }
                JOptionPane.showMessageDialog(null, "Himpunan Bilangan Bulat = " + helper.himpunanToString(himBulat), "Himpunan", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 4:
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
                JOptionPane.showMessageDialog(null, "Himpunan Bilangan Prima = " + helper.himpunanToString(himPrima), "Himpunan", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 5:
                ArrayList himGanjil = new ArrayList();
                int x = 1;
                for (int i = 0; i < 10; i++) {
                    himGanjil.add(String.valueOf(x));
                    x += 2;
                }
                JOptionPane.showMessageDialog(null, "Himpunan Bilangan Ganjil = " + helper.himpunanToString(himGanjil), "Himpunan", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 6:
                ArrayList himGenap = new ArrayList();
                int y = 2;
                for (int i = 0; i < 10; i++) {
                    himGenap.add(String.valueOf(y));
                    y += 2;
                }
                JOptionPane.showMessageDialog(null, "Himpunan Bilangan Genap = " + helper.himpunanToString(himGenap), "Himpunan", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 7:
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
        
        String himA = helper.himpunanToString(helper.listingHimpunan(a, "A", "Himpunan"));
        String himB = helper.himpunanToString(helper.listingHimpunan(b, "B", "Himpunan"));
        
        JOptionPane.showMessageDialog(null, "Himpunan A = "+ himA + "\n" +
                                            "Himpunan B = "+ himB + "\n", "Himpunan", JOptionPane.INFORMATION_MESSAGE);
    }
    
    static void kesamaanHimpunan() {
        int a, b;
        String eq;
        
        a = Integer.valueOf(JOptionPane.showInputDialog(null, "Jumlah elemen himpunan A", "Kesamaan Himpunan", JOptionPane.QUESTION_MESSAGE));
        b = Integer.valueOf(JOptionPane.showInputDialog(null, "Jumlah elemen himpunan B", "Kesamaan Himpunan", JOptionPane.QUESTION_MESSAGE));
        
        ArrayList himA = helper.listingHimpunan(a, "A", "Kesamaan Himpunan");
        ArrayList himB = helper.listingHimpunan(b, "B", "Kesamaan Himpunan");
        
        ArrayList mergedA = helper.mergeSame(himA);
        ArrayList mergedB = helper.mergeSame(himB);
        
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
        
        JOptionPane.showMessageDialog(null, "Himpunan A = "+ helper.himpunanToString(himA) + "\n" +
                                            "Himpunan B = "+ helper.himpunanToString(himB) + "\n\n" +
                                            "Himpunan A" + eq + "sama dengan Himpunan B"+ "\n", "Kesamaan Himpunan", JOptionPane.INFORMATION_MESSAGE);
    }
    
    static void himpunanBagian() {
        int a, b;
        String result;
        a = Integer.valueOf(JOptionPane.showInputDialog(null, "Jumlah elemen himpunan A", "Himpunan Bagian", JOptionPane.QUESTION_MESSAGE));
        b = Integer.valueOf(JOptionPane.showInputDialog(null, "Jumlah elemen himpunan B", "Himpunan Bagian", JOptionPane.QUESTION_MESSAGE));
        
        ArrayList himA = helper.listingHimpunan(a, "A", "Himpunan Bagian");
        ArrayList himB = helper.listingHimpunan(b, "B", "Himpunan Bagian");
        
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
        
        JOptionPane.showMessageDialog(null, "Himpunan A = "+ helper.himpunanToString(himA) +"\n"+
                                            "Himpunan B = "+ helper.himpunanToString(himB) +"\n\n"+
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
        
        for (Set<Integer> s : helper.powerSet(him)) {
            if (s.isEmpty()) {
                himKuasa.add("\u2205");
            } else {
                himKuasa.add("\n" + s.toString().replace('[', '(').replace(']', ')'));
            }
        }
        
        Collections.sort(himKuasa, (String s1, String s2) -> s1.length() - s2.length());
        
        JOptionPane.showMessageDialog(null, "Himpunan Kuasa 2^"+ a +"\n" + helper.himpunanToString(himKuasa), "Himpunan Kuasa", JOptionPane.INFORMATION_MESSAGE);
    }
    
    static void salingLepas() {
        int a, b;
        String result = "Saling Lepas";
        a = Integer.valueOf(JOptionPane.showInputDialog(null, "Jumlah elemen himpunan A", "Himpunan Saling Lepas", JOptionPane.QUESTION_MESSAGE));
        b = Integer.valueOf(JOptionPane.showInputDialog(null, "Jumlah elemen himpunan B", "Himpunan Saling Lepas", JOptionPane.QUESTION_MESSAGE));
        
        ArrayList himA = helper.listingHimpunan(a, "A", "Gabungan Himpunan");
        ArrayList himB = helper.listingHimpunan(b, "B", "Gabungan Himpunan");
        
        for (int i = 0; i < himA.size(); i++) {
            for (int j = 0; j < himB.size(); j++) {
                if (himA.get(i).equals(himB.get(j))) {
                    result = "Tidak Saling Lepas";
                }
            }
        }
        
        JOptionPane.showMessageDialog(null, "Himpunan A = "+ helper.himpunanToString(himA) +"\n"+
                                            "Himpunan B = "+ helper.himpunanToString(himB) +"\n\n"+
                                            "Himpunan A dan Himpunan B "+ result, "Himpunan Saling Lepas", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
    static void operasiHimpunan() {
        int c;
        String choice;
        choice = "1. Gabungan (Union)\n"
                + "2. Irisan (Intersection)\n"
                + "3. Selisih (Difference)\n"
                + "4. Komplemen (Complement)\n\n"
                + "Masukan Pilihan:";
        c = Integer.valueOf(JOptionPane.showInputDialog(null, choice, "Aplikasi Himpunan", JOptionPane.QUESTION_MESSAGE));
        
        switch(c) {
            case 1: 
                gabungan();
                break;
            case 2:
                irisan();
                break;
            case 3:
                selisih();
                break;
            case 4:
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
        
        ArrayList himA = helper.listingHimpunan(a, "A", "Gabungan Himpunan");
        ArrayList himB = helper.listingHimpunan(b, "B", "Gabungan Himpunan");

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
        JOptionPane.showMessageDialog(null, "Himpunan A = "+ helper.himpunanToString(himA) +"\n"+
                                            "Himpunan B = "+ helper.himpunanToString(himB) +"\n\n"+
                                            "A\u222AB = "+ helper.himpunanToString(himC), "Gabungan Himpunan", JOptionPane.INFORMATION_MESSAGE);
    }
    
    static void irisan() {
        int a, b;
        a = Integer.valueOf(JOptionPane.showInputDialog(null, "Jumlah elemen himpunan A", "Irisan Himpunan", JOptionPane.QUESTION_MESSAGE));
        b = Integer.valueOf(JOptionPane.showInputDialog(null, "Jumlah elemen himpunan B", "Irisan Himpunan", JOptionPane.QUESTION_MESSAGE));
        
        ArrayList himA = helper.listingHimpunan(a, "A", "Irisan Himpunan");
        ArrayList himB = helper.listingHimpunan(b, "B", "Irisan Himpunan");
        
        ArrayList mergedA = helper.mergeSame(himA);
        ArrayList mergedB = helper.mergeSame(himB);
        
        ArrayList himC = new ArrayList();
        for (int i = 0; i < mergedA.size(); i++) {
            for (int j = 0; j < mergedB.size(); j++) {
                if (mergedA.get(i).equals(mergedB.get(j))) {
                    himC.add(himA.get(i));
                }   
            }
        }
        
        Collections.sort(himC);
        JOptionPane.showMessageDialog(null, "Himpunan A = "+ helper.himpunanToString(himA) +"\n"+
                                            "Himpunan B = "+ helper.himpunanToString(himB) +"\n\n"+
                                            "A\u2229B = "+ helper.himpunanToString(himC), "Irisan Himpunan", JOptionPane.INFORMATION_MESSAGE);
    }
    
    static void selisih() {
        int a, b;
        a = Integer.valueOf(JOptionPane.showInputDialog(null, "Jumlah elemen himpunan A", "Selisih Himpunan", JOptionPane.QUESTION_MESSAGE));
        b = Integer.valueOf(JOptionPane.showInputDialog(null, "Jumlah elemen himpunan B", "Selisih Himpunan", JOptionPane.QUESTION_MESSAGE));
        
        ArrayList himA = helper.listingHimpunan(a, "A", "Selisih Himpunan");
        ArrayList himB = helper.listingHimpunan(b, "B", "Selisih Himpunan");
        
        ArrayList diffA = helper.diff(himA, himB);
        ArrayList diffB = helper.diff(himB, himA);
        
        JOptionPane.showMessageDialog(null, "Himpunan A = "+ helper.himpunanToString(himA) +"\n"+
                                            "Himpunan B = "+ helper.himpunanToString(himB) +"\n\n"+
                                            "A-B = "+ helper.himpunanToString(diffA) + "\n" +
                                            "B-A = "+ helper.himpunanToString(diffB), "Selisih Himpunan", JOptionPane.INFORMATION_MESSAGE);
    }
    
    static void komplemen() {
        int u, a;
        u = Integer.valueOf(JOptionPane.showInputDialog(null, "Jumlah elemen himpunan U", "Komplemen Himpunan", JOptionPane.QUESTION_MESSAGE));
        a = Integer.valueOf(JOptionPane.showInputDialog(null, "Jumlah elemen himpunan A", "Komplemen Himpunan", JOptionPane.QUESTION_MESSAGE));
        
        ArrayList himU = helper.listingHimpunan(u, "U", "Komplemen Himpunan");
        ArrayList himA = helper.listingHimpunan(a, "A", "Komplemen Himpunan");
        
        ArrayList complement = helper.diff(himU, himA);
        
        JOptionPane.showMessageDialog(null, "Himpunan U = "+ helper.himpunanToString(himU) +"\n"+
                                            "Himpunan A = "+ helper.himpunanToString(himA) +"\n\n"+
                                            "Himpunan A\u2201 = "+ helper.himpunanToString(complement), "Komplemen Himpunan", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
