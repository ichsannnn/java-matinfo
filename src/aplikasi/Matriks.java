package aplikasi;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author skadevz
 */
public class Matriks {
    
    public static void main(String[] args) {
        int r, c, v;
        String m;
        
        m = JOptionPane.showInputDialog("Tipe matriks");
        String[] split = m.split("x");
        r = Integer.valueOf(split[0]);
        c = Integer.valueOf(split[1]);
        
//        System.out.println("Row: " + r);
//        System.out.println("Column: " + c);
//        System.out.println("=============");
        
        int[][] matriks = new int[r][c];
        for (int row = 0; row < r; row++) {
            for (int col = 0; col < c; col++) {
                v = Integer.valueOf(JOptionPane.showInputDialog("Masukan angka untuk R"+ (row+1) +"C"+ (col+1)));
                matriks[row][col] = v;
            }
        }
        
        String matrikz = "";
        for (int[] matrik : matriks) {
            for (int col = 0; col < matrik.length; col++) {
                matrikz += matrik[col] + "     ";
            }
            matrikz += "\n";
        }
        
        JOptionPane.showMessageDialog(null, matrikz);
    }
    
}
