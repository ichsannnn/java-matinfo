package aplikasi;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author skadevz
 */
public class Matriks {
    
    public static void main(String[] args) {
        aplikasi();
    }
    
    static void aplikasi() {
        int r, c, v;
        String m;
        
        m = JOptionPane.showInputDialog("Ordo");
        String[] split = m.split("x");
        r = Integer.valueOf(split[0]);
        c = Integer.valueOf(split[1]);
        
        int[][] matriks = new int[r][c];
        for (int row = 0; row < r; row++) {
            for (int col = 0; col < c; col++) {
                v = Integer.valueOf(JOptionPane.showInputDialog("R"+ (row+1) +"C"+ (col+1)));
                matriks[row][col] = v;
            }
        }
        
        String matrikz = "Matriks: \n";
        for (int row = 0; row < r; row++) {
            for (int col = 0; col < c; col++) {
                matrikz +=  matriks[row][col] + "        ";
            }
            matrikz += "\n";
        }
        JOptionPane.showMessageDialog(null, matrikz);
    }
    
}
