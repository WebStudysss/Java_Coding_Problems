import java.util.OptionalInt;

public class P004 {
    public boolean solution(String s){

        OptionalInt any = s.chars().filter(this::isNotDigit).findAny();
        
        //숫자만 있으면 true
        return any.isEmpty();
    }

    private boolean isNotDigit(int c){
        return !Character.isDigit(c);
    }
}
