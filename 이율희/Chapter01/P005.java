public class P005 {

    String str;
    int countConsonant = 0;
    int countVowel = 0;

    public P005 (String str) {
        this.str = str.replace(" ", "").replaceAll("[^a-zA-Z]", "").toLowerCase();
        countIsConsonantVowel();
    }

    private void countIsConsonantVowel() {
        for(char c : str.toCharArray()) {
            if ( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ) {
                ++countVowel;
            } else {
                ++countConsonant;
            }
        }
    }

    public void printCountConsonantVowel() {
        System.out.println("자음 : " + countConsonant + " 모음 : " + countVowel);
    }
}
