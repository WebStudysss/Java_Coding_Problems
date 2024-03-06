public class P003 {

    String str;
    String flipStr;

    public P003(String str) {
        this.str = str;
    }

    private String flipLetter (String word) {

        int letterIndex = word.length() - 1;

        StringBuilder sb = new StringBuilder();

        for (int i = letterIndex; i >= 0; i--) {
            sb.append(word.charAt(i));
        }

        return sb.toString();
    }

    private String flipWord () {

        String[] splitString = str.split(" ");
        StringBuilder sb = new StringBuilder();
        int wordIndex = splitString.length - 1;

        for(int i = wordIndex; i >= 0; i--) {
            sb.append(flipLetter(splitString[i]));
            sb.append(" ");
        }

        return sb.toString();
    }

    public void printFlipWordAndLetter() {
        System.out.println(flipWord());
    }
}
