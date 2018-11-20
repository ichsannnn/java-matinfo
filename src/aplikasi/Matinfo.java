package aplikasi;

import helpers.General;
import javax.swing.JOptionPane;

/**
 *
 * @author skadevz
 */
public class Matinfo {
    
    static General helper = new General();
    
    public static void main(String[] args) {
        aplikasi();
    }
    
    static void aplikasi() {
//        helper.ui("Keluar");
        String choice, c;
        choice = "1. Himpunan\n"
                + "2. Relasi\n"
                + "3. Matriks\n\n"
                + "Masukan Pilihan:";
        c = JOptionPane.showInputDialog(null, choice, "Matematika Informatika", JOptionPane.QUESTION_MESSAGE);
        
        if (c == null) {
            System.exit(0);
        }
        
        switch(c) {
            case "1": 
                Himpunan.aplikasi();
                break;
            case "2": 
                Relasi.aplikasi();
                break;
            case "3":
                Matriks.aplikasi();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Pilihan tidak ada", "Matematika Informatika", JOptionPane.ERROR_MESSAGE);
        }
        
        aplikasi();
    }
    
}
