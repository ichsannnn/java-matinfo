package aplikasi;

/**
 *
 * @author skadevz
 */
public class DesimalBiner {
    
    public static void main(String[] args) {
        int bil = 1709, bit[] = new int[50], y = 0;
        
        do {
            bit[y] = bil % 2;
            bil = bil / 2;
            y++;
        } while (bil > 0);
        
        y -= 1;
        
        System.out.print("Biner dari 1709: ");
        for (int x = y; x >= 0; x--) {
            System.out.print(bit[x]);
        }
        System.out.println("");
    }
    
}
