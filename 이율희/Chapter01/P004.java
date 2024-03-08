public class P004 {
    String str;

    public P004(String str) {
        this.str = str;
    }

    private boolean isOnlyNumber () {

        for(char c : str.replace(" ", "").toCharArray()) {
            if ( !(c > 47 && c < 58)) {
                return false;
            } 
        }

        return true;
    }

    public void printIsOnlyNumber() {
        String result = isOnlyNumber() ? "Only Number" : "Contains Non Number";
        
        System.out.println(result);
    }
}
