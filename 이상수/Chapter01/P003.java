import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class P003 {

    public String solution(String s) {
        StringTokenizer st = new StringTokenizer(s);

        StringBuffer sb = new StringBuffer();
        ArrayList<String> al = new ArrayList<>();
        while (st.hasMoreTokens()) {
            sb = new StringBuffer();
            al.add(sb.append(st.nextToken()).reverse().append(" ").toString());
        }

        sb = new StringBuffer();
        for(String alString : al){
            sb.append(alString);
        }

        String firstString = sb.toString();

        st = new StringTokenizer(s);

        sb = new StringBuffer();
        Stack<String> stack = new Stack<>();
        while (st.hasMoreTokens()) {
            stack.push(st.nextToken());
        }

        al = new ArrayList<>();
        while (!stack.isEmpty()) {
            sb = new StringBuffer();
            al.add(sb.append(stack.pop()).reverse().append(" ").toString());
        }

        sb = new StringBuffer();
        for(String alString : al){
            sb.append(alString);
        }

        String secondString = sb.toString();

        return firstString +
                System.lineSeparator() +
                secondString;
    }

}
