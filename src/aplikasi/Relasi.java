package aplikasi;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author skadevz
 */
public class Relasi {
    
    public static void main(String[] args) {
        aplikasi();
    }
    
    static void aplikasi() {
        int c;
        String choice;
        choice = "1. Sifat Relasi\n"
                + "2. Penyajian Matriks\n\n"
                + "Masukan Pilihan:";
        c = Integer.valueOf(JOptionPane.showInputDialog(null, choice, "Relasi Himpunan", JOptionPane.QUESTION_MESSAGE));
        
        switch (c) {
            case 1:
                JOptionPane.showMessageDialog(null, "Sifat Relasi", "Relasi Himpunan", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                penyajianMatriks();
                break;
            case 999:
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Pilihan tidak ada", "Relasi Himpunan", JOptionPane.ERROR_MESSAGE);
        }
        
        aplikasi();
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
        
        ArrayList himA = helper.listingHimpunan(a, "A", "Relasi Himpunan");
        ArrayList himB = helper.listingHimpunan(b, "B", "Relasi Himpunan");
        ArrayList relasi = new ArrayList();
        
        if (himA.size() != himB.size()) {
            JOptionPane.showMessageDialog(null, "Jumlah elemen tidak sama", "Relasi Himpunan", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        for (int i = 0; i < himA.size(); i++) {
            relasi.add("(" + himA.get(i) +", "+ himB.get(i) + ")");
        }
        
        
        
        JOptionPane.showMessageDialog(null, "Himpunan A = "+ helper.himpunanToString(himA) + "\n" +
                                            "Himpunan B = "+ helper.himpunanToString(himB) + "\n" +
                                            "Relasi = "+ helper.himpunanToString(relasi) + "\n\n" +
                                            "Penyajian Matriks\n" + helper.matriksRelasi(himA, himB), "Relasi Himpunan", JOptionPane.INFORMATION_MESSAGE);
    }
    
    static void inversRelasi() {
        int a, b;
        
        a = Integer.valueOf(JOptionPane.showInputDialog(null, "Jumlah elemen himpunan A", "Relasi Himpunan", JOptionPane.QUESTION_MESSAGE));
        b = Integer.valueOf(JOptionPane.showInputDialog(null, "Jumlah elemen himpunan B", "Relasi Himpunan", JOptionPane.QUESTION_MESSAGE));
        
        ArrayList himA = helper.listingHimpunan(a, "A", "Relasi Himpunan");
        ArrayList himB = helper.listingHimpunan(b, "B", "Relasi Himpunan");
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
        
        JOptionPane.showMessageDialog(null, "Himpunan A = "+ helper.himpunanToString(himA) + "\n" +
                                            "Himpunan B = "+ helper.himpunanToString(himB) + "\n" +
                                            "Relasi Himpunan A dan B = "+ helper.himpunanToString(relasi) + "\n" +
                                            "Invers Relasi Himpunan A dan B = "+ helper.himpunanToString(inversRelasi) + "\n\n" +
                                            "Penyajian Matriks\n" + helper.matriksRelasi(himB, himA), "Relasi Himpunan", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
