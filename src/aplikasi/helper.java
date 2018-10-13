package aplikasi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author skadevz
 */
public class helper {
    
    static void skadevz() {
        JOptionPane.showMessageDialog(null, "Created by skadevz", "\u00A9", JOptionPane.INFORMATION_MESSAGE);
    }
    
    static String himpunanToString(ArrayList himpunan) {
        Iterator<String> it = himpunan.iterator();
        String result = "{}";
        if (it.hasNext()) {
            result = "{ ";
            while (it.hasNext()) {
                String next = it.next();
                result += next;
                if (!it.hasNext()) 
                    result += " }";
                else 
                    result += ", ";
            }
        }
        return result;
    }
    
    static ArrayList listingHimpunan(int count, String group, String title) {
        ArrayList him = new ArrayList();
        for (int i = 0; i < count; i++) {
            String s = JOptionPane.showInputDialog(null, "Masukkan elemen " + group + (i + 1) + " : ", title, JOptionPane.QUESTION_MESSAGE);
            
//            if (him.contains(s)) {
//                System.out.println("Sudah ada");
//                i--;
//            } else {
                him.add(s);
//            }
        }
        return him;
    }
    
    static <T> Set<Set<T>> powerSet(Set<T> originalSet) {
        Set<Set<T>> sets = new HashSet<>();
        if (originalSet.isEmpty()) {
            sets.add(new HashSet<>());
            return sets;
        }
        List<T> list = new ArrayList<>(originalSet);
        T head = list.get(0);
        Set<T> rest = new HashSet<>(list.subList(1, list.size()));
        for (Set<T> set : powerSet(rest)) {
            Set<T> newSet = new HashSet<>();
            newSet.add(head);
            newSet.addAll(set);
            sets.add(newSet);
            sets.add(set);
        }
        return sets;
    }
    
    static ArrayList mergeSame(ArrayList himpunan) {
        ArrayList result = new ArrayList();
        for (Iterator iterator = himpunan.iterator(); iterator.hasNext();) {
            Object next = iterator.next();
            if (!result.contains(next)) {
                result.add(next);
            }
        }
        
        Collections.sort(result);
        return result;
    }
    
    static ArrayList diff(ArrayList x, ArrayList y) {
        ArrayList z = new ArrayList();
        z.addAll(x);
        z.removeAll(y);
        return z;
    }
    
    
    // for testing purpose
    public static void main(String[] args) {
        ArrayList test = new ArrayList();
        test.add(1);
        test.add(2);
        test.add(2);
        test.add(3);
        test.add(2);
        
        System.out.println(mergeSame(test));
        System.out.println(mergeSame(test).size());
    }
    
}

