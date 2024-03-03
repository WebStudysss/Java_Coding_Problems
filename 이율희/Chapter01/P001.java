import java.util.HashMap;
import java.util.Map;

public class C01_001 {

    // 문자열의 공백 제거, 대/소문자 통일해서 count

    String str;
    Map<Character, Integer> countMap;

    public C01_001 ( String str ) {
        this.str = str.replaceAll(" ", "").toLowerCase();
        this.countMap = new HashMap<>();
    }

    public void countWithoutBlank () {
        for( char c : str.toCharArray()) {
            countMap.put( c, countMap.getOrDefault(c, 0) + 1 );
        }
    }

    public void printCountLetter() {
        countWithoutBlank();
        System.out.println(countMap.toString());
    }
}
