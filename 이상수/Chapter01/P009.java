import java.util.Arrays;
import java.util.stream.Collectors;

public class P009 {

    public String solution(char c, String... stringArray) {
        String newString1 = Arrays.stream(stringArray).collect(Collectors.joining(Character.toString(c)));

        StringBuffer newString2 = Arrays.stream(stringArray)
                .collect(StringBuffer::new, (sb, element) -> sb.append(element).append(c), StringBuffer::append);

        if (newString2.length() > 0) {
            newString2.deleteCharAt(newString2.length() - 1); // 마지막 문자 제거
        }

        return newString2.toString();
    }
}
