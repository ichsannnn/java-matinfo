package aplikasi;

import javax.swing.JOptionPane;

/**
 *
 * @author skadevz
 */
public class Matinfo {
    
    public static void main(String[] args) {
        int c;
        String choice;
        choice = "1. Himpunan\n"
                + "2. Relasi\n\n"
//                + "3. Matriks\n\n"
                + "Masukan Pilihan:";
        c = Integer.valueOf(JOptionPane.showInputDialog(null, choice, "Matematika Informatika", JOptionPane.QUESTION_MESSAGE));
        
        switch(c) {
            case 1: 
                Himpunan.main(args);
                break;
            case 2: 
                Relasi.main(args);
                break;
            case 3:
                Matriks.main(args);
//                JOptionPane.showMessageDialog(null, "Ini Matriks", "Matematika Informatika", JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Pilihan tidak ada", "Matematika Informatika", JOptionPane.ERROR_MESSAGE);
        }
        
        helper.skadevz();
    }
    
}
