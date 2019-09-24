package CS353;

import java.util.List;
import java.util.ArrayList;

public class Solution {
    /*
     * @param s: A string
     * 
     * @return: A list of lists of string
     */
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList();
        List<String> l = new ArrayList<String>();
        if (s == null) {
            return new ArrayList();
        } else if (s.length() == 1) {
            l.add(s.charAt(0) + "");
            result.add(l);
            return result;
        }
        return new ArrayList();
    }

}