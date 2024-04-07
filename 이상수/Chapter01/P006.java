public class P006 {

    public String solution(String s, char c) {

        long result1 = s.chars().reduce(0, (int count, int character) -> {
            if (c == character) return count + 1;
            else return count;
        });

        long result2 = s.chars()
                .filter(ch -> ch == c)
                .count();

        System.out.println(result1 +" "+ result2);

        return s;
    }
}
