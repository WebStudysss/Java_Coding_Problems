import java.util.HashMap;
import java.util.Map;

public class P002 {
    String str;
    Map<Character, Integer> countStrMap;

    public P002 (String str) {
        this.str = str;
        countStrMap = new HashMap<>();
        countLetter();
    }

    // 반복이 한 번도 안 되는 경우 : abcd
    // 중간 글자가 반복되는 경우 : abcccd
    // 반복되는 글자가 많은 경우 : aaabbbcccd
    // 반복 안 되는 글자가 하나도 없는 경우 : aaabbbcccddd

    private void countLetter() {

        // 개수 count
        for (char c : str.toCharArray()) {
            countStrMap.put(c, countStrMap.getOrDefault(c, 0) + 1 );
        }
    }

    private String checkNonRepeatLetter() {

        Character repeatLetter = null;
        char nowLetter;

        for(int i = 0; i < str.length(); i++) {
            nowLetter = str.charAt(i);

            if(repeatLetter != null && countStrMap.get(nowLetter) == 1) {
                return String.valueOf(nowLetter);
            }

            if (countStrMap.get(nowLetter) > 1) {
                repeatLetter = nowLetter;
            }
        }

        return "NONE";
    }

    public void printNoneRepeatLetter() {
        System.out.println(checkNonRepeatLetter());
    }
}
