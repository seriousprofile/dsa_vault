//HINT: COLLECTIONS!! or you can just use stringbuilder. 

class Solution {
    public String reverseWords(String s) {
        String[] split_words = s.trim().split("\\s+");
        List<String> list = Arrays.asList(split_words);

        Collections.reverse(list);

        return String.join(" ", list);
    }
}
