package aplikasi;

import javax.swing.JOptionPane;

/**
 *
 * @author skadevz
 */
public class DesimalBiner {
    
    public static void main(String[] args) {
        int bil, clone, bit[] = new int[50], y = 0;
        
        bil = Integer.valueOf(JOptionPane.showInputDialog(null, "Masukkan angka desimal", "Desimal2Biner", JOptionPane.INFORMATION_MESSAGE));
        clone = bil;
        
        do {
            bit[y] = bil % 2;
            bil = bil / 2;
            y++;
        } while (bil > 0);
        
        y -= 1;
        
        System.out.print("Biner dari "+clone+": ");
        for (int x = y; x >= 0; x--) {
            System.out.print(bit[x]);
        }
        System.out.println("");
    }
    
}
