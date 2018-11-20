package aplikasi;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import helpers.Himpunan;

/**
 *
 * @author skadevz
 */
public class Relasi {
    
    static Himpunan himpunan = new Himpunan();
    
    public static void main(String[] args) {
        aplikasi();
    }
    
    static void aplikasi() {
//        himpunan.ui("Kembali");
        String choice, c;
        choice = "1. Intro Relasi\n"
                + "2. Sifat Relasi\n"
                + "3. Penyajian Matriks\n\n"
                + "Masukan Pilihan:";
        c = JOptionPane.showInputDialog(null, choice, "Relasi Himpunan", JOptionPane.QUESTION_MESSAGE);
        
        if (c == null) {
            Matinfo.aplikasi();
        }
        
        switch (c) {
            case "1":
                introRelasi();
                break;
            case "2":
                JOptionPane.showMessageDialog(null, "Sifat Relasi", "Relasi Himpunan", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "3":
                penyajianMatriks();
                break;
            case "999":
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Pilihan tidak ada", "Relasi Himpunan", JOptionPane.ERROR_MESSAGE);
        }
        
        aplikasi();
    }
    
    static void introRelasi() {
        int a, b, rel;
        
        a = Integer.valueOf(JOptionPane.showInputDialog(null, "Jumlah elemen himpunan A", "Intro Relasi", JOptionPane.QUESTION_MESSAGE));
        b = Integer.valueOf(JOptionPane.showInputDialog(null, "Jumlah elemen himpunan B", "Intro Relasi", JOptionPane.QUESTION_MESSAGE));
        
        a = Integer.valueOf(JOptionPane.showInputDialog("Jumlah elemen himpunan B"));
        
        String himA = himpunan.himpunanToString(himpunan.listingHimpunan(a, "A", "Intro Relasi"));
        String himB = himpunan.himpunanToString(himpunan.listingHimpunan(b, "B", "Intro Relasi"));
        
        boolean t = true;
        do {            
            rel = Integer.valueOf(
                    JOptionPane.showInputDialog(null, 
                                                "Himpunan A = "+ himA + "\n"+
                                                "Himpunan B = "+ himB + "\n\n"+
                                                "Masukkan jumlah relasi. Maks: " + (a*b), 
                                                "Intro Relasi", 
                                                JOptionPane.QUESTION_MESSAGE)
            );
            if (rel > (a*b)) {
                JOptionPane.showMessageDialog(null, "Jumlah relasi melebihi maksimal", "Intro Relasi", JOptionPane.WARNING_MESSAGE);
            } else {
                t = false;
            }
        } while (t);
        
        ArrayList relasi = new ArrayList();
        String domain, kodomain;
        for (int i = 0; i < rel; i++) {
            domain = JOptionPane.showInputDialog(null, 
                                                    "Himpunan A = "+ himA + "\n"+
                                                    "Himpunan B = "+ himB + "\n\n"+
                                                    "Domain Relasi " + (i+1), 
                                                    "Intro Relasi", 
                                                    JOptionPane.QUESTION_MESSAGE);
            
            if (himA.contains(domain)) {
                kodomain = JOptionPane.showInputDialog(null, 
                                                        "Himpunan A = "+ himA + "\n"+
                                                        "Himpunan B = "+ himB + "\n\n"+
                                                        "Kodomain Relasi " + (i+1), 
                                                        "Intro Relasi", 
                                                        JOptionPane.QUESTION_MESSAGE);
                if (himB.contains(kodomain)) {
                    relasi.add("(" + domain + "," + kodomain + ")");
                } else {
                    JOptionPane.showMessageDialog(null, "Elemen "+ kodomain +" tidak ada pada himpunan B", "Intro Relasi", JOptionPane.WARNING_MESSAGE);
                    i--;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Elemen "+ domain +" tidak ada pada himpunan A", "Intro Relasi", JOptionPane.WARNING_MESSAGE);
                i--;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Himpunan A = "+ himA + "\n"+
                                            "Himpunan B = "+ himB + "\n\n"+
                                            "Relasi: " + himpunan.himpunanToString(relasi));
    }
    
    static void penyajianMatriks() {
        int c;
        String choice;
        choice = "1. Relasi\n"
                + "2. Invers Relasi\n\n"
                + "Masukan Pilihan:";
        c = Integer.valueOf(JOptionPane.showInputDialog(null, choice, "Relasi Himpunan", JOptionPane.QUESTION_MESSAGE));
        
        switch (c) {
            case 1:
                relasi();
                break;
            case 2:
                inversRelasi();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Pilihan tidak ada", "Relasi Himpunan", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    static void relasi() {
        int a, b;
        
        a = Integer.valueOf(JOptionPane.showInputDialog(null, "Jumlah elemen himpunan A", "Relasi Himpunan", JOptionPane.QUESTION_MESSAGE));
        b = Integer.valueOf(JOptionPane.showInputDialog(null, "Jumlah elemen himpunan B", "Relasi Himpunan", JOptionPane.QUESTION_MESSAGE));
        
        ArrayList himA = himpunan.listingHimpunan(a, "A", "Relasi Himpunan");
        ArrayList himB = himpunan.listingHimpunan(b, "B", "Relasi Himpunan");
        ArrayList relasi = new ArrayList();
        
        if (himA.size() != himB.size()) {
            JOptionPane.showMessageDialog(null, "Jumlah elemen tidak sama", "Relasi Himpunan", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        for (int i = 0; i < himA.size(); i++) {
            relasi.add("(" + himA.get(i) +", "+ himB.get(i) + ")");
        }
        
        
        
        JOptionPane.showMessageDialog(null, "Himpunan A = "+ himpunan.himpunanToString(himA) + "\n" +
                                            "Himpunan B = "+ himpunan.himpunanToString(himB) + "\n" +
                                            "Relasi = "+ himpunan.himpunanToString(relasi) + "\n\n" +
                                            "Penyajian Matriks\n" + himpunan.matriksRelasi(himA, himB), "Relasi Himpunan", JOptionPane.INFORMATION_MESSAGE);
    }
    
    static void inversRelasi() {
        int a, b;
        
        a = Integer.valueOf(JOptionPane.showInputDialog(null, "Jumlah elemen himpunan A", "Relasi Himpunan", JOptionPane.QUESTION_MESSAGE));
        b = Integer.valueOf(JOptionPane.showInputDialog(null, "Jumlah elemen himpunan B", "Relasi Himpunan", JOptionPane.QUESTION_MESSAGE));
        
        ArrayList himA = himpunan.listingHimpunan(a, "A", "Relasi Himpunan");
        ArrayList himB = himpunan.listingHimpunan(b, "B", "Relasi Himpunan");
        ArrayList relasi = new ArrayList();
        ArrayList inversRelasi = new ArrayList();
        
        if (himA.size() != himB.size()) {
            JOptionPane.showMessageDialog(null, "Jumlah elemen tidak sama", "Relasi Himpunan", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        for (int i = 0; i < himA.size(); i++) {
            relasi.add("(" + himA.get(i) +", "+ himB.get(i) + ")");
        }
        
        for (int i = 0; i < himA.size(); i++) {
            inversRelasi.add("(" + himB.get(i) +", "+ himA.get(i) + ")");
        }
        
        JOptionPane.showMessageDialog(null, "Himpunan A = "+ himpunan.himpunanToString(himA) + "\n" +
                                            "Himpunan B = "+ himpunan.himpunanToString(himB) + "\n" +
                                            "Relasi Himpunan A dan B = "+ himpunan.himpunanToString(relasi) + "\n" +
                                            "Invers Relasi Himpunan A dan B = "+ himpunan.himpunanToString(inversRelasi) + "\n\n" +
                                            "Penyajian Matriks\n" + himpunan.matriksRelasi(himB, himA), "Relasi Himpunan", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
