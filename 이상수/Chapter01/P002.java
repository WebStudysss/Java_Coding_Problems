public class P002 {
    private String inputString;
    private String filterString;
    public char solution(String s){
        this.inputString = s;

        filterString = filterString(inputString);
//        String pairCharDeletedString = pairCharDeleting(filterString);

        Character answer = null;

        boolean flag = false;
        for(int i = 0; i < filterString.length()-1; i++){
            char c = filterString.charAt(i);
            for(int j = i+1; j <filterString.length(); j++){
                if(c == filterString.charAt(j)){
                    flag = true;
                }
                //정답 character
            }
            if(flag){
                flag = false;
                continue;
            }
            return c;
        }

        return answer == null ? '0' : answer;
    }

    private String filterString(String prevFilterString){
        return prevFilterString.replaceAll("^[a-zA-z]", "");
    }

//    private String pairCharDeleting(String filteredString){
//        Map<Character, Stack<Integer>> characterMap = new HashMap<>();
//
//        StringBuffer sb = new StringBuffer(filteredString);
//        for(int i = sb.length()-1; i >= 0; i--){
//            Character c = sb.charAt(i);
//            Stack<Integer> characterIndexStack = characterMap.getOrDefault(c, new Stack<>());
//            if(characterIndexStack.isEmpty()){
//                characterIndexStack.add(i);
//                characterMap.put(c, characterIndexStack);//나중에 이거 필요없는지 필요한지 체크가필요할듯 아마 필요없을거같긴함
//                continue;
//            }
//            characterIndexStack.pop();
//            sb.deleteCharAt(findPrevCharIndex());
//            sb.deleteCharAt(i);
//        }
//
//        System.out.println(sb);
//
//        return "";
//    }
//
//    private int findPrevCharIndex(StringBuffer sb, Character c){
//        for(int i = sb.length()-1; i >= 0; i--){
//            if(sb.charAt(i) == c){
//                return i;
//            }
//        }
//        return 0;
//    }
}
