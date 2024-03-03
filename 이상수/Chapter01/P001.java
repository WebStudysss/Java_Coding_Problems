public class P001 {
    public void solution(String s){
        s = s.toLowerCase();
        s = regexFilter(s);
        int[] charMapArray = new int[26];

        s.chars().forEach(c -> charMapArray[c-'a']++);

        for(int i = 0; i < 26; i++){
            System.out.println((char)('a' + i) + "의 수 : " + charMapArray[i]);
        }
    }

    private String regexFilter(String s){
        s = s.replaceAll("[^a-z]", "");
        return s;
    }
}
