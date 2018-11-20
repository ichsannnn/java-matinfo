package helpers;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author skadevz
 */
public class General {

    public void skadevz() {
        JOptionPane.showMessageDialog(null, "Created by skadevz", "\u00A9", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void ui(String text) {
        UIManager.put("OptionPane.cancelButtonText", text);
    }
    
}
