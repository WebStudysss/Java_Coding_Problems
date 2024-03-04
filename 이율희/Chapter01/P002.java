public class P002 {
    String str;

    public P002 (String str) {
        this.str = str;
    }

    private String checkNonRepeatLetter() {
        
        char c = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            if(c != str.charAt(i)) {
                return String.valueOf(str.charAt(i));
            }
        }

        return "NONE";
    }

    public void printNoneRepeatLetter() {
        System.out.println(checkNonRepeatLetter());
    }
}
