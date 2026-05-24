class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        char[] alphArr = new char[26];
        for(int i=0; i<s.length(); i++){
            alphArr[s.charAt(i)-'a']++;
        }
        for(int i=0; i<t.length(); i++){
            alphArr[t.charAt(i)-'a']--;
        }
        for(int i=0; i<26;i++)
            if(alphArr[i]!=0)
                return false;

        return true;
    }
}
