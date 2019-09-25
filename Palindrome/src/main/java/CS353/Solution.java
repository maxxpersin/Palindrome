package CS353;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    /*
     * @param s: A string
     * 
     * @return: A list of lists of string
     */
    public List<List<String>> partition(String s) {
        HashMap<Integer, String> h = new HashMap<Integer, String>();
        List<List<String>> result = new ArrayList();
        List<String> l = new ArrayList<String>();
        if (s == null) {
            return new ArrayList();
        } else if (s.length() == 1) {
            l.add(s.charAt(0) + "");
            result.add(l);
            return result;
        }
        helper(s, l, h);

        return result;
    }

    private void helper(String s, List<String> l, HashMap<Integer, String> h) {

    }

    private boolean isPalindrome(String s) {
        for (int startIdx = 0, endIdx = s.length() - 1; startIdx < endIdx; startIdx++, endIdx--) {
            if (s.charAt(startIdx) != s.charAt(endIdx)) {
                return false;
            }
        }
        return true;
    }

}