class Solution {

    private String createHash(String str){
        char[] alph = new char[26];
        for(int i=0; i<str.length(); i++){
            alph[str.charAt(i)-'a']++;
        }
        return String.valueOf(alph);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str: strs){
            String code = createHash(str);
            if(!map.containsKey(code)){
                map.put(code, new ArrayList<String>());
            }
            map.get(code).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
