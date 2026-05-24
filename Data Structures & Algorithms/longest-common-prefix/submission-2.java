class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        int i;
        while(prefix.length()>0){
            for(i=0; i<strs.length; i++){
                while(!strs[i].startsWith(prefix) && prefix.length()>0){
                    prefix = prefix.substring(0, prefix.length() - 1);
                }
            }
            if(i==strs.length)
                break;
        }
        return prefix;
    }
}