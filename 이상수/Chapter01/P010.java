public class P010 {

    static boolean check[];
    static String globalString;

    public String solution(String s) {
        globalString = s;
        check = new boolean[s.length()];

        recusion(0, "");

        return "";
    }

    private void recusion(int count, String s){
        if(count == globalString.length()){
            System.out.println(s);
            return;
        }

        for(int i = 0; i < globalString.length(); i++){
            if(!check[i]) {
                check[i] = true;
                recusion(count + 1, s + globalString.charAt(i));
                check[i] = false;
            }
        }

    }
}
