package helpers;

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
public class Himpunan {

    public String himpunanToString(ArrayList himpunan) {
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
    
    public ArrayList listingHimpunan(int count, String group, String title) {
        ArrayList him = new ArrayList();
        for (int i = 0; i < count; i++) {
            String s = JOptionPane.showInputDialog(null, "Masukkan elemen " + group + (i + 1) + " : ", title, JOptionPane.QUESTION_MESSAGE);
            him.add(s);
//            if (him.contains(s)) {
//                System.out.println("Sudah ada");
//                i--;
//            } else {
//            }
        }
        return him;
    }
    
    public <T> Set<Set<T>> powerSet(Set<T> originalSet) {
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
    
    public ArrayList mergeSame(ArrayList himpunan) {
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
    
    public ArrayList diff(ArrayList x, ArrayList y) {
        ArrayList z = new ArrayList();
        z.addAll(x);
        z.removeAll(y);
        return z;
    }
    
    public String matriksRelasi(ArrayList himA, ArrayList himB) {
        String matriks;
        matriks = "   ";
        for (int i = 0; i < himA.size(); i++) {
            matriks += himA.get(i) + " ";
        }
        matriks += "\n";
        for (int i = 0; i < himA.size(); i++) {
            matriks += himB.get(i) + " \t";
            for (int j = 0; j < himB.size(); j++) {
                if (i == j) {
                    matriks += "1";
                } else {
                    matriks += "0";
                }
                matriks += " ";
            }
            matriks += "\n";
        }
        return matriks;
    }
    
}
