public class P005 {

    public String solution(String s){

        String filteredString = filterString(s.toLowerCase());

        Long count = filteredString.chars().filter(this::isGather).count();

        System.out.println();
        return String.format(
                "Consonant : %d\nGather : %d\n",
                filteredString.length() - count, count
        );
    }

    private String filterString(String notFilteredString){
        return notFilteredString.replaceAll("[^a-z^A-Z]", "");
    }

    private boolean isGather(Integer c){
        switch (c){
            case (int)'a', (int)'e', (int)'i',(int) 'o', (int)'u' :
                return true;
        }
        return false;
    }

}
