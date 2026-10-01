class Solution {
    public boolean isSubsequence(String s, String t) {
        if ("".equals(s)) return true;
        int indexS = 0;
        for (char c : t.toCharArray()) {
            if (c == s.charAt(indexS)) {
                ++indexS;
            }
            if (indexS == s.length()) {
                return true;
            }
        }
        return false;
    }
}